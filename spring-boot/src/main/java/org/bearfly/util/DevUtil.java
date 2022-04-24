package org.bearfly.util;

import lombok.Data;

/**
 * @author bearfly1990
 * @date 2022/4/17
 */
@Data
public class DevUtil {
    public static String traceStr(String... strValues ){
        StringBuilder result = new StringBuilder("************");
        for (String str : strValues){
            result.append("/").append(str);
        }
        return result.toString();
    }
}
