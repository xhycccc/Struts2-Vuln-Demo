<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/6/19
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>S2-007</title>
  </head>
  <body>
  <h2>S2-007 Demo</h2>
  <s:form action="user">
    <s:textfield name="name" label="name" />
    <s:textfield name="email" label="email"/>
    <s:textfield name="age" label="age"/>
    <s:submit />
  </s:form>
  </body>
</html>
