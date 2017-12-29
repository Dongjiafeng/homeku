package com.lanou3g.study;

public class User {
    private  String uname;
    private  String loc;
    private  int age;
    private  int uid;

    public User() {
    }

    public User(String uname, String loc, int age, int uid) {

        this.uname = uname;
        this.loc = loc;
        this.age = age;
        this.uid = uid;
    }

    public String getUname() {

        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return uid;
    }

    public void setId(int id) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", loc='" + loc + '\'' +
                ", age=" + age +
                ", id=" + uid +
                '}';
    }
}
