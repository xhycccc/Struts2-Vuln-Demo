package org.test;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class TestPrepare extends ActionSupport implements Preparable {

    private String username;

    public String getUsername() {
        return username;
    }

    @Override
    public String execute() throws Exception {
        username = "Shelly";
        System.out.println("In execute");
        return "chain";
    }

    @Override
    public void prepare() throws Exception {
        System.out.println("In prepare()");
    }

    public void prepareExecute() throws Exception{
        System.out.println("In prepareExecute()");
    }

    public void prepareDoExecute() throws Exception{
        System.out.println("In prepareDoExecute()");
    }
}
