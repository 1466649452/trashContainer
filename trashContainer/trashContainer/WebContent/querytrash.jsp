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
		<form action="querytrashservlet">
			<input type="text" name="checkWord"/><br>
			<input type="submit" value="查询" />
		</form>
		${sessionScope.ansArr.get(0).getTrashname()}
	</body>
</html>
