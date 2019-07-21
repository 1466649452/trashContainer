<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="{CHARSET}">
		<title></title>
	</head>

	<body>

		当前的收货地址为：<br />
		<table border="1">
			<thead>
				<tr>
					<th rowspan="1" type="header" role="gridcell">收货人</th>
					<th rowspan="1" type="header" role="gridcell">省份</th>
					<th rowspan="1" type="header" role="gridcell">城市</th>
					<th rowspan="1" type="header" role="gridcell">详细地址</th>
					<th rowspan="1" type="header" role="gridcell">电话/手机</th>
				</tr>
			</thead>
			<tr>

				<td>${sessionScope.ChoicedAddressForOrder.getAnsname() }</td>
				<td>${sessionScope.ChoicedAddressForOrder.getAnsname() }</td>
				<td>${sessionScope.ChoicedAddressForOrder.getAnsname() }</td>
				<td>${sessionScope.ChoicedAddressForOrder.getAnsname() }</td>
				<td>${sessionScope.ChoicedAddressForOrder.getAnsname() }</td>

			</tr>

		</table>

	</body>

</html>