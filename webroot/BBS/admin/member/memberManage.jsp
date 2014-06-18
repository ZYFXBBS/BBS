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
<%@ include file="/header/header.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="description" content="">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1">
<title>消息管理</title>
 <link rel="stylesheet" href="<%=contextPath %>/css/mmGrid/mmGrid.css">
 <link rel="stylesheet" href="<%=contextPath %>/css/mmGrid/mmPaginator.css">

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
 var cols = [
        {title:'ID', name:'memberId', width: 30, align: 'center', sortable: true,sortName:'memberId',lockWidth:true, hidden: true},
        { title:'会员名字', name:'memberName' ,width:100, align:'center', sortable: true,sortName:'memberName',lockDisplay:true},
        { title:'会员真实姓名', name:'memberRealName' ,width:100, align:'center', sortable: true,sortName:'memberRealName'},
        { title:'手机', name:'mobile' ,width:100, align:'center', sortable: true,sortName:'mobile', hidden: true},
        { title:'家庭电话', name:'homephone' ,width:100, align:'center', sortable: true,sortName:'homephone', hidden: true},
        { title:'QQ', name:'qq' ,width:100, align:'center', sortable: true,sortName:'qq', hidden: true},
        { title:'地址', name:'address' ,width:100, align:'center'},
        { title:'邮编', name:'postCode' ,width:100, align:'center'},
        { title:'积分', name:'mark' ,width:100, align:'center', sortable: true,sortName:'mark'},
        { title:'是否在线', name:'action' ,width:100, align:'center', sortable: true,sortName:'action', hidden: true},
        { title:'发帖数量', name:'topicCount' ,width:100, align:'center', sortable: true,sortName:'topicCount'},
        { title:'回帖数量', name:'replyCount' ,width:100, align:'center', sortable: true,sortName:'replyCount'},
        { title:'注册时间', name:'date' ,width:100, align:'center', sortable: true,sortName:'date', hidden: true},
        { title:'邮箱', name:'email' ,width:100, align:'center', hidden: true},
        { title:'操作', name:'' ,width:150, align:'center', lockWidth:true, lockDisplay: true, renderer: function(val){
            return '<button  class="btn btn-info btn-small" onclick="getSelectCol();">查看</button> <button  class="btn btn-danger btn-small">删除</button>'
        }}
    
    ];
$(document).ready(function(){
	
	var mmg = $('#memberList').mmGrid({
        height: 400
        , cols: cols
        , url: '/BBS/memberController/queryAllMember.do'
        , method: 'post'
        , remoteSort:true
        //, items: items
       // , sortName: 'SECUCODE'
        ,remoteSort:true 
        ,root: 'result'
        ,nowrap: true
        , sortStatus: 'asc'
        , multiSelect: true
        , checkCol: true
        , fullWidthRows: true
       // , autoLoad: false
        , plugins: [
            $('#pg').mmPaginator({})
        ]
        

        
    });

	
});

function getSelectCol(){
	var cols = $('#memberList').mmGrid('selectedRows');
	if(cols && cols.length != 1){
		bbs.alert("请选择 一条记录!");
	}else{
		bbs.alert("您选择的 记录 会员名:"+cols[0].memberName);
	}
}

function deleteMember(id){
	var url = "<%=contextPath%>/memberController/deleteMember.do";
	var para =  {};
	para['id'] = id;
	var jsonRs = $.AF(url,para);
	if(jsonRs.state){
		// top.$.jBox.tip("保存成功！");
	}else{
		alert(jsonRs.rtMsg);
	}
}
</script>
</head>
<body >
	<table id="memberList">
    </table>
	 <div style="text-align:right;">
	            <div id="pg"></div>
	</div>
</body>
</html>

