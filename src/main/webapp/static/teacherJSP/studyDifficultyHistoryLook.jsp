<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link type="text/css"
	href="${pageContext.request.contextPath}/static/css/selfDefficultyHistoryLook.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/static/bootstrap3/css/bootstrap.min.css"
	rel="stylesheet">
<!-- bootstrap响应式 -->
<link
	href="${pageContext.request.contextPath}/static/bootstrap3/css/bootstrap-responsive.css"
	rel="stylesheet">

<script
	src="${pageContext.request.contextPath}/static/js/jquery-2.1.4.min.js"></script>
<script
	src="${pageContext.request.contextPath}/static/bootstrap3/js/bootstrap.min.js"></script>

<title>教师个人名片</title>

</head>
<body>
	<div class="page-header" role="" style="margin-top: -15px;">
		<h4>
			<a href="${pageContext.request.contextPath}/teacher_main.jsp">首页</a>&nbsp;>&nbsp;历史学困生信息查看
		</h4>
	</div>
	<div>
		<table class="table table-bordered table-striped">
			<caption style="font-weight: 800;color: gray;">已删除的历史学困生</caption>
			<tr>
				<th>学号</th>
				<th>姓名</th>
				<th>性别</th>
				<th>年龄</th>
				<th>班级</th>
				<th>学困科目</th>
				<th>学困原因</th>
				<th>操作</th>
			</tr>
			<%for(int i=0;i<13;i++){ %>
			<tr>
				<td>20134424587</td>
				<td>陈钟鹏</td>
				<td>男</td>
				<td>22</td>
				<td>高2015级 8班</td>
				<td>数学</td>
				<td>实在是不认识123456789</td>
				<td><button type="reset" class="btn btn-default">恢复</button>&nbsp;&nbsp;&nbsp;&nbsp;<button type="reset" class="btn btn-danger">彻底删除</button></td>
			</tr>
			<%} %>
		</table>
	</div>
</body>
</html>