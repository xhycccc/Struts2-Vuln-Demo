package org.test.action;

import com.opensymphony.xwork2.ActionSupport;

public class CookieAction extends ActionSupport {

    @Override
    public String execute() throws Exception {
        return "success";
    }
}
