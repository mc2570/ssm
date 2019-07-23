package com.zking.model;

public class User {
    private Integer userid;

    private String username;

    private Integer userage;

    private String userpassword;

    private String usersex;

    public User(Integer userid, String username, Integer userage, String userpassword, String usersex) {
        this.userid = userid;
        this.username = username;
        this.userage = userage;
        this.userpassword = userpassword;
        this.usersex = usersex;
    }

    public User() {
        super();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }
}