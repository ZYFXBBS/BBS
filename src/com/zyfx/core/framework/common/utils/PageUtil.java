package com.zyfx.core.framework.common.utils;
import org.apache.log4j.Logger;

/**
 * <p>
 * 分页工具
 * </p>
 * 
 */
public class PageUtil {

    private static final Logger logger = Logger.getLogger(PageUtils.class);
//
//    public static Page createPage(ServletRequest request) {
//        Page page = createPage(request, null);
//        return page;
//    }
//
//    public static Page createPage(ServletRequest request, String actionUrl, String... attrs) {
//        Page page = new Page();
//        String pageSize = request.getParameter("pageSize");
//        String currentPage = request.getParameter("pageNo");
//
//        if (RegularUtil.regularNumber(pageSize, 9)) {// 字符长度1-9位
//            page.setPageSize(Integer.parseInt(pageSize));
//        }
//        if (RegularUtil.regularNumber(currentPage, 9)) {// 字符长度1-9位
//            page.setCurrentPage(Integer.parseInt(currentPage));
//        }
//        if (!(actionUrl == null || "".equals(actionUrl))) {
//            StringBuffer url = new StringBuffer(actionUrl);
//            url.append("?");
//            for (String attr : attrs) {
//                String attrVal = request.getParameter(attr);
//                logger.debug(attr + "=" + attrVal);
//                if (attrVal != null) {
//                    url.append(attr);
//                    url.append("=");
//                    url.append(attrVal);
//                    url.append("&");
//                }
//            }
//            page.setToUrl(url.toString());
//        }
//        return page;
//    }

    /**
     * 验证 page 是否为空 zhp 20140610 通过接口
     * @param page
     * @return
     */
    public static Page converPage(PageParameters para){
    	Page page = new Page();
    	String pageStr = para.getPage();
    	String limit = para.getLimit();
    	if(StringUtil.isNullOrEmpty(pageStr)){
    		page.setCurrentPage(1);
    	}else{
    		try {
				page.setCurrentPage(Integer.parseInt(pageStr));
			} catch (Exception e) {
				logger.error("转换 PageRequest Page参数错误. [page="+pageStr+"]",e);
				page.setCurrentPage(1);
			}
    	}
    	if(StringUtil.isNullOrEmpty(limit)){
    		page.setPageSize(10);
    	}else{
    		try {
				page.setPageSize(Integer.parseInt(limit));
			} catch (Exception e) {
				logger.error("转换 PageRequest Page参数错误. [PageSize="+limit+"]",e);
				page.setPageSize(10);
			}
    	}
    	
    	return page;
    }
    
    /**
     * 处理排序
     * @param para
     * @return
     */
    public static Object converPageOrder(PageParameters para){
    	if(null == para){
    		return null;
    	}
    	String sort = para.getSort();
    	if(!StringUtil.isNullOrEmpty(sort)){
    		String _order = null;
    		if(sort.indexOf(".") != -1){
    			_order = sort.substring(sort.lastIndexOf(".")+1, sort.length());
    			_order =_order.toLowerCase();
    			if(sort.endsWith("desc")){
        			sort = sort.substring(0, sort.length() - 5);
        		}else if(sort.endsWith("asc")){
        			sort = sort.substring(0, sort.length() - 4);
        		}
    		}
    		para.setSort(sort+"  "+_order);
    	}
    	return para;
    }
    public static void checkPage(Page page) {
        logger.debug("初始化总数" + page.totalCount);
        logger.debug("初始化页数" + page.currentPage);
        logger.debug(page.getTotalCount() / page.getPageSize());
        logger.debug(page.getPageSize());
        int countPage = getTotalPage(page);
        if (page.currentPage > countPage) {
            page.setCurrentPage(countPage - 1);
        } else if (page.currentPage < 1) {
            page.setCurrentPage(0);
        }
        logger.debug("页数" + page.currentPage);
    }

