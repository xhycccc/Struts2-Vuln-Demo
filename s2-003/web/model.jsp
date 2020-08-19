<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/7/10
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Model Driven Test</title>
</head>
<body>
<p><s:property value="testBean.username"></s:property></p>
<p><s:property value="testBean.password"></s:property></p>
<p><s:property value="testBean.age"></s:property></p>
<s:debug></s:debug>
</body>
</html>
