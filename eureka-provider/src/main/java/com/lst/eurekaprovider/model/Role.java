package com.lst.eurekaprovider.model;

public class Role {
    private Integer rid;

    private String rname;

    private String desca;

    private Integer available;

    public Role(Integer rid, String rname, String desca, Integer available) {
        this.rid = rid;
        this.rname = rname;
        this.desca = desca;
        this.available = available;
    }

    public Role() {
        super();
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getDesca() {
        return desca;
    }

    public void setDesca(String desca) {
        this.desca = desca;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }
}