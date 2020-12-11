<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/12/9
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
  <title>S2-061 Demo</title>
</head>
<body>
  <h2>S2-061 Demo</h2>
  <s:label value="Fill in the blank and check the source code." />
  <s:form action="index" method="POST">
    <s:textfield name="name" label="name" id="%{name}" />
    <s:textfield name="age" label="age" id="%{age}" />
    <s:submit value="Submit" />
  </s:form>
</body>
</html>
