package com.mlz.config.beetl;

import org.beetl.core.Format;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 * 自定义字符串日期转换
 */
public class DateDefenderFormat implements Format {
    @Override
    public Object format(Object data, String pattern) {
        if (data == null){
            return null;
        }
        if (data instanceof LocalDateTime){
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            return dateTimeFormatter.format((LocalDateTime)data);
        }
        return null;
    }
}
