<!-- 本网页为第一次进入 -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>

	<body>
	订单创建成功！<br>
	请确认信息后完成支付：<br>
	订单编号：${sessionScope.newestOrder.getOrderid() }<br>
	订单创建时间： ${sessionScope.newestOrder.getNewordertime() }<br>
	订单状态：<c:if test="${sessionScope.newestOrder.getOrderstate()==1 }">待支付</c:if>
			<c:if test="${sessionScope.newestOrder.getOrderstate()==2 }">待服务</c:if>
			<br>
	订单用户id： ${sessionScope.newestOrder.getUserid().getUserid() }<br>
	订单价格： ${sessionScope.newestOrder.getPrice() }<br>
	收货人姓名：  ${sessionScope.informationOfAddress.getAnsname() }<br>
	订单地址： ${sessionScope.informationOfAddress.getProvince()}    
	${sessionScope.informationOfAddress.getCity().getCityname() }    ${sessionScope.informationOfAddress.getDetail() }<br>
	联系电话： ${sessionScope.informationOfAddress.getPhonenumber() }<br>
	预约时间： ${sessionScope.newestOrder.getYuyue() }<br>
	
		<form action="PayOrderServlet?orderid=${sessionScope.newestOrder.getOrderid() }" method="post">
		<button name="pay" value="1">确认支付</button>
		
		<button name="pay" value="2">取消支付</button>
		</form>
	</body>

</html>