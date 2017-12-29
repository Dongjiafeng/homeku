package com.lan3g.study;

public class User {
    private  String name;
    private  String gender;
    private  String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public User(String name, String gender, String age) {

        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
