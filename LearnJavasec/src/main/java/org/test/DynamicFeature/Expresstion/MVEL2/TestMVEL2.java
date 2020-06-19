package org.test.DynamicFeature.Expresstion.MVEL2;

import org.mvel2.MVEL;

import java.util.HashMap;
import java.util.Map;

public class TestMVEL2 {
    public static void main(String[] args) {
        String expr = "1+1";
        Map<String, Object> map = new HashMap();
        Object object = MVEL.eval(expr, map);
        System.out.println(object);

        //获取类实例的属性值
        Person p = new Person();
        p.setName("Vincent");
        p.setSex(1);
        p.setAge(25);
        p.setEmail("test@test.com");

        expr = "p.name";
        map.put("p", p);
        object = MVEL.eval(expr, map);
        System.out.println(object);

        //代码执行
        expr = "java.lang.Runtime.getRuntime().exec(\"calc\")";
        object = MVEL.eval(expr, map);

    }
}
