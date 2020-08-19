<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/7/23
  Time: 18:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>S2-032 Demo</title>
  </head>
  <body>
    <h1>S2-032 Demo</h1>
    <a href="<s:url action="index"></s:url>">默认调用execute方法</a><br/>
    <a href="<s:url action="index!dmi"></s:url>">DMI动态方法调用：index!dmi</a>
  </body>
</html>
