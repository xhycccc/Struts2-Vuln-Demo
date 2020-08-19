package org.test;

import com.opensymphony.xwork2.ActionSupport;

public class HelloworldAction extends ActionSupport {
    private String message = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String execute() throws Exception {
        return "success";
    }
}
