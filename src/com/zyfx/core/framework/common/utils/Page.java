package com.zyfx.core.framework.common.utils;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

/**
 * 分页信息 第一页从1开始
 * 
 * @author zhp
 * @created 2013-05-27
 */
public class Page extends RowBounds implements Serializable {
    protected List<?> result;
    protected int pageSize = 10;
    protected int currentPage = 1;
    protected int totalCount = 0;

    public Page() {
    }

    public Page(int pageSize, int currentPage) {
        this.pageSize = pageSize;
        this.currentPage = currentPage;
    }

    /**
     * @param result
     *          返回数据list
     * @param pageSize
     *          每页条数
     * @param pageNumber
     *          页码（单前页码）
     * @param totalCount
     *          总条数
     * @param toUrl
     *          跳转的URL
     */
    public Page(List<?> result, int pageSize, int currentPage, int totalCount, String toUrl) {
        this.result = result;
        this.pageSize = pageSize;
        this.currentPage = currentPage;
        this.totalCount = totalCount;
    }

    public List<?> getResult() {
        return result;
    }

    public void setResult(List<?> result) {
        this.result = result;
    }

    public int getPageSize() {
        return pageSize;
    }

    /**
     * <p>
     * 每一页的条数，默认10条
     * <p/>
     * 
     * @author
     * @param pageSize
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        PageUtil.checkPage(this);
        return currentPage;
    }

    /**
     * <p>
     * 当前第几页，默认为1，从第一页开始
     * <p/>
     * 
     * @author
     * @param pageNumber
     */
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	/**
     * <p>
     * 获取总页数
     * <p/>
     * @author 
     * @param page
     * @return
     */
    public int getTotalPage() {
        return PageUtil.getTotalPage(this);
    }
    /**
     * 这个先注释掉 里面方法可用 但是现在不需要用
     * <p>直接生成分页代码<p/>
     * @author 
     * @return
     */ 
//    public String getPageStr() {
//        return PageUtil.getPageStr(this);
//    }
    
 
}
