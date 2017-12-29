package com.lanou3g.Homework1;

public class Person {
    private  String name;
    private  String users;
    private  String possword;
    private  String occupation;

    public Person(String name, String users, String possword, String occupation) {
        this.name = name;
        this.users = users;
        this.possword = possword;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public String getPossword() {
        return possword;
    }

    public void setPossword(String possword) {
        this.possword = possword;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
