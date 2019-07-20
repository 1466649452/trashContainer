<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<c:if test="${sessionScope.cityclass==null }">
	<jsp:forward page="QueryClassServlet"></jsp:forward>
</c:if>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		<form action="querytrashservlet" method="post">
			<input type="text" name="checkWord"/><br>
			<input type="submit" value="查询" />
		</form>
		<br><br>
		<!-- 前端显示查询数据信息 -->
		<table>
			<tr>
				<c:forEach var="checkans" items="${sessionScope.ansArr }">
				<td>
					${checkans.getTrashname() }
				</td>	
				</c:forEach>
			</tr>
		</table>
		
		
		<!--此处需要使用css等文件做成一个可以点击的颜色块 -->
		<table>
			<tr>
				<c:forEach var="junkclass" items="${sessionScope.cityclass }">
				<td>
					<a href="ShowTrashListServlet?junkclass_classid=${junkclass.classid }" >${junkclass.classname }</a>
					
				</td>	
				</c:forEach>
			</tr>
		</table>
		<table>
			<tr>
				<c:forEach var="detailclass" items="${sessionScope.detailclass }">
				<td>
					${detailclass.trashname }
				</td>	
				</c:forEach>
			</tr>
		</table>
	</body>
</html>
