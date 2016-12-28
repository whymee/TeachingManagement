<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link type="text/css" href="${pageContext.request.contextPath}/static/css/selfTrackRecord.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/bootstrap3/css/bootstrap.min.css" rel="stylesheet">
<!-- bootstrap响应式 -->
<link href="${pageContext.request.contextPath}/static/bootstrap3/css/bootstrap-responsive.css" rel="stylesheet">

<script src="${pageContext.request.contextPath}/static/js/selfTrackRecord.js"></script>
<script src="${pageContext.request.contextPath}/static/js/jquery-2.1.4.min.js"></script>
<script src="${pageContext.request.contextPath}/static/bootstrap3/js/bootstrap.min.js"></script>

<title>教师个人名片</title>

</head>
<body>
	<div class="page-header" role="" style="margin-top: -15px;">
		<h4><a href="${pageContext.request.contextPath}/teacher_main.jsp">首页</a>&nbsp;>&nbsp;教师个人业绩档案</h4>
	</div>
	<div id="selfTrackRecord">
		<span style="color: gray;">类型选择：</span>
		<ul>
			<li><a href="#" id="kylw">科研论文</a>&nbsp;&nbsp;|&nbsp;</li>
			<li><a href="#" id="yzkjs">优质课竞赛</a>&nbsp;&nbsp;|&nbsp;</li>
			<li><a href="#" id="jxkyktyj">教学科研课题研究</a>&nbsp;&nbsp;|&nbsp;</li>
			<li><a href="#" id="zdxs">指导学生</a>&nbsp;&nbsp;|&nbsp;</li>
			<li><a href="#" id="qt">其它</a></li>
		</ul>
		<hr>
		<table class="table table-striped" id="kylwTable">
			<caption style="font-weight: 800;font-size: 14px;">教师个人科研论文表</caption>
			<tr>
				<th>#</th>
				<th>论文题目</th>
				<th>论文类型</th>
				<th>获奖情况</th>
				<th>发表日期</th>
				<th>发表者</th>
				<th>凭证材料(有/无)</th>
				<th>凭证详情</th>
			</tr>
			<%for(int i=0;i<10;i++){ %>
			<tr>
				<td><%=i+1 %></td>
				<td>关于甲烷和氢气不同比例发生反应的论文</td>
				<td>化学</td>
				<td>国家一等奖</td>
				<td>2016-11-25</td>
				<td>陈钟鹏</td>
				<td>有</td>
				<td><a href="javascript:vouchersLook()">查看</a></td>
			</tr>
			<%} %>
		</table>
		
		<table class="table table-striped" id="yzkjsTable" style="display: none;">
			<caption style="font-weight: 800;font-size: 14px;">教师个人优质课竞赛表</caption>
			<tr>
				<th>#</th>
				<th>竞赛科目</th>
				<th>获奖情况</th>
				<th>竞赛日期</th>
				<th>参赛者</th>
				<th>凭证材料(有/无)</th>
				<th>凭证详情</th>
			</tr>
			<%for(int i=0;i<10;i++){ %>
			<tr>
				<td><%=i+1 %></td>
				<td>数学</td>
				<td>校级三等奖</td>
				<td>2016-11-25</td>
				<td>陈钟鹏</td>
				<td>无</td>
				<td><a href="javascript:vouchersLook()">查看</a></td>
			</tr>
			<%} %>
		</table>
		
		<table class="table table-striped" id="jxkyktyjTable" style="display: none;">
			<caption style="font-weight: 800;font-size: 14px;">教师个人教学科研课题研究表</caption>
			<tr>
				<th>#</th>
				<th>科研课题研究题目</th>
				<th>起始日期</th>
				<th>结束日期</th>
				<th>研究者</th>
				<th>凭证材料(有/无)</th>
				<th>凭证详情</th>
			</tr>
			<%for(int i=0;i<10;i++){ %>
			<tr>
				<td><%=i+1 %></td>
				<td>1+1为何等于1？2+2为何等于4？</td>
				<td>2014-11-23</td>
				<td>2016-11-25</td>
				<td>陈钟鹏</td>
				<td>有</td>
				<td><a href="javascript:vouchersLook()">查看</a></td>
			</tr>
			<%} %>
		</table>
		
		<table class="table table-striped" id="zdxsTable" style="display: none;">
			<caption style="font-weight: 800;font-size: 14px;">教师个人指导学生情况表</caption>
			<tr>
				<th>#</th>
				<th>指导内容</th>
				<th>起始日期</th>
				<th>结束日期</th>
				<th>指导者</th>
				<th>凭证材料(有/无)</th>
				<th>凭证详情</th>
			</tr>
			<%for(int i=0;i<10;i++){ %>
			<tr>
				<td><%=i+1 %></td>
				<td>指导魏晨、罗庆文等学生毕业设计</td>
				<td>2014-11-23</td>
				<td>2016-11-25</td>
				<td>陈钟鹏</td>
				<td>无</td>
				<td><a href="javascript:vouchersLook()">查看</a></td>
			</tr>
			<%} %>
		</table>
		
		<table class="table table-striped" id="qtTable" style="display: none;">
			<caption style="font-weight: 800;font-size: 14px;">教师个人其他教研成果表</caption>
			<tr>
				<th>#</th>
				<th>教研成果内容</th>
				<th>获奖情况</th>
				<th>时间</th>
				<th>所有者</th>
				<th>凭证材料(有/无)</th>
				<th>凭证详情</th>
			</tr>
			<%for(int i=0;i<10;i++){ %>
			<tr>
				<td><%=i+1 %></td>
				<td>所授班级数学获得2013-2014年度重庆市期末统考平均分第一名</td>
				<td>其他</td>
				<td>2016-11-25</td>
				<td>陈钟鹏</td>
				<td>无</td>
				<td><a href="javascript:vouchersLook()">查看</a></td>
			</tr>
			<%} %>
		</table>
	</div>
	
	<div class="modal" id="vouchersLook" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" style="">
		<div class="modal-dialog modal-lg" role="document" style="width: 100%;height: 100%;">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body" style="text-align: center;">
					<img src="${pageContext.request.contextPath}/static/images/vouchers.png" alt="..." class="img-rounded">
				</div>
			</div>
		</div>
	</div>
</body>
</html>