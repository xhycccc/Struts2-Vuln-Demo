package org.test.DynamicFeature.Expresstion.Groovy;

import groovy.lang.GroovyShell;

import java.io.File;
import java.io.IOException;

public class testGrovvy {

    public static void main(String[] args) throws IOException {
        GroovyShell groovyShell = new GroovyShell();
        Object result = groovyShell.evaluate(new File("src\\main\\java\\org\\test\\DynamicFeature\\Expresstion\\Groovy\\groovy1.groovy"));
    }
}
