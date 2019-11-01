package com.lst.eurekaprovider.model;

public class User {
    private String uid;

    private String usex;

    private String utel;

    private String upwd;

    private String uemail;

    private String uimage;

    private String utime;

    public User(String uid, String usex, String utel, String upwd, String uemail, String uimage, String utime) {
        this.uid = uid;
        this.usex = usex;
        this.utel = utel;
        this.upwd = upwd;
        this.uemail = uemail;
        this.uimage = uimage;
        this.utime = utime;
    }

    public User() {
        super();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public String getUtel() {
        return utel;
    }

    public void setUtel(String utel) {
        this.utel = utel;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUimage() {
        return uimage;
    }

    public void setUimage(String uimage) {
        this.uimage = uimage;
    }

    public String getUtime() {
        return utime;
    }

    public void setUtime(String utime) {
        this.utime = utime;
    }
}