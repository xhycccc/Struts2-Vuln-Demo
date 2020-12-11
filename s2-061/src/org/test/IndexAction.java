package org.test;

public class IndexAction {
    private String name;
    private String age;

    public String execute() {
        System.out.println(this.name);
        System.out.println(this.age);
        return "success";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
