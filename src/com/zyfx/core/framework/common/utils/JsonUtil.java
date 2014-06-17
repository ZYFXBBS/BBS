package com.zyfx.core.framework.common.utils;


import java.util.Date;
import java.util.Map;

import org.codehaus.jackson.Version;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.module.SimpleModule;

import com.umessage.htrip.dal.member.util.CustomJsonDateDeserializer;

public class JsonUtil {
	
	/**
	 * 获取json和java对象互相转换的工具类
	 * @return
	 */
	public static ObjectMapper getObjectMapperInstance(){
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);//忽略不匹配的属性
		SimpleModule simpleModule = new SimpleModule("SimpleModule", new Version(1, 0, 0, null));
        simpleModule.addDeserializer(Date.class, new CustomJsonDateDeserializer());
        objectMapper.registerModule(simpleModule);
        return objectMapper;
	}
	
	public static Map tranJsonRes2Map(String jsonRes){
		Map<Object, Object> result = null;
		try {
			result = getObjectMapperInstance().readValue(jsonRes,Map.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}
}