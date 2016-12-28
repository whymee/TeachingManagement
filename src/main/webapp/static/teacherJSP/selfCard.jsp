<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link type="text/css" href="${pageContext.request.contextPath}/static/css/selfCard.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/bootstrap3/css/bootstrap.min.css" rel="stylesheet">
<!-- bootstrap响应式 -->
<link href="${pageContext.request.contextPath}/static/bootstrap3/css/bootstrap-responsive.css" rel="stylesheet">

<script src="${pageContext.request.contextPath}/static/js/jquery-2.1.4.min.js"></script>
<script src="${pageContext.request.contextPath}/static/bootstrap3/js/bootstrap.min.js"></script>

<title>教师个人名片</title>

</head>
<body>
	<div class="page-header" role="" style="margin-top: -15px;">
		<h4><a href="${pageContext.request.contextPath}/teacher_main.jsp">首页</a>&nbsp;>&nbsp;教师个人名片</h4>
	</div>
	<div id="selfCard">
		<div class="col-md-4">
			<img alt="" src="${pageContext.request.contextPath}/static/images/pengmao.jpg" width="350px" height="400px" style="margin-left: 30px;margin-top: 20px;">
			<br>
			<br>
			<span style="margin-left: 30px;font-weight: 800;font-size: 20px;">职业：教师</span>
			<br>
			<br>
			<span style="margin-left: 30px;font-weight: 800;font-size: 20px;">学校：重庆科技学院</span>
			<br>
			<br>
			<span style="margin-left: 30px;font-weight: 800;font-size: 20px;">学校地址：重庆市沙坪坝区虎溪大学城</span>
		</div>
		<div class="col-md-1"></div>
		<div class="col-md-7" style="margin-top: 20px;">
			<table class="table" style="font-weight: 400;font-size: 20px;">
				<tr>
					<td>姓名：</td>
					<td>陈钟鹏</td>
				</tr>
				<tr>
					<td>联系电话：</td>
					<td>17708319469</td>
				</tr>
				<tr>
					<td>qq：</td>
					<td>542878638</td>
				</tr>
				<tr>
					<td>邮箱：</td>
					<td>542878638@qq.com</td>
				</tr>
				<tr>
					<td>职称：</td>
					<td>大学讲师/博士生导师/java高级工程师/前端工程师/UI设计师</td>
				</tr>
				<tr>
					<td>获奖情况：</td>
					<td>科研论文国家级一等奖、java接口研究市级一等奖、2016年重庆市最佳教师称号、2017年重庆市最佳教师称号</td>
				</tr>
				<tr>
					<td>特长：</td>
					<td>篮球、辅导学困生</td>
				</tr>
			</table>
			
			<br><br><br>
			<h1>一切为了孩子，为了孩子的一切，为了一切的孩子！</h1>
		</div>
	</div>
</body>
</html>