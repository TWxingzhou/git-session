<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html charset=gb2312">
</head>
<body>
<c:if test="${googleAnalytics ne ''}">
    <p>这个标签是什么</p>
</c:if>
<h1><fmt:message key="404.title"/></h1>
<c:url var="editUrl" value="/xxx">
    <c:param name="id" value="1" />
</c:url>
<form action="login.do" method="POST">
    <input type="text" name="username"/>
    <input type="password" name="password"/>
    <input type="submit" value="提交"/>
</form>
<%--<c:redirect url="/login" />--%>
</body>
</html>