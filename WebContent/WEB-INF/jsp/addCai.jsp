<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<c:set var="path" value="${pageContext.request.contextPath }"></c:set>
<meta charset="UTF-8">
<title>ADD FOOD</title>
</head>
<body>
<form action="${path }/admin/saveCai" method="post">
        <table>
            <tr>
                <td>菜名</td>
                <td><input name="caiName" value="${cai.caiName }"></td>
            </tr>
            <tr>
                <td>描述</td>
                <td><input name="caiDesc" value="${cai.caiDesc }"></td>
            </tr>
             <tr>
                <td>菜系</td>
                <td><input name="caiClass" value="${cai.caiClass }"></td>
            </tr>
             <tr>
                <td>原料</td>
                <td><input name="caiRaw" value="${cai.caiRaw }"></td>
            </tr>
             <tr>
                <td>步骤</td>
                <td><input name="caiStep" value="${cai.caiStep }"></td>
            </tr>
             <tr>
                <td>图片URL</td>
                <td><input name="caiImageUrl" value="${cai.caiImageUrl }"></td>
            </tr>
            <tr>
                <td><input type="submit" value="保存"></td>
            </tr>
        </table>
    </form>
</body>
</html>