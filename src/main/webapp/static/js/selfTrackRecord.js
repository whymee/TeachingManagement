$(function(){
	$('#vouchersLook').modal({backdrop: 'static', keyboard: false,show:false});
	
	$("#kylw").css("color","red");
	$("#kylw").css("font-size","13px");
	
	$("#kylw").click(function(){
		changeCss(this);
		$("#kylwTable").css("display","");
		$("#kylwTable").siblings(".table").css("display","none");
	});
	$("#yzkjs").click(function(){
		changeCss(this);
		$("#yzkjsTable").css("display","");
		$("#yzkjsTable").siblings(".table").css("display","none");
	});
	$("#jxkyktyj").click(function(){
		changeCss(this);
		$("#jxkyktyjTable").css("display","");
		$("#jxkyktyjTable").siblings(".table").css("display","none");
	});
	$("#zdxs").click(function(){
		changeCss(this);
		$("#zdxsTable").css("display","");
		$("#zdxsTable").siblings(".table").css("display","none");
	});
	$("#qt").click(function(){
		changeCss(this);
		$("#qtTable").css("display","");
		$("#qtTable").siblings(".table").css("display","none");
	});
});

function changeCss(type){
	$(type).parent().siblings().children().css("color","gray");
	$(type).siblings().css("font-size","12px");
	$(type).css("color","red");
	$(type).css("font-size","13px");
}

function vouchersLook(){
	$("#vouchersLook").modal('show');
}
