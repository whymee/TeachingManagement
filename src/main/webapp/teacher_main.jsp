<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link type="text/css" href="static/css/teacher_main.css" rel="stylesheet">
<link href="static/bootstrap3/css/bootstrap.min.css" rel="stylesheet">

<!-- bootstrap响应式 -->
<link href="${pageContext.request.contextPath}/static/bootstrap3/css/bootstrap-responsive.css" rel="stylesheet">
<script src="static/js/jquery-2.1.4.min.js"></script>
<script src="static/bootstrap3/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css" href="stylesheets/simple-calendar.css">
<script type="text/javascript" src="javascripts/simple-calendar.js"></script>
<title>追梦教学过程管理系统</title>
<script type="text/javascript">
	function selfMessagePerfect(){
		$("#mainPage").empty();
		var url = "${pageContext.request.contextPath}/static/teacherJSP/selfMessagePerfect.jsp";
	    $("#mainPage").load(url,null,function(){}); 
	}
	function selfCard(){
		$("#mainPage").empty();
		var url = "${pageContext.request.contextPath}/static/teacherJSP/selfCard.jsp";
	    $("#mainPage").load(url,null,function(){}); 
	}
	function selfCurriculum(){
		$("#mainPage").empty();
		var url = "${pageContext.request.contextPath}/static/teacherJSP/selfCurriculum.jsp";
	    $("#mainPage").load(url,null,function(){}); 
	}
	function selfTrackRecord(){
		$("#mainPage").empty();
		var url = "${pageContext.request.contextPath}/static/teacherJSP/selfTrackRecord.jsp";
	    $("#mainPage").load(url,null,function(){}); 
	}
	function studyDifficultyAdd(){
		$("#mainPage").empty();
		var url = "${pageContext.request.contextPath}/static/teacherJSP/studyDifficultyAdd.jsp";
	    $("#mainPage").load(url,null,function(){}); 
	}
	function studyDifficultyHistoryLook(){
		$("#mainPage").empty();
		var url = "${pageContext.request.contextPath}/static/teacherJSP/studyDifficultyHistoryLook.jsp";
	    $("#mainPage").load(url,null,function(){}); 
	}
