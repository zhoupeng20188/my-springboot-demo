package com.example.myspringbootdemo.entity;


import java.io.Serializable;
import java.util.List;

/**
 * @Author zp
 * @create 2020/6/9 9:56
 */
public class Department implements Serializable {
    private int depId;
    private String depName;
    private List<User> user;


    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }
}
