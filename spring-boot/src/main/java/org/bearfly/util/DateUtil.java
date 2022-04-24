package org.bearfly.util;

import lombok.extern.log4j.Log4j2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author bearfly1990
 * @date 2022/4/17
 */
@Log4j2
public class DateUtil {
    public static final String DATE_FORMAT_FLAG = "yyyyMMddHHmmss";

    public static Date getCurrentDate(){
        return Calendar.getInstance().getTime();
    }
    public static String getCurrentDateStr(String format){
        return new SimpleDateFormat(format).format(getCurrentDate());
    }
    public static String getCurrentDateStr(){
       return getCurrentDateStr(DATE_FORMAT_FLAG);
    }
}
