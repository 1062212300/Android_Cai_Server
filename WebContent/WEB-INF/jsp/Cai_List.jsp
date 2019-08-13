<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<c:set var="path" value="${pageContext.request.contextPath }"></c:set>
<meta charset="UTF-8">
<title>TESTTESTTESTTEST</title>
</head>
<body>
	<table>
		<c:forEach items="${cais}" var="cai">
			<tr>
				<td width="25% " rowspan="2">
					<img src="${path}/image/${cai.caiImageUrl}" width="100px" height="100px" />	
				</td>
				<td><a href="${path}/searchCaiById?cName=${cai.caiName}">菜名：${cai.caiName}</a></td>	
			</tr>
			<tr>
				<td>介绍：${cai.caiDesc}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>