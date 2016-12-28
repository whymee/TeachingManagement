<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link type="text/css" href="${pageContext.request.contextPath}/static/css/selfMessagePerfect.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/bootstrap3/css/bootstrap.min.css" rel="stylesheet">

<!-- bootstrap响应式 -->
<link href="${pageContext.request.contextPath}/static/bootstrap3/css/bootstrap-responsive.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/static/js/jquery-2.1.4.min.js"></script>
<script src="${pageContext.request.contextPath}/static/bootstrap3/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/selfMessagePerfect.js"></script>

<title>教师个人信息完善</title>

</head>
<body>
	<div class="page-header" role="" style="margin-top: -15px;">
		<h4><a href="${pageContext.request.contextPath}/teacher_main.jsp">首页</a>&nbsp;>&nbsp;教师个人信息完善</h4>
	</div>
	<div id="selfMessagePerfect">
		<div class="col-md-5">
			<img alt="" src="${pageContext.request.contextPath}/static/images/pengmao.jpg" width="250px" height="300px" style="margin-left: 30px;margin-top: 20px;">
			<br>
			<button id="realFileInput" type="button" class="btn btn-primary" style="width: 250px;margin-left: 30px;">上传新头像</button>
			<br>
			<input id="fileInput" type="file" value="上传新头像" style="display: none;">
			<br>
			<table class="selfMessageTable">
				<tr>
					<td>用户名:</td>
					<td><input type="text" class="form-control" placeholder="用户名"></td>
				</tr>
				
				<tr>
					<td>姓名:</td>
					<td><input type="text" class="form-control" placeholder="姓名"></td>
				</tr>
				<tr>
					<td>性别:</td>
					<td><input type="radio" name="sex" value="nan" checked="checked">&nbsp;男&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="sex" value="nv">&nbsp;女</td>
				</tr>
				<tr>
					<td>生日:</td>
					<td>
						<select name="year">
						  <%for(int i=1900;i<=2017;i++){ %>
						  <option><%=i %></option>
						  <% }%>
						</select>&nbsp;年
						<select name="month">
						  <%for(int i=1;i<=12;i++){ %>
						  <option><%=i %></option>
						  <% }%>
						</select>&nbsp;月
						<select name="day">
						  <%for(int i=1;i<=31;i++){ %>
						  <option><%=i %></option>
						  <% }%>
						</select>&nbsp;日
					</td>
				</tr>
				<tr>
					<td>联系电话:</td>
					<td><input type="text" class="form-control" placeholder="联系电话"></td>
				</tr>
				<tr>
					<td>qq:</td>
					<td><input type="text" class="form-control" placeholder="qq号码"></td>
				</tr>
				<tr>
					<td>邮箱:</td>
					<td><input type="text" class="form-control" placeholder="邮箱地址"></td>
				</tr>
			</table>
		</div>
		
		<div class="col-md-7">
			<table class="selfMessageTable">
				
				<tr>
					<td>学校名称:</td>
					<td><input type="text" class="form-control" placeholder="学校名称"></td>
				</tr>
				<tr>
					<td>学校编号:</td>
					<td><input type="text" class="form-control" placeholder="学校编号"></td>
				</tr>
				<tr>
					<td>学校地址:</td>
					<td><input type="text" class="form-control" placeholder="学校地址"></td>
				</tr>
				<tr>
					<td>学校名称:</td>
					<td><input type="text" class="form-control" placeholder="学校名称"></td>
				</tr>
				<tr>
					<td>家庭住址:</td>
					<td><input type="text" class="form-control" placeholder="家庭住址"></td>
				</tr>
				<tr>
					<td>学校名称:</td>
					<td><input type="text" class="form-control" placeholder="学校名称"></td>
				</tr>
				<tr>
					<td>职称:</td>
					<td>
						<input type="text" class="form-control" placeholder="职称">
						<font color="red">注意：多个职称之间用"/"隔开，如：讲师/研究生导师</font>
					</td>
				</tr>
				<tr>
					<td>所授科目:</td>
					<td>
						<input type="text" class="form-control" placeholder="所授科目">
						<font color="red">注意：多个科目之间用"/"隔开，如：语文/数学/英语</font>
					</td>
				</tr>
				<tr>
					<td>所授班级:</td>
					<td>
						<input type="text" class="form-control" placeholder="所授班级">
						<font color="red">注意：多个班级之间用"/"隔开，如：高2013级1班/高2014级12班</font>
					</td>
				</tr>
				<tr>
					<td>政治面貌:</td>
					<td>
						<select class="form-control">
						  <option>共青团员</option>
						  <option>入党积极分子</option>
						  <option>预备党员</option>
						  <option>共产党员</option>
						  <option>国民党员</option>
						</select>
					</td>
				</tr>
				<tr>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td><button type="button" class="btn btn-success" style="width: 200px;">保存</button></td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>