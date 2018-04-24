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
    <title>Spittle</title>
  </head>
  <body>
    <div class="spittleMessgae">
      <div><c:out value="${spittle.message}" /></div>
      <div><c:out value="${spittle.time}"/></div>
    </div>
  </body>
</html>
