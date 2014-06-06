<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8"%>
<%
  String contextPath = request.getContextPath();
  if (contextPath.equals("")) {
    contextPath = "/GourmetWebsite";
  }
  String imgPath = contextPath + "/inc/css/admin/images";
%>
<script type="text/javascript">
/** 变量定义 **/
var contextPath = "<%=contextPath %>";
var imgPath = "<%=imgPath %>";
</script>