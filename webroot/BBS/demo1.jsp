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
<!--jquery  layout 布局 引入-->
<script type="text/javascript" src="<%=contextPath %>/js/jqueryLayout/jquery.layout-latest.js"></script>
<style type="text/css">	
.bs-docs-sidenav.affix {top: 40px;	}	
/*  >表示第一个子元素  */
.bs-docs-sidenav > li:first-child > a {		-webkit-border-radius: 6px 6px 0 0;		-moz-border-radius: 6px 6px 0 0;		border-radius: 6px 6px 0 0;	}	
.bs-docs-sidenav > li > a {		display: block;		width: 190px \9;		margin: 0 0 -1px;		padding: 8px 14px;		border: 1px solid #e5e5e5;	}	
.bs-docs-sidenav {	
	width: 228px;		
	margin: 3px 0 0;		
	padding: 0;		
	background-color: #fff;		
	-webkit-border-radius: 6px;		
	-moz-border-radius: 6px;		
	border-radius: 6px;		
	-webkit-box-shadow: 0 1px 4px rgba(0,0,0,.065);		
	-moz-box-shadow: 0 1px 4px rgba(0,0,0,.065);		
	box-shadow: 0 1px 4px rgba(0,0,0,.065);	
}	
.bs-docs-sidenav .icon-chevron-right {		
float: right;		
margin-top: 2px;		
margin-right: -6px;		
opacity: .25;	
}	
</style>
<script>
	$(function(){
		$("body").layout(  
			{     
			    applyDefaultStyles: false,//应用默认样式  
			    north__size:50,//pane的大小  
			    spacing_open:0,//边框的间隙  
			    center: {
	                 spacing_open:            0
	            ,    closable:                false
	            ,    resizable:                false
	            }
			}  
		 );  
		 $(".ui-layout-north").css("z-index",2);
		});
	
	</script>
</head>
<body >
	 <div class="ui-layout-north" id="ui-layout-north">
	 		<div class="navbar">
				<div class="navbar-inner">
					<div class="container-fluid">
						 <a data-target=".navbar-responsive-collapse" data-toggle="collapse" class="btn btn-navbar"><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></a> <a href="#" class="brand">自由飞翔BBS</a>
						<div class="nav-collapse collapse navbar-responsive-collapse">
							<ul class="nav">
								<li class="active">
									<a href="#">主页</a>
								</li>
								<li>
									<a href="#">会员</a>
								</li>
								<li>
									<a href="#">文章</a>
								</li>
								<li class="dropdown">
									 <a data-toggle="dropdown" class="dropdown-toggle" href="#">下拉菜单<strong class="caret"></strong></a>
									<ul class="dropdown-menu">
										<li>
											<a href="#">下拉导航1</a>
										</li>
										<li>
											<a href="#">下拉导航2</a>
										</li>
										<li>
											<a href="#">其他</a>
										</li>
										<li class="divider">
										</li>
										<li class="nav-header">
											标签
										</li>
										<li>
											<a href="#">链接1</a>
										</li>
										<li>
											<a href="#">链接2</a>
										</li>
									</ul>
								</li>
								<li>
									<a href="<%=contextPath %>/admin/member/register.jsp">注册</a>
								</li>
							</ul>
							
						</div>
						
					</div>
				</div>
			</div>	
	 </div>
	<div class="ui-layout-center">
		<iframe id="rightList"  name="rightList" style="width:100%;height:100%" src="<%=contextPath %>/admin/member/index.jsp" scrolling="auto" frameborder="NO"></iframe>
	</div>
</body>
</html>

