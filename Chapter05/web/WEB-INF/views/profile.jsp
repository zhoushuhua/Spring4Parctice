<%--
  Created by IntelliJ IDEA.
  User: zhoush
  Date: 2018/4/14
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <h1>Your Profile</h1>
    <c:out value="${spittler.username}"/><br />
    <c:out value="${spittler.firstName}"/>
    <c:out value="${spittler.lastName}"/>
  </body>
</html>
