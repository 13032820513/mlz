package com.mlz.util;

import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Component
public class Md5Util {
    
    /** 
    * @Description: 获取字符串的MD5加密字符串
    * @Param: [input] 
    * @return: java.lang.String 
    * @Author: Mr.Zhu 
    * @Date: 2019/1/25 
    */ 
    public static String getMd5String(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        try {
            MessageDigest md5 = MessageDigest.getInstance("md5");
            byte[] arr = md5.digest(input.getBytes(StandardCharsets.UTF_8));
            String sign = toHex(arr).toLowerCase();
            return sign;
        } catch (NoSuchAlgorithmException ex) {
            
        }
        return "";
    }

    private static String toHex(byte[] bytes) {
        final char[] hexDigits = "0123456789ABCDEF".toCharArray();
        StringBuilder ret = new StringBuilder(bytes.length * 2);
        for (int i = 0; i < bytes.length; i++) {
            ret.append(hexDigits[(bytes[i] >> 4) & 0x0f]);
            ret.append(hexDigits[bytes[i] & 0x0f]);
        }
        return ret.toString();
    }
}
