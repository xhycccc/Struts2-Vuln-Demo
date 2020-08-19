package org.test;

import com.opensymphony.xwork2.ActionSupport;

public class LoginActoin extends ActionSupport {

    private String username;
    private String password;

    @Override
    public String execute() throws Exception {
        if ((this.username.isEmpty()) || (this.password.isEmpty())) {
            return "error";
        }
        if ((this.username.equals("admin"))
                && (this.password.equals("admin"))) {
            return "success";
        }
        return "error";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
