<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8"%>
<%
  String contextPath = request.getContextPath();
  if (contextPath.equals("")) {
    contextPath = "/GourmetWebsite";
  }
  String imgPath = contextPath + "/inc/css/admin/images";
%>
<link rel="stylesheet" type="text/css" href="<%=contextPath %>/css/common/bootstrap-responsive.min.css">
<link rel="stylesheet" type="text/css" href="<%=contextPath %>/css/common/bootstrap.min.css">
<script src="<%=contextPath %>/js/common/jquery.js"></script>
<script src="<%=contextPath %>/js/common/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=contextPath %>/js/jqueryLayout/jquery.layout-latest.js"></script>
<script type="text/javascript">
/** 变量定义 **/
var contextPath = "<%=contextPath %>";
var imgPath = "<%=imgPath %>";
</script>