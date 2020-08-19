package org.test;

import com.opensymphony.xwork2.ActionSupport;

public class RedirectAction extends ActionSupport {
    private String user;

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(user);
        return "success";
    }
}
