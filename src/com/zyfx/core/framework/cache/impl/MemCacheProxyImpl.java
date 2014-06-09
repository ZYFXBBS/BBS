package com.zyfx.core.framework.cache.impl;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyfx.core.framework.cache.IBaseCacheProxy;
import com.whalin.MemCached.MemCachedClient;

@Service
public class MemCacheProxyImpl implements IBaseCacheProxy {

	@Autowired
	private MemCachedClient memCachedClient;

	@Override
	public Object get(String keyPrefix, String key) {
		if (key == null || "".equals(key))
			return null;

		String cacheKey = keyPrefix + "_" + key;

		Object o = memCachedClient.get(cacheKey);
		return o;
	}

	@Override
	public boolean set(String keyPrefix, String key, Object value, long timeout) {
		if (value == null)
			return false;

		String cacheKey = keyPrefix + "_" + key;

		Object temp = memCachedClient.get(cacheKey);
		if (temp == null) {
			return memCachedClient.add(cacheKey, value, new Date(timeout));
		} else {
			return memCachedClient.set(cacheKey, value, new Date(timeout));
		}
	}

	@Override
	public Map<String, Object> mget(String keyPrefix, String[] keys) {
		String[] cacheKeys = new String[keys.length];
		for (int i = 0; i < keys.length; i++) {
			String cacheKey = keyPrefix + "_" + keys[i];
			cacheKeys[i] = cacheKey;
		}
		return memCachedClient.getMulti(cacheKeys);
	}

	@Override
	public boolean mset(String keyPrefix, String[] keys, Object[] values, long timeout) {
		if (keys.length != values.length) {
			return false;
		}

		boolean result = false;
		// 保存对象数组
		for (int i = 0; i < keys.length; i++) {
			Object value = values[i];
			String key = keys[i];

			result = set(keyPrefix, key, value, timeout);
		}
		return result;
	}

}