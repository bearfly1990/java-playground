package org.bearfly.util;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author bearfly1990
 * @date 2022/4/17
 */
public class SecurityUtil {

    public static String decodePassword(String encodedStr){
        return new String(Base64.getDecoder().decode(encodedStr.getBytes()));
    }

    public static void main(String[] args) {
        byte[] output = Base64.getEncoder().encode("".getBytes(StandardCharsets.UTF_8));
        String newString = new String(output, StandardCharsets.UTF_8);
        System.out.println(newString);

        String decodeStr = new String(Base64.getDecoder().decode("".getBytes()));
        System.out.println(decodeStr);
    }

}
