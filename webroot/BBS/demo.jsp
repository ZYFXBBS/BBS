<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="/header/header.jsp" %> 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>demo</title>
<link rel="stylesheet" type="text/css" href="<%=contextPath %>/css/common/bootstrap-responsive.min.css">
<link rel="stylesheet" type="text/css" href="<%=contextPath %>/css/common/bootstrap.min.css">
<script src="<%=contextPath %>/js/common/jquery.js"></script>
<script src="<%=contextPath %>/js/common/bootstrap.min.js"></script>
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
<script type="text/javascript">	
	$(function() {		
		$('.nav li').click(function(e) {			
		$('.nav li').removeClass('active');			
		//$(e.target).addClass('active');			
		$(this).addClass('active');		
		});	
	});	
	</script>
</head>
<body >
	<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
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
							</ul>
							<ul class="nav pull-right">
								<li>
									<a href="#">右边链接</a>
								</li>
								<li class="divider-vertical">
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
										<li>
											<a href="#">链接3</a>
										</li>
									</ul>
								</li>
							</ul>
						</div>
						
					</div>
				</div>
				
			</div>
		</div>
	</div>
	<div class="row-fluid">
		<div class="span2">
			<div class=" sidebar-nav">

                       <ul class="nav nav-list bs-docs-sidenav affix-top">
						<li class="active">	<a href="#overview"><i class="icon-chevron-right"></i> 用户管理</a>	</li>	
						<li class="">	<a href="#transitions"><i class="icon-chevron-right"></i> 文章管理</a>	</li>	
						<li class="">	<a href="#modals"><i class="icon-chevron-right"></i> 评论管理</a>	</li>	
						<li class="">	<a href="#dropdowns"><i class="icon-chevron-right"></i> 板块管理</a>	</li>	
						<li>	<a href="#scrollspy"><i class="icon-chevron-right"></i> 积分管理</a>	</li>	
						<li class="">	<a href="#affix"><i class="icon-chevron-right"></i> 其他</a>	</li>	
						</ul>
                   </div>

		</div>
		<div class="span10">
			<div class="tabbable" id="tabs-739706">
				<ul class="nav nav-tabs">
					<li class="active">
						<a href="#panel-613973" data-toggle="tab">第一部分</a>
					</li>
					<li>
						<a href="#panel-208426" data-toggle="tab">第二部分</a>
					</li>
				</ul>
				<div class="tab-content">
					<div class="tab-pane active" id="panel-613973">
						<p>
							第一部分内容.
						</p>
					</div>
					<div class="tab-pane" id="panel-208426">
						<p>
							第二部分内容.
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>