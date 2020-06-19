package org.test.DynamicFeature.TemplateEngine.Velocity;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VelocityTest {
    public static void main(String[] args) {
        VelocityEngine ve = new VelocityEngine();
        Template template = ve.getTemplate("src\\main\\java\\org\\test\\DynamicFeature\\TemplateEngine\\Velocity\\hello.vm");
        VelocityContext ctx = new VelocityContext();

        ctx.put("name", "Vincent");
        ctx.put("date", (new Date()).toString());

        List temp = new ArrayList();
        temp.add("1");
        temp.add("2");
        ctx.put("list", temp);

        StringWriter sw = new StringWriter();
        template.merge(ctx, sw);
        System.out.println(sw.toString());

    }
}
