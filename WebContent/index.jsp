<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<c:set var="path" value="${pageContext.request.contextPath }"></c:set>
<meta charset="UTF-8">
<title>INDEX</title>
</head>
<body>
<h4>ADMIN</h4>
<form action="${path }/admin/adminSignIn" >
        <table>
            <tr>
                <td>用户名</td>
                <td><input name="adminName" value="${admin.adminName }"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input name="password" value="${admin.password }"></td>
            </tr>
            <tr>
                <td><input type="submit" value="SignIN"></td>
            </tr>
        </table>
    </form>