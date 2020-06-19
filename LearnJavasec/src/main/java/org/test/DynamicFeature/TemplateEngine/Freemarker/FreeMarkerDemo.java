package org.test.DynamicFeature.TemplateEngine.Freemarker;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static freemarker.core.TemplateClassResolver.ALLOWS_NOTHING_RESOLVER;

public class FreeMarkerDemo {

    private static final String TEMPLATE_PATH = "src\\main\\java\\org\\test\\DynamicFeature\\TemplateEngine\\Freemarker\\";

    public static void main(String[] args) {
        //创建配置类
        Configuration configuration = new Configuration();

        try{
            //设置模板所在的目录
            configuration.setDirectoryForTemplateLoading(new File(TEMPLATE_PATH));
            //设置字符集
            configuration.setDefaultEncoding("utf-8");
            configuration.setAPIBuiltinEnabled(true);
            //加载模板
            Template template = configuration.getTemplate("hello.ftl");

            //创建数据模型
            Map map = new HashMap();
            map.put("name", "Vincent");
            map.put("message", "Hello world!");

            List list = new ArrayList();
            list.add("1");
            list.add("2");
            map.put("list", list);

            //创建Writer对象
            Writer out = new FileWriter(new File(TEMPLATE_PATH + "hello.html"));

            //输出
            template.process(map, out);

            out.close();
        } catch (IOException | TemplateException e) {
            e.printStackTrace();
        }
    }
}
