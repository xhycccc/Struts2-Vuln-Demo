<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/6/11
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>S2-001 Demo</title>
  </head>
  <body>
  <h2>S2-001 Demo</h2>
  <s:form action="login">
    <s:textfield name="username" label="username" />
    <s:textfield name="password" label="password" />
    <s:submit></s:submit>
  </s:form>
  </body>
</html>