    /**
     * <p>
     * 获取总页数
     * <p/>
     * 
     * @param page
     * @return
     */
    public static int getTotalPage(Page page) {
        int countPage = 0;
        if (page.getTotalCount()> 0) {
            if (page.getTotalCount()% page.getPageSize() == 0) {
                countPage = page.getTotalCount()/ page.getPageSize();
            } else {
                countPage = page.getTotalCount() / page.getPageSize() + 1;
            }
        }
        return countPage;
    }

    /**
     * <p>
     * 直接生成分页String
     * <p/>
     * 
     * @param page
     * @return
     */
    public static String getPageStr(Page page) {
        int totalResult = page.getTotalCount();
        int currentPage = page.getCurrentPage();
        int totalPage = page.getTotalPage();
        boolean entityOrField = false;
        StringBuffer sb = new StringBuffer();
        if (totalResult > 0) {
            sb.append(" <ul>\n");
            if (currentPage == 1) {
                sb.append(" <li class=\"pageinfo\">首页</li>\n");
                sb.append(" <li class=\"pageinfo\">上页</li>\n");
            } else {
                sb.append(" <li><a href=\"#\" onclick=\"nextPage(1)\">首页</a></li>\n");
                sb.append(" <li><a href=\"#\" onclick=\"nextPage(" + (currentPage - 1) + ")\">上页</a></li>\n");
            }
            int showTag = 3; // 分页标签显示数量
            int startTag = 1;
            if (currentPage >= showTag) {
                startTag = currentPage - 1;
            }
            int endTag = startTag + showTag - 1;
            for (int i = startTag; i <= totalPage && i <= endTag; i++) {
                if (currentPage == i)
                    sb.append("<li class=\"current\">" + i + "</li>\n");
                else
                    sb.append(" <li><a href=\"#\" onclick=\"nextPage(" + i + ")\">" + i + "</a></li>\n");
            }
            if (currentPage == totalPage) {
                sb.append(" <li class=\"pageinfo\">下页</li>\n");
                sb.append(" <li class=\"pageinfo\">尾页</li>\n");
            } else {
                sb.append(" <li><a href=\"#\" onclick=\"nextPage(" + (currentPage + 1) + ")\">下页</a></li>\n");
                sb.append(" <li><a href=\"#\" onclick=\"nextPage(" + totalPage + ")\">尾页</a></li>\n");
            }
            sb.append(" <li class=\"pageinfo\">第" + currentPage + "页</li>\n");
            sb.append(" <li class=\"pageinfo\">共" + totalPage + "页</li>\n");
            sb.append("</ul>\n");
            sb.append("<script type=\"text/javascript\">\n");
            sb.append("function nextPage(page){");
            sb.append(" if(true && document.forms[0]){\n");
            sb.append("     var url = document.forms[0].getAttribute(\"action\");\n");
            sb.append("     if(url.indexOf('?')>-1){url += \"&" + (entityOrField ? "pageNo" : "pageNo") + "=\";}\n");
            sb.append("     else{url += \"?" + (entityOrField ? "pageNo" : "pageNo") + "=\";}\n");
            sb.append("     document.forms[0].action = url+page;\n");
            sb.append("     document.forms[0].submit();\n");
            sb.append(" }else{\n");
            sb.append("     var url = document.location+'';\n");
            sb.append("     if(url.indexOf('?')>-1){\n");
            sb.append("         if(url.indexOf('pageNo')>-1){\n");
            sb.append("             var reg = /pageNo=\\d*/g;\n");
            sb.append("             url = url.replace(reg,'pageNo=');\n");
            sb.append("         }else{\n");
            sb.append("             url += \"&" + (entityOrField ? "pageNo" : "pageNo") + "=\";\n");
            sb.append("         }\n");
            sb.append("     }else{url += \"?" + (entityOrField ? "pageNo" : "pageNo") + "=\";}\n");
            sb.append("     document.location = url + page;\n");
            sb.append(" }\n");
            sb.append("}\n");
            sb.append("</script>\n");
        }
        String pageStr = sb.toString();
        return pageStr;
    }
}
