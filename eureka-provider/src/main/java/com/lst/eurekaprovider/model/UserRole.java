package com.lst.eurekaprovider.model;

public class UserRole {
    private Integer urid;

    private String uid;

    private Integer rid;

    public UserRole(Integer urid, String uid, Integer rid) {
        this.urid = urid;
        this.uid = uid;
        this.rid = rid;
    }

    public UserRole() {
        super();
    }

    public Integer getUrid() {
        return urid;
    }

    public void setUrid(Integer urid) {
        this.urid = urid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
}