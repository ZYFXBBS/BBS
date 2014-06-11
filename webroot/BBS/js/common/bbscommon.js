/* ============================================================
 * 自由飞翔 BBS 
 * ============================================================ */
/**
 * 格式化 表单为json 
 */
jQuery.formToJson=function(form){
	var json = {};
	$(form).find("input[name][type=text][disabled!=disabled]").each(function(i,obj){
		json[$(obj).attr("name")] = $(obj).val();
	});
	$(form).find("input[name][type=hidden][disabled!=disabled]").each(function(i,obj){
		json[$(obj).attr("name")] = $(obj).val();
	});
	$(form).find("textarea[name][disabled!=disabled]").each(function(i,obj){
		json[$(obj).attr("name")] = $(obj).val();
	});
	$(form).find("select[name][disabled!=disabled]").each(function(i,obj){
		json[$(obj).attr("name")] = $(obj).val();
	});
	$(form).find("input[name][type=checkbox][disabled!=disabled]").each(function(i,obj){
		if($(obj).attr("checked")){
			json[$(obj).attr("name")] = 1;
		}else{
			json[$(obj).attr("name")] = 0;
		}
	});
	$(form).find("input[name][type=radio][disabled!=disabled]:checked").each(function(i,obj){
		json[$(obj).attr("name")] = $(obj).val();
	});
	
	$(form).find("input[name][type=password][disabled!=disabled]").each(function(i,obj){
		json[$(obj).attr("name")] = $(obj).val();
	});
	return json;
};
//ajax 提交 form
jQuery.AF=function(url,param,async,callback){
	if(!param) param = {};
    var jsonObj = null;
	$.ajax({
		type:"post",
		dataType:"json",
		url:url,
		data:param,
		async:(async?async:false),
		success:function(data){
			jsonObj = data;
			if(callback){
				callback(jsonObj);
		    }
		},
		error:function(XMLHttpRequest, textStatus, errorThrown){
			jsonObj = {rtState:false,rtMsg:"Ajax Request Error"};
		}
	});
	return jsonObj;
}