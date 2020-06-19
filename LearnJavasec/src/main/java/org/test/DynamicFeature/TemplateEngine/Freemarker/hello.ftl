<html>

<head>

    <meta charset="utf-8">

    <title>Freemarker入门小DEMO </title>

</head>

<body>

<#--我只是一个注释，我不会有任何输出  -->

${name},你好。${message}

<#assign cmd="calc">
定义变量cmd: ${cmd}

<#--
执行命令：
<#assign value="freemarker.template.utility.Execute"?new()>
${value("${cmd}")}
-->
内建函数：
<#assign testString="hello world">
upper_case: ${testString?upper_case}
length: ${testString?length}

</body>

</html>