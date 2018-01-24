package com.fk.model;

import java.util.Date;

public class User {
    private Integer userid;

    private String username;

    private String realname;

    private String password;

    private Integer islock;

    private Date createtime;

    public User(Integer userid, String username, String realname, String password, Integer islock, Date createtime) {
        this.userid = userid;
        this.username = username;
        this.realname = realname;
        this.password = password;
        this.islock = islock;
        this.createtime = createtime;
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
        this.username = username == null ? null : username.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getIslock() {
        return islock;
    }

    public void setIslock(Integer islock) {
        this.islock = islock;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}