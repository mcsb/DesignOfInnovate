package com.Marcello.Entity;

public class User {

    private String managerId;
    private String managerPwd;
    private String managerTel;


    public User() {
        super();
    }

    public User(Integer userid, String managerPwd, String managerTel) {
        super();
        this.managerId = managerId;
        this.managerPwd = managerPwd;
        this.managerTel = managerTel;
    }



    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getManagerPwd() {
        return managerPwd;
    }

    public void setManagerPwd(String managerPwd) {
        this.managerPwd = managerPwd;
    }

    public String getManagerTel() {
        return managerTel;
    }

    public void setManagerTel(String managerTel) {
        this.managerTel = managerTel;
    }
}