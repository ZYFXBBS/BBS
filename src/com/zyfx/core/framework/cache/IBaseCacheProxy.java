package com.zyfx.core.framework.cache;

import java.util.Date;
import java.util.Map;

public interface IBaseCacheProxy {

	/**
	 * 从缓存获取数据对象
	 * 
	 * @param keyPrefix
	 *            主键前缀
	 * @param key
	 *            主键
	 * @return 数据对象
	 */
	public Object get(String keyPrefix, String key);

	/**
	 * 存储数据对象到缓存
	 * 
	 * @param keyPrefix
	 *            主键前缀
	 * @param key
	 *            主键
	 * @param value
	 *            数据对象
	 * @param timeout
	 *            缓存有效时间
	 * @return 结果
	 */
	public boolean set(String keyPrefix, String key, Object value, long timeout);

	/**
	 * 批量从缓存获取数据对象
	 * 
	 * @param keyPrefix
	 *            主键前缀
	 * @param keys
	 *            主键数组
	 * @return 数据对象map
	 */
	public Map<String, Object> mget(String keyPrefix, String[] keys);

	/**
	 * 批量存储数据对象到缓存
	 * 
	 * @param keyPrefix
	 *            主键前缀
	 * @param keys
	 *            主键数组
	 * @param values
	 *            数据对象数组
	 * @param timeout
	 *            缓存有效时间
	 * @return 结果
	 */
	public boolean mset(String keyPrefix, String[] keys, Object[] values, long timeout);
}
