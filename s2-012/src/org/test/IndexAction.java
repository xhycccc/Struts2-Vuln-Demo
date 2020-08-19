package org.test;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String execute() throws Exception {
        if (!this.name.isEmpty())
            return "redirect";
        return "success";
    }
}
