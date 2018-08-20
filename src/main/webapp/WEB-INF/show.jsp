<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/4 0004
  Time: 下午 1:21
  To change this template use File | Settings | File Templates.
--%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPEhtmlPUBLIC"-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type"content="text/html; charset=ISO-8859-1">
    <title>Show</title>
</head>
<body>
<h1>Information of this person:</h1>
Name:${person.name}<br/>
Age:${person.age}<br/>
Favorites:
<c:forEach var="fav" items="${person.favorites}">
${fav};
</c:forEach>
<br/>
Friends:
<c:forEach var="fri" items="${person.friends}">
${fri.key},${fri.value};
</c:forEach>
</body>
</html>
