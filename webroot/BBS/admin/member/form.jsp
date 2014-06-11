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
</script>
</head>
<body>
	 <div class="wrap">
        <form class="main form-horizontal" onsubmit="return check()" action="main/active"
        onsubmit="return check();">
        <fieldset>
            <legend>企业信用信息平台开通</legend>
            <div class="control-group">
                <label class="control-label">
                    密码</label>
                <div class="controls">
                    <input id="pwd" name="pwd" type="password" placeholder="必填项" class="input-xlarge"
                        required onchange="checkPasswords()">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">
                    确认密码</label>
                <div class="controls">
                    <input id="pwd1" name="pwd1" type="password" placeholder="必填项" class="input-xlarge"
                        required onchange="checkPasswords()">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">
                    单位名称</label>
                <div class="controls">
                    <input name="dept" type="text" placeholder="必填项，单位全称" class="input-xlarge" required>
                </div>
            </div>
            <legend>管理员信息</legend>
            <div class="control-group">
                <label class="control-label">
                    性别</label>
                <div class="controls">
                    <label class="radio">
                        <input type="radio" value="男" name="sex" checked="checked">
                        男
                    </label>
                    <label class="radio">
                        <input type="radio" value="女" name="sex">
                        女
                    </label>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">
                    姓名</label>
                <div class="controls">
                    <input name="name" type="text" placeholder="必填项，实名" class="input-xlarge" required>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">办公电话</label>
                <div class="controls">
                    <input name="tel" type="text" placeholder="必填项" class="input-xlarge" required>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="input01"> 移动电话</label>
                <div class="controls">
                    <input name="phone" type="text" placeholder="必填项" class="input-xlarge" required>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">
                    邮箱</label>
                <div class="controls">
                    <input name="email" type="text" placeholder="必填项" class="input-xlarge" required pattern="^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$"
                        title="邮箱正确格式：xxx@xxx.xxx">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">
                    地址</label>
                <div class="controls">
                    <input name="addr" type="text" placeholder="必填项" class="input-xlarge" required>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">
                </label>
                <div class="controls">
                    <button class="btn" type="submit" id="ok">
                        开 通</button>
                    <button class="btn" type="reset">
                        重 置</button>
                </div>
            </div>
        </fieldset>
        </form>
    </div>
    <script>
        function checkPasswords() {
        	alert(11);
            var passl = document.getElementById("pwd");
            var pass2 = document.getElementById("pwd1");
            if (passl.value != pass2.value)
                passl.setCustomValidity("两次密码必须输入一致！");
            else
                passl.setCustomValidity('');
        }

        function check() {
            document.getElementById('ok').disabled = 'disabled';
        }
    </script>
</body>
</html>

