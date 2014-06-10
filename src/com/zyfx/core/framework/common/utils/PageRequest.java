package com.zyfx.core.framework.common.utils;
/**
 * 主要为了 排序 和分页 
 * @author zhp
 *
 */
public class PageRequest {

	private String page = null; //这个是 currentPage
	private Integer limit = 10;// 这个是 pageSize
	private String sort = null;//排序字段
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	
}
