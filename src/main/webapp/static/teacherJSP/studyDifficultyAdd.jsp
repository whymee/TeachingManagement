<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link type="text/css"
	href="${pageContext.request.contextPath}/static/css/selfDefficulty.css"
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
			<a href="${pageContext.request.contextPath}/teacher_main.jsp">首页</a>&nbsp;>&nbsp;学困生信息添加
		</h4>
	</div>
	<div id="selfDefficulty" style="width: 60%;">
		<form class="form-horizontal" role="form">
			<div class="form-group">
				<label for="inputEmail3" class="col-sm-2 control-label">姓名</label>
				<div class="col-sm-10">
					<input type="email" class="form-control" id="inputEmail3"
						placeholder="姓名">
				</div>
			</div>
			<div class="form-group">
				<label for="inputEmail3" class="col-sm-2 control-label">性别</label>
				<div class="col-sm-10">
					<input type="radio" name="sex" value="nan" checked="checked">&nbsp;男&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="sex" value="nv">&nbsp;女
				</div>
			</div>
			<div class="form-group">
				<label for="inputEmail3" class="col-sm-2 control-label">年龄</label>
				<div class="col-sm-10">
					<select class="form-control">
					  <%for(int i=3;i<30;i++){ %>
					  <option><%=i %></option>
					  <%} %>
					</select>
				</div>
			</div>
			<div class="form-group">
				<label for="inputEmail3" class="col-sm-2 control-label">班级</label>
				<div class="col-sm-10">
					<select class="form-control">
					  <option>初2013级 1班</option>
					  <option>初2013级 11班</option>
					  <option>初2013级 9班</option>
					</select>
				</div>
			</div>
			<div class="form-group">
				<label for="inputEmail3" class="col-sm-2 control-label">困难科目</label>
				<div class="col-sm-10">
					<select class="form-control">
					  <option>语文</option>
					  <option>数学</option>
					  <option>英语</option>
					  <option>政治</option>
					  <option>历史</option>
					  <option>地理</option>
					  <option>物理</option>
					  <option>化学</option>
					  <option>生物</option>
					  <option>美术</option>
					  <option>音乐</option>
					  <option>体育</option>
					  <option>计算机</option>
					</select>
				</div>
			</div>
			<div class="form-group">
				<label for="inputEmail3" class="col-sm-2 control-label">困难原因</label>
				<div class="col-sm-10">
					<textarea class="form-control" rows="3" placeholder="在此输入该生学困原因..."></textarea>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-9 col-sm-3">
					<button type="reset" class="btn btn-default">重置</button>
					<button type="button" class="btn btn-success" style="width: 150px;">确认添加</button>
				</div>
			</div>
		</form>
	</div>
	<hr>
	<div>
		<table class="table table-bordered table-striped">
			<caption style="font-weight: 800;color: gray;">已添加的学困生</caption>
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
			<tr>
				<td>20134424587</td>
				<td>陈钟鹏</td>
				<td>男</td>
				<td>22</td>
				<td>高2015级 8班</td>
				<td>数学</td>
				<td>实在是不认识123456789</td>
				<td><button type="reset" class="btn btn-default">修改</button>&nbsp;&nbsp;&nbsp;&nbsp;<button type="reset" class="btn btn-danger">删除</button></td>
			</tr>
			<tr>
				<td>20134424587</td>
				<td>陈钟鹏</td>
				<td>男</td>
				<td>22</td>
				<td>高2015级 8班</td>
				<td>数学</td>
				<td>实在是不认识123456789</td>
				<td><button type="reset" class="btn btn-default">修改</button>&nbsp;&nbsp;&nbsp;&nbsp;<button type="reset" class="btn btn-danger">删除</button></td>
			</tr>
			<tr>
				<td>20134424587</td>
				<td>陈钟鹏</td>
				<td>男</td>
				<td>22</td>
				<td>高2015级 8班</td>
				<td>数学</td>
				<td>实在是不认识123456789</td>
				<td><button type="reset" class="btn btn-default">修改</button>&nbsp;&nbsp;&nbsp;&nbsp;<button type="reset" class="btn btn-danger">删除</button></td>
			</tr>
		</table>
	</div>
</body>
</html>