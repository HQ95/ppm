package com.turing.ppm.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@MapperScan("com.turing.ppm.mapper")
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/register").setViewName("register");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/leftRequire").setViewName("leftRequire");
        registry.addViewController("/mainRequire").setViewName("mainRequire");
        registry.addViewController("/bar").setViewName("bar");
        registry.addViewController("/supplyman/ProviderContract").setViewName("supplyman/ProviderContract");
        registry.addViewController("/supplyman/proSelect").setViewName("supplyman/proSelect");
        registry.addViewController("/supplyman/category").setViewName("supplyman/category");
        registry.addViewController("/supplyman/Project_list").setViewName("supplyman/Project_list");
        registry.addViewController("/supplyman/quoteUpdate").setViewName("supplyman/quoteUpdate");
    }
}
