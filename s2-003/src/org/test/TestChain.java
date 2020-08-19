package org.test;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class TestChain extends ActionSupport {

    @Override
    public String execute() throws Exception {
        System.out.println("In TestChain class");
        ActionContext context = ActionContext.getContext();
        ValueStack stack = context.getValueStack();
        Object username = stack.findValue("username");
        System.out.println(username);
        return "success";
    }
}
