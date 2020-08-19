package org.test;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
    private Integer age = null;

    private String name = null;

    @Override
    public String execute() throws Exception {
        if (this.name.isEmpty() || this.email.isEmpty())
            return "error";
        return "success";
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email = null;
}
