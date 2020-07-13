package org.test;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

    private String foo;
    @Override
    public String execute() throws Exception {
        return "success";
    }

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }
}
