package com.woniu.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 自定义类型转换器  将String 转换成  Date
 * Spring中的类型转换器Converter<原始类型, 目标类型>
 */
public class DateConverter implements Converter<String, Date>{

	@Override
	public Date convert(String str) {
		// 自定义日期规则
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //pattern 正则
		try {
			return sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
