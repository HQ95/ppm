package com.turing.ppm.controller;

import com.turing.ppm.entity.*;
import com.turing.ppm.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 供应商
 */
@Controller
@RequestMapping("/supplier")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;
    @Autowired
    private SysUsersService sysUsersService;
    @Autowired
    private MaterialService materialService;
    @Autowired
    private SuppMaterialService suppMaterialService;
    @Autowired
    private MaterialTypeService materialTypeService;
    @Autowired
    private QuoteService quoteService;
    @Autowired
    private QuoteDetailService quoteDetailService;


    /**
     * 储存供应商的会话
     * @param session
     */
    public void setSession(HttpSession session){
        //获取登录的用户序号
        SysUsers user = (SysUsers) session.getAttribute("user");
        Supplier supplier = supplierService.selectByName(user.getId());
        session.setAttribute("supplier", supplier);
    }

    /**
     * 查看供应商信息
     * @return
     */
    @GetMapping("/info")
    public String selectSupplier(HttpSession session) {
        setSession(session);
        return "/supplyman/jiffprov_look";
    }

    /**
     * 修改登录密码
     * @param loginId
     * @param password
     * @param repass
     * @return
     */
    @PostMapping("/updPass")
    @ResponseBody
    public int updPass(String loginId,String password,String repass){
        return sysUsersService.updPass(loginId, password, repass);
    }

    /**
     * 获取产品类别下拉框
     * @return
     */
    @PostMapping("/type")
    @ResponseBody
    public List<MaterialType> selectType(){
        return materialTypeService.selectType();
    }

    /**
     * 获取供应商的物资（产品）
     * @return
     */
    @PostMapping("/material")
    @ResponseBody
    public DataGrid selectMaterial(HttpSession session, String mid, String name, String sort, String order, @RequestParam(value = "page",defaultValue="1")Integer pageNum, @RequestParam(value="rows",defaultValue="5")Integer pageSize){
        //获取登录的用户序号
        SysUsers user = (SysUsers) session.getAttribute("user");
        return materialService.selectList(user.getId(),"%"+mid+"%","%"+name+"%",sort, order,(pageNum-1)*pageSize, pageSize);
    }
    /**
     * 添加产品信息
     * @param material
     * @return
     */
    @PostMapping("/addMaterial")
    @ResponseBody
    public int addMaterial(Material material,HttpSession session){
        int num=materialService.addMaterial(material);
        //获取添加的id
        int id=material.getId();
        //获取储存的供应商session
        if(session.getAttribute("supplier")==null){
            setSession(session);
        }
        Supplier supplier = (Supplier) session.getAttribute("supplier");
        SuppMaterial sm = new SuppMaterial();
        sm.setMaterialId(id);
        sm.setSupplierId(supplier.getId());
        suppMaterialService.addSm(sm);
        return num ;
    }

    /**
     * 修改产品信息
     * @param material
     * @return
     */
    @PostMapping("/updMaterial")
    @ResponseBody
    public int updMaterial(Material material){
        return materialService.updateMaterial(material);
    }

    /**
     * 删除产品信息
     * @param ids
     * @return
     */
    @PostMapping("/delMaterial")
    @ResponseBody
    public int delMaterial(String [] ids){
        return  materialService.deleteMaterial(ids);
    }


    /**
     * 获取商品类别分页（产品）
     * @return
     */
    @PostMapping("/materialType")
    @ResponseBody
    public DataGrid selectMaterial(Integer id, String type,@RequestParam(value = "page",defaultValue="1")Integer pageNum, @RequestParam(value="rows",defaultValue="5")Integer pageSize){
        return materialTypeService.selectPage(id,"%"+type+"%",(pageNum-1)*pageSize, pageSize);
    }
    /**
     * 添加产品类别
     * @return
     */
    @PostMapping("/addType")
    @ResponseBody
    public int addType(MaterialType type){
        return  materialTypeService.addType(type);
    }

    /**
     * 修改产品类别
     * @return
     */
    @PostMapping("/updType")
    @ResponseBody
    public int updType(MaterialType type){
        return  materialTypeService.updType(type);
    }

    /**
     * 删除产品类别
     * @return
     */
    @PostMapping("/delType")
    @ResponseBody
    public int delType(Integer id){
        List<Material> materials = materialService.selectByType(id);
        if(materials.size()>0){
            return -1;
        }
        return  materialTypeService.deleteType(id);
    }

    /**
     * 获取报价书
     * @return
     */
    @PostMapping("/quote")
    @ResponseBody
    public DataGrid selectQuote(HttpSession session,String title, String eTitle,@RequestParam(value = "page",defaultValue="1")Integer pageNum, @RequestParam(value="rows",defaultValue="5")Integer pageSize){
        //获取储存的供应商session
        if(session.getAttribute("supplier")==null){
            setSession(session);
        }
        Supplier supplier = (Supplier) session.getAttribute("supplier");
        return quoteService.selectList(supplier.getId(), "%"+title+"%","%"+ eTitle+"%", (pageNum-1)*pageSize, pageSize);
    }

    /**
     * 批量删除报价
     * @param ids
     * @return
     */
    @PostMapping("/delQuote")
    @ResponseBody
    public int updQuote(String [] ids){
        return quoteService.delQuote(ids);
    }

    /**
     * 查询报价明细表
     * @param id
     * @param session
     */
    @GetMapping("/selDetail")
    public String selectDetail(Integer id,HttpSession session){
        QuoteDetail quoteDetail = quoteDetailService.selectById(id);
        session.setAttribute("quoteDetail",quoteDetail);
        return "supplyman/quoteUpdate";
    }




}
