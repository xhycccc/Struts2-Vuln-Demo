package org.test.DynamicFeature.MethodHandler;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/*
    运行条件： JDK7
 */


public class MethodHandleTest {
    public static void main(String[] args) throws Throwable {
        MethodType mt;
        MethodHandle mh;
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        mt = MethodType.methodType(String.class, char.class, char.class);
        mh = lookup.findVirtual(String.class, "replace", mt);
        String s = (String) mh.invokeExact("daddy",'d','n');
        System.out.println(s);

        mt = MethodType.methodType(void.class, String.class);
        mh = lookup.findVirtual(java.io.PrintStream.class, "println", mt);
        mh.invokeExact(System.out, "Hello, world.");

        mt = MethodType.methodType(Runtime.class);
        mh = lookup.findStatic(Runtime.class, "getRuntime", mt);
        Runtime obj = (Runtime)mh.invokeExact();
        obj.exec("calc");
    }
}
