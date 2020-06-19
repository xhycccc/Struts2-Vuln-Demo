package org.test.DynamicFeature.Expresstion.OGNL;

import ognl.Ognl;
import ognl.OgnlException;

import java.util.*;

public class TestOGNL {

    private static User u = null;
    public static void main(String[] args) throws OgnlException {
        u = new User();
        u.setUsername("Vincent");
        u.setAge(25);
        u.setPassword("23333");

        /*
         * 参数一：填写ognl表达式
         * 参数二：Map -> context上下文
         * 参数三：javaBean/List/Map ... Root 根
         */
        // 根是javaBean
        String username = (String) Ognl.getValue("username", new HashMap(), u);
        System.out.println(username);

        List<User> list = new ArrayList<User>();
        User u1 = new User();
        u1.setUsername("Shirley");
        u1.setAge(26);
        u1.setPassword("23333");

        list.add(u);
        list.add(u1);

        /*
         * 参数一：填写ognl表达式
         * 参数二：Map -> context上下文
         * 参数三：javaBean/List/Map ... Root 根
         */
        // 根是List：Ognl默认从根下去取值
        System.out.println((String)Ognl.getValue("[0].username", new HashMap(), list));
        System.out.println((String)Ognl.getValue("[1].username", new HashMap(), list));

        //调用根中的方法
        Ognl.getValue("[0].setAge(26)", new HashMap(), list);
        System.out.println(u.getAge());

        //运算
        System.out.println((int)Ognl.getValue("1+1", new User())); //根必须要有，但是取值不一定从根中取，所以我们的根就可以随便new一个javaBean对象

        //映射, 得到所有User的username属性的集合
        /*
            默认没有#号的时候为从根中取，不能从根中直接取到的要加#

		    把list设置为根：expr中的this表示根
         */
        System.out.println(Ognl.getValue("#this.size", list));

        // 演示创建Map
        Map map = (Map)Ognl.getValue("#{'name':'Tom', 'age':'18', 'sex':'男'}", new User());
        //还可以指定具体的map类，使用@
        map = (Map)Ognl.getValue("#@java.util.HashMap@{'name':'Tom', 'age':'18', 'sex':'男'}", new User());
        System.out.println(map);

        //@调用类方法
        Object result = Ognl.getValue("@java.lang.Runtime@getRuntime().exec('calc')", new LinkedHashMap());
        System.out.println(result);

    }
}
