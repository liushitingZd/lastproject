package com.lst.eurekaprovider.model;

public class PermissionRole {
    private Integer rrid;

    private Integer pid;

    private Integer rid;

    public PermissionRole(Integer rrid, Integer pid, Integer rid) {
        this.rrid = rrid;
        this.pid = pid;
        this.rid = rid;
    }

    public PermissionRole() {
        super();
    }

    public Integer getRrid() {
        return rrid;
    }

    public void setRrid(Integer rrid) {
        this.rrid = rrid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
}