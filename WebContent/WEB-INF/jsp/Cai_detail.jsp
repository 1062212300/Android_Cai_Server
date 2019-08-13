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
		
			<tr>
				<td >
					<img src="${path}/image/${cai.caiImageUrl}" width="100%" height="100%" />	
				</td>
			</tr>
			<tr>
				<td >
				<font size="5"  face="楷体">
				
				菜名：
				
				</font>
				<font size="4">
				${cai.caiName}&nbsp;&nbsp;&nbsp;${cai.caiClass}
				</font>
				</td>	
			</tr>
			<tr>
				<td>
				<font size="5"  face="楷体">介绍：</font>
				<font size="4">${cai.caiDesc}</font></td>
			</tr>
			<tr>
				<td><font size="5"  face="楷体">材料：</font>
				<font size="4">${cai.caiRaw}</font></td>
			</tr>
			<tr>
				<td><font size="5"  face="楷体">方法步骤：</font>
				<font size="4">${cai.caiStep}</font></td>
			</tr>
	
	</table>

</body>
</html>