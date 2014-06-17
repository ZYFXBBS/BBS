<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
<%
response.addHeader("X-UA-Compatible", "IE=EmulateIE9");
%>
<%@ include file="/header/header.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>消息管理</title>
<!--[if lt IE 9]>
    <script src="<%=contextPath %>/js/mmGrid/vendor/html5shiv.js"></script>
<![endif]-->
<script type="text/javascript">
$(function(){
	
	});
	
function saveMember(){
	var url = "<%=contextPath%>/teeAddressController/addAddress.do";
	var para =  $.FJ($("#form1")) ;
	var jsonRs = $.AF(url,para);
	if(jsonRs.rtState){
		// top.$.jBox.tip("保存成功！");
	}else{
		alert(jsonRs.rtMsg);
	}
}
</script>
</head>
<body>
 <legend>会员注册</legend>
	<form  method="post" name="form1" id="form1" >
<table width="60%" align="center">
   <tr>
    <td nowrap  width="120">姓名：</td>
    <td nowrap  align="left">
        <input type='text' name="memberName"   maxlength="50"  size="20" required="true" />
    </td>
   </tr>
   <tr>
    <td nowrap  width="120">真实姓名：</td>
    <td nowrap  align="left">
        <input type='text' name="memberRealName"   maxlength="50"  size="20" required="true" />
    </td>
   </tr>
   <tr>
    <td nowrap  width="120">性别：</td>
    <td nowrap  align="left">
       <select id="sex" name="sex" class="BigSelect">
       			<option value="0">男</option>
       		    <option value="1">女</option>
       </select>
    </td>
   </tr>
   <tr>
		<td nowrap  width="120">邮箱：</td>
		<td nowrap  >
		<input type="text" name="email" id="email" size="26" placeholder="邮箱" />
		</td>
	</tr>
   <tr>
		<td nowrap  width="120">手机：</td>
		<td nowrap  >
		<input type='text' name="mobile"   maxlength="50"  size="20"  />
		</td>
	</tr>
	
	<tr>
		<td nowrap  width="120">家庭电话：</td>
		<td nowrap  >
		<input type='text' name="homephone"   maxlength="50"  size="20"  />
		</td>
	</tr>
	<tr>
		<td nowrap  width="120">qq：</td>
		<td nowrap  >
		<input type='text' name="qq"   maxlength="50"  size="20"  />
		</td>
	</tr>
	<tr>
		<td nowrap  width="120">地址：</td>
		<td nowrap  >
		<input type='text' name="address"   maxlength="50"  size="20"  />
		</td>
	</tr>
	<tr>
		<td nowrap  width="120">邮编：</td>
		<td nowrap  >
		<input type='text' name="postCode"   maxlength="50"  size="20"  />
		</td>
	</tr>
	 <tr>
	    <td nowrap  class="TableControl" colspan="2" align="center">
	    <div style="" align="center">
	    	 <input type="button" value="注册" class="btn btn-primary" title="注册" onclick="doSave()" >&nbsp;&nbsp;
	        <input type="button" value="返回" class="btn btn-primary" title="返回" onClick="history.go(-1);">
	    </div>
	    </td>
   </tr>
</table>
  </form>
</body>
</html>

