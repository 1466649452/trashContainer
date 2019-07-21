<!-- 用于展示可选地址和新增地址 -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>

	<body>


		<!-- 此处使用《c:foreach》来循环，最前方判断session为不为空 -->
		<form action="ChoiceAddressServlet" method="post">
			<table border="1" width="800">
				<thead>
					<tr>
						<th rowspan="1" type="header" role="gridcell">单选框</th>
						<th rowspan="1" type="header" role="gridcell">收货人</th>
						<th rowspan="1" type="header" role="gridcell">省份</th>
						<th rowspan="1" type="header" role="gridcell">城市</th>
						<th rowspan="1" type="header" role="gridcell">详细地址</th>
						<th rowspan="1" type="header" role="gridcell">电话/手机</th>
						<th rowspan="1" type="header" role="gridcell">操作</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td><input type="radio" name="choiceaddress" value="1"></td>
						<td>yan</td>
						<td>上海</td>
						<td>上海</td>
						<td>静安区</td>
						<td>12345678910</td>
						<td>修改|删除</td>
					</tr>
					<tr>
						<td><input type="radio" name="choiceaddress" value="2"></td>
						<td>yan</td>
						<td>上海</td>
						<td>上海</td>
						<td>静安区</td>
						<td>12345678910</td>
						<td>修改|删除</td>
					</tr>
				</tbody>

			</table>
			<input type="submit" value="确认使用该地址" />
		</form>
	</body>

</html>