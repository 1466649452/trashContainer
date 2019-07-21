<!-- 本页用于新建订单 -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
    
<!DOCTYPE html>
<html>

	<head>
		<meta charset="{CHARSET}">
		<title></title>
	</head>

	<body>

		<c:if test="${sessionScope.ChoicedAddressForOrder!=null}">
		
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
				<td>${sessionScope.ChoicedAddressForOrder.getProvince() }</td>
				<td>${sessionScope.ChoicedAddressForOrder.getCity().getCityname() }</td>
				<td>${sessionScope.ChoicedAddressForOrder.getDetail() }</td>
				<td>${sessionScope.ChoicedAddressForOrder.getNumber() }</td>
			</tr>
		</table>
		</c:if>
		<!-- 此处用session里的userid来传递。。非常重要 -->
		<form action="CreateOrderServlet?addressid=${sessionScope.ChoicedAddressForOrder.getUserid().getUserid() }&userid=1" method="post">
		请选择预约的时间：
		<input type="date" name="yuyuedate" value="07/24/2019" required />
		<input type="time" name="yuyuetime" value="7:00:00" required />
		
		价格：20元
		
		<input type="submit" value="确认下单" />
		</form>
	</body>

</html>