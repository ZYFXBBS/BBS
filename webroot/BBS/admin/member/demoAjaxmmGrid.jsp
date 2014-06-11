<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
<head>
<%
response.addHeader("X-UA-Compatible", "IE=EmulateIE9");
%>
<%
  String contextPath = request.getContextPath();
  if (contextPath.equals("")) {
    contextPath = "/BBS";
  }
  String imgPath = contextPath + "/inc/css/admin/images";
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="description" content="">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1">
<title>消息管理</title>
 <link rel="stylesheet" href="<%=contextPath %>/css/mmGrid/mmGrid.css">
  <link rel="stylesheet" href="<%=contextPath %>/css/mmGrid/mmPaginator.css">
   <script src="<%=contextPath %>/js/mmGrid/vendor/jquery-1.9.1.min.js"></script>

    <style>
        .mmGrid,
        .mmPaginator{
            font-size: 12px;
        }
        .btnPrice {
            display: block;
            width: 16px;
            height: 16px;
            margin: 0px auto;
            background: url(img/botton_g1.gif) no-repeat;
        }

        .btnPrice:hover {
            background: url(img/botton_g2.gif) no-repeat;
        }
    </style>
    <!--[if lt IE 9]>
    <script src="<%=contextPath %>/js/mmGrid/vendor/html5shiv.js"></script>
    <![endif]-->
	<script src="<%=contextPath %>/js/mmGrid/mmGrid.js"></script>
	<script src="<%=contextPath %>/js/mmGrid/mmPaginator.js"></script>
	<script>
//本地数据
    var items = [{AMPLITUDE:0.9309,PREVCLOSINGPRICE:7.52},{AMPLITUDE:10.9309,PREVCLOSINGPRICE:7.52},{AMPLITUDE:0.923209,PREVCLOSINGPRICE:7.152},{AMPLITUDE:0.19309,PREVCLOSINGPRICE:7.52}];
    
 var cols3 = [
        {title:'ID', name:'memberId', width: 30, align: 'center', sortable: true,sortName:'memberId'},
        { title:'会员真实姓名', name:'memberRealName' ,width:100, align:'center', sortable: true,sortName:'memberRealName'},
        { title:'会员名字', name:'memberName' ,width:100, align:'center', sortable: true,sortName:'memberName'},
         { title:'邮箱', name:'email' ,width:100, align:'center'}
    
    ];
$(document).ready(function(){
	
	var mmg = $('#shenhua').mmGrid({
        height: 400
        , cols: cols3
        , url: '/BBS/memberController/queryAllMember.do'
        , method: 'get'
        , remoteSort:true
        //, items: items
       // , sortName: 'SECUCODE'
        ,remoteSort:true 
        ,root: 'result'
        , sortStatus: 'asc'
        , multiSelect: true
        , checkCol: true
        , fullWidthRows: true
       // , autoLoad: false
        , plugins: [
            $('#pg').mmPaginator({page: 1,limit:20})
        ]
        
    });

	
});
	
</script>
</head>
<body >
	<table id="shenhua">
    </table>（（（（（（（（（（（（（（（（（（（（（（（（水水水水ss））））））））
	 <div style="text-align:right;">
	            <div id="pg"></div>
	</div>
</body>
</html>

