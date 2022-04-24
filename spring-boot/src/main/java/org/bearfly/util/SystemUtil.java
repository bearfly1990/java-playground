package org.bearfly.util;

/**
 * @author bearfly1990
 * @date 2022/4/18
 */
public class SystemUtil {
    public static void sleep(double seconds){
        try {
            Thread.sleep(Math.round(seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
