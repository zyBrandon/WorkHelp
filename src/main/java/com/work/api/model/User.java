package com.work.api.model;

public class User {
    private String username;
    private String pass;
    private String name;
    private String sex;
    private String phone;
    public User(){

    }

    public User(String username,String pass,String name,String sex,String phone){
        this.username = username;
        this.pass = pass;
        this.name = name;
        this.sex = sex;
        this.phone = phone;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
