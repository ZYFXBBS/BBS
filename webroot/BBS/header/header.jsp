<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8"%>
<%
  String contextPath = request.getContextPath();
  if (contextPath.equals("")) {
    contextPath = "/BBS";
  }
  String imgPath = contextPath + "/inc/css/admin/images";
%>
<!-- jbox 样式-->
<link id="skin" rel="stylesheet" href="<%=contextPath %>/js/jBox/Skins/Default/jbox.css" />
<!--bootstrap 样式-->
<link rel="stylesheet" type="text/css" href="<%=contextPath %>/css/common/bootstrap-responsive.min.css">
<link rel="stylesheet" type="text/css" href="<%=contextPath %>/css/common/bootstrap.min.css">

<link rel="stylesheet" type="text/css" href="<%=contextPath %>/css/common/bbs.css">
<script src="<%=contextPath %>/js/common/jquery-min.js"></script>
<!--bootstrap 类库引入-->
<script src="<%=contextPath %>/js/common/bootstrap.min.js"></script>
<!--jquery  layout 布局 引入-->
<script type="text/javascript" src="<%=contextPath %>/js/jqueryLayout/jquery.layout-latest.js"></script>
<!-- jbox 类库 引入 -->
<script type="text/javascript" src="<%=contextPath %>/js/jBox/jquery.jBox-2.3.min.js"></script>
<script type="text/javascript" src="<%=contextPath %>/js/jBox/i18n/jquery.jBox-zh-CN.js"></script>
<!-- bbs 类库 引入 -->
<script src="<%=contextPath %>/js/common/bbscommon.js"></script>
<script type="text/javascript">
/** 变量定义 **/
var contextPath = "<%=contextPath %>";
var imgPath = "<%=imgPath %>";
</script>