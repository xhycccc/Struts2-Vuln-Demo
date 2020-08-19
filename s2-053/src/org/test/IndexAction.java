package org.test;

import com.opensymphony.xwork2.ActionSupport;

public class
IndexAction extends ActionSupport {
    private String message = "No input";
    @Override
    public String execute() throws Exception {
        return "success";
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
