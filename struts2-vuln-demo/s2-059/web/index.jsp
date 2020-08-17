<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/8/17
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
  <head>
    <title>S2-059 Demo</title>
  </head>
  <body>
  <h2>S2-059 Demo</h2>
  <s:url var="url" action="index"/><s:a id="%{skillName}" href="%{url}">List available Employees</s:a>
  <s:form action="index" method="POST">
    <s:textfield name="skillName" label="skillName"/>
    <s:textfield name="url" label="url"/>
    <s:submit value="Submit" />
  </s:form>

  </body>
</html>
