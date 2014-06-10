package com.zyfx.core.framework.common.utils;

public interface PageParameters {
	public String getPage();
	public String getLimit();
	public String getSort();
	public String getOrder();
	public void setSort(String sort);
}
