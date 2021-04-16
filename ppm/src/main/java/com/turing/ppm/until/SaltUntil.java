package com.turing.ppm.until;

import java.util.Random;

/**
 * 随机获取盐值
 */
public class SaltUntil {
    public static Random r=new Random();
    public static String getSalt(int count){
        StringBuilder str=new StringBuilder();
        char [] c="QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm0123456789!@#$%^&*<>?".toCharArray();
        for (int i=0;i<count;i++) {
            char ch = c[r.nextInt(c.length)];
            str.append(ch);
        }
        return str.toString();
    }

}
