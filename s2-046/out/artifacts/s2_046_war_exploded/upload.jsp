<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/7/24
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Upload</title>
</head>
<body>
    <h1>FileUpload sample</h1>
    <div>
        <s:actionerror />
        <s:fielderror />
        <s:form action="Upload" method="POST" enctype="multipart/form-data">
            <s:file name="upload" label="File" />
            <s:textfield name="caption" label="Caption" />
            <s:submit />
        </s:form>

    </div>
</body>
</html>
