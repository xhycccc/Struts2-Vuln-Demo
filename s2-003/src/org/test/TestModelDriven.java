package org.test;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class TestModelDriven  extends ActionSupport implements ModelDriven<TestBean> {

    private TestBean testBean = new TestBean();

    @Override
    public String execute() throws Exception {
        testBean.setUsername("Shelly");
        testBean.setPassword("23333");
        testBean.setAge(26);
        return "success";
    }

    public TestBean getTestBean() {
        return testBean;
    }

    public void setTestBean(TestBean testBean) {
        this.testBean = testBean;
    }

    @Override
    public TestBean getModel() {
        return testBean;
    }
}
