<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<c:set var="path" value="${pageContext.request.contextPath }"></c:set>
<meta charset="UTF-8">
<title>user CRUD</title>
</head>
<body>
<th><a href="${path}/admin/addUser">添加用户</a></th>
<br>
 <table width="60%" border="1" cellpadding="2" cellspacing="0">
 
        <tr>
            <th>用户ID</th>
            <th>用户名</th>
            <th>账号</th>
            <th>密码</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${users}" var="user">
        
            <tr>
                <td >${user.id}</td>
                <td >${user.userName}</td>
                <td>${user.account}</td>
                <td>${user.password}</td>
                <td><a href="${path}/admin/deleteUser?userId=${user.id}"  >删除用户</a></td>
            </tr>
s
            
        </c:forEach>
    </table>
/***************************************************/FOODS
<br/>
<th><a href="${path}/admin/addCai">添加美食</a></th>
<br>
 <table width="60%" border="1" cellpadding="2" cellspacing="0">
 
        <tr>
            <th>菜名</th>
            <th>描述</th>
            <th>菜系</th>
            <th>原料</th>
            <th>步骤</th>
            <th>图片URL</th>
        </tr>
        <c:forEach items="${cais}" var="cai">
        
            <tr>
                <td >${cai.caiName}</td>
                <td>${cai.caiDesc}</td>
                <td>${cai.caiClass}</td>
                <td >${cai.caiRaw}</td>
                <td>${cai.caiStep}</td>
                <td>${cai.caiImageUrl}</td>
               
            </tr>

            
        </c:forEach>
    </table>
</body>
</html>