</script>
</head>
<body>
	<div class="navbar navbar-duomi navbar-static-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#" id="logo"> 
					<img alt="" src="static/images/logo.png">
				</a>
			</div>
			<div style="float: right;margin-top: 20px;">
				<iframe style="float: right;" width="420" scrolling="no" height="60" frameborder="0" allowtransparency="true" src="http://i.tianqi.com/index.php?c=code&id=12&icon=1&num=5"></iframe>
			</div>
		</div>
	</div>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-2">
				<ul id="main-nav" class="nav nav-tabs nav-stacked" style="">
					<li class="active">
						<a href="teacher_main.jsp"> 
							<i class="glyphicon glyphicon-th-large"></i> 
							首页
						</a>
					</li>
					
					<li>
						<a href="#" class="nav-header collapsed" data-toggle="collapse"> 
							<i class="glyphicon glyphicon-search"></i>
							我的消息<span class="label label-warning pull-right">5</span>
						</a>
					</li>
					
					<li>
						<a href="#systemSetting" class="nav-header collapsed" data-toggle="collapse"> 
							<i class="glyphicon glyphicon-cog"></i>
							个人信息管理 <span class="pull-right glyphicon glyphicon-chevron-down"></span>
						</a>
						<ul id="systemSetting" class="nav nav-list collapse secondmenu" style="height: 0px; margin-left: 20px;">
							<li><a href="javaScript:selfMessagePerfect()"><i class="glyphicon glyphicon-user"></i>个人信息完善</a></li>
							<li><a href="javaScript:selfCard()"><i class="glyphicon glyphicon-th-list"></i>个人名片查看</a></li>
							<li><a href="javaScript:selfCurriculum()"><i class="glyphicon glyphicon-asterisk"></i>个人课表查看</a></li>
							<li><a href="javaScript:selfTrackRecord()"><i class="glyphicon glyphicon-edit"></i>个人业绩档案查看</a></li>
						</ul>
					</li>
					
					<li>
						<a href="#systemSetting2" class="nav-header collapsed" data-toggle="collapse"> 
							<i class="glyphicon glyphicon-credit-card"></i> 
							备课信息管理<span class="pull-right glyphicon glyphicon-chevron-down"></span>
						</a>
						<ul id="systemSetting2" class="nav nav-list collapse secondmenu" style="height: 0px; margin-left: 20px;">
							<li><a href="#"><i class="glyphicon glyphicon-user"></i>添加备课记录</a></li>
							<li><a href="#"><i class="glyphicon glyphicon-th-list"></i>历史备课记录查看</a></li>
							<li><a href="#"><i class="glyphicon glyphicon-asterisk"></i>教务处巡查情况查看</a></li>
						</ul>
					</li>
					
					<li>
						<a href="#systemSetting3" class="nav-header collapsed" data-toggle="collapse"> 
							<i class="glyphicon glyphicon-credit-card"></i> 
							作业信息管理<span class="pull-right glyphicon glyphicon-chevron-down"></span>
						</a>
						<ul id="systemSetting3" class="nav nav-list collapse secondmenu" style="height: 0px; margin-left: 20px;">
							<li><a href="#"><i class="glyphicon glyphicon-user"></i>添加作业记录</a></li>
							<li><a href="#"><i class="glyphicon glyphicon-th-list"></i>历史作业记录查看</a></li>
							<li><a href="#"><i class="glyphicon glyphicon-asterisk"></i>教务处巡查情况查看</a></li>
						</ul>
					</li>
					
					<li>
						<a href="#systemSetting4" class="nav-header collapsed" data-toggle="collapse"> 
							<i class="glyphicon glyphicon-credit-card"></i> 
							考试信息管理<span class="pull-right glyphicon glyphicon-chevron-down"></span>
						</a>
						<ul id="systemSetting4" class="nav nav-list collapse secondmenu" style="height: 0px; margin-left: 20px;">
							<li><a href="#"><i class="glyphicon glyphicon-user"></i>添加考试记录</a></li>
							<li><a href="#"><i class="glyphicon glyphicon-th-list"></i>历史考试记录查看</a></li>
						</ul>
					</li>
					
					<li>
						<a href="#systemSetting5" class="nav-header collapsed" data-toggle="collapse"> 
							<i class="glyphicon glyphicon-credit-card"></i> 
							学困生信息管理<span class="pull-right glyphicon glyphicon-chevron-down"></span>
						</a>
						<ul id="systemSetting5" class="nav nav-list collapse secondmenu" style="height: 0px; margin-left: 20px;">
							<li><a href="javascript:studyDifficultyAdd()"><i class="glyphicon glyphicon-user"></i>添加学困生记录</a></li>
							<li><a href="javascript:studyDifficultyHistoryLook()"><i class="glyphicon glyphicon-th-list"></i>历史学困生记录查看</a></li>
						</ul>
					</li>
					
					<li>
						<a href="#systemSetting6" class="nav-header collapsed" data-toggle="collapse"> 
							<i class="glyphicon glyphicon-credit-card"></i> 
							教研成果管理<span class="pull-right glyphicon glyphicon-chevron-down"></span>
						</a>
						<ul id="systemSetting6" class="nav nav-list collapse secondmenu" style="height: 0px; margin-left: 20px;">
							<li><a href="#"><i class="glyphicon glyphicon-user"></i>科研论文管理</a></li>
							<li><a href="#"><i class="glyphicon glyphicon-th-list"></i>优质课竞赛管理</a></li>
							<li><a href="#"><i class="glyphicon glyphicon-user"></i>指导学生管理</a></li>
							<li><a href="#"><i class="glyphicon glyphicon-user"></i>教学科研课题研究管理</a></li>
							<li><a href="#"><i class="glyphicon glyphicon-user"></i>其它教研成果管理</a></li>
						</ul>
					</li>
					
					<li>
						<a href="#systemSetting7" class="nav-header collapsed" data-toggle="collapse"> 
							<i class="glyphicon glyphicon-credit-card"></i>
							 训课情况查询<span class="pull-right glyphicon glyphicon-chevron-down"></span>
						</a>
						<ul id="systemSetting7" class="nav nav-list collapse secondmenu" style="height: 0px; margin-left: 20px;">
							<li>
								<a href="#">
									<i class="glyphicon glyphicon-user"></i>
									我的课程巡课情况
								</a>
							</li>
						</ul>
					</li>
				</ul>
			</div>
			<div class="col-md-10" id="mainPage">
				<div class="col-md-3">
					<div id="user" class="col-md-12" align="center">
						<br> <img style="width: 60px; height: 60px; border-radius: 50%; overflow: hidden; margin-top: 10px;" src="static/images/morenuserPicture.jpg">
						<table id="userTable">
							<tr>
								<td><a href="#"><span class="glyphicon glyphicon-qrcode"></span>&nbsp;个人名片</a></td>
								<td><a href="#"><span class="glyphicon glyphicon-pencil"></span>&nbsp;修改信息</a></td>
							</tr>
							<tr>
								<td><a href="#"><span class="glyphicon glyphicon-cog"></span>&nbsp;修改密码</a></td>
								<td><a href="#"><span class="glyphicon glyphicon-remove"></span>&nbsp;注销登录</a></td>
							</tr>
						</table>
						<hr />
						<h4 style="text-align: left;">&nbsp;&nbsp;快捷通道</h4>
						<table id="fastPassTable">
							<tr>
								<td><a href="#"><button type="button" class="btn btn-success">&nbsp;&nbsp;<span class="glyphicon glyphicon-zoom-in"></span>&nbsp;查看课表&nbsp;&nbsp;</button></a></td>
								<td><a href="#"><button type="button" class="btn btn-success">&nbsp;&nbsp;<span class="glyphicon glyphicon-pencil"></span>&nbsp;新增作业&nbsp;&nbsp;</button></a></td>
							</tr>
							<tr>
								<td><a href="#"><button type="button" class="btn btn-success">&nbsp;&nbsp;<span class="glyphicon glyphicon-pencil"></span>&nbsp;新增备课&nbsp;&nbsp;</button></a></td>
								<td><a href="#"><button type="button" class="btn btn-success">&nbsp;&nbsp;<span class="glyphicon glyphicon-pencil"></span>&nbsp;新增考试&nbsp;&nbsp;</button></a></td>
							</tr>
						</table>
						<br>
					</div>
				</div>
				<div class="col-md-9">
					<div id='container'></div>
					<script>
					    var myCalendar = new SimpleCalendar('#container');
					 </script>
				</div>
				<div class="col-md-12" style="margin-top: 10px;">
					<div class="col-md-6 table-responsive">
					<br>
					<h4 style="color: #4A515B;">学校公告</h4>
						<table class="table table-hover gonggaoTable">
							<tr>
								<th>公告摘要</th>
								<th>发表单位</th>
								<th>发表时间</th>
							</tr>
							<tbody>
							<%for(int i=0;i<9;i++){ %>
							<tr>
								<td>处理了一些同学的举报</td>
								<td>重庆科技学院教务处</td>
								<td>2016年12月18日</td>
							</tr>
							<%} %>
							</tbody>
						</table>
					</div>
					
					<div class="col-md-6 table-responsive">
						<br>
						<h4 style="color: #4A515B;">教务要闻</h4>
						<table class="table table-hover gonggaoTable">
							<tr>
								<th>公告摘要</th>
								<th>发表单位</th>
								<th>发表时间</th>
							</tr>
							<tbody>
							<%for(int i=0;i<9;i++){ %>
							<tr>
								<td>处理了一些同学的举报</td>
								<td>重庆科技学院教务处</td>
								<td>2016年12月18日</td>
							</tr>
							<%} %>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
		
	</div>

</body>
</html>