package com.lst.eurekaprovider.model;

public class RoleGn {
    private Integer rgid;

    private Integer rid;

    private String gdesc;

    private Integer available;

    public RoleGn(Integer rgid, Integer rid, String gdesc, Integer available) {
        this.rgid = rgid;
        this.rid = rid;
        this.gdesc = gdesc;
        this.available = available;
    }

    public RoleGn() {
        super();
    }

    public Integer getRgid() {
        return rgid;
    }

    public void setRgid(Integer rgid) {
        this.rgid = rgid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getGdesc() {
        return gdesc;
    }

    public void setGdesc(String gdesc) {
        this.gdesc = gdesc;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }
}