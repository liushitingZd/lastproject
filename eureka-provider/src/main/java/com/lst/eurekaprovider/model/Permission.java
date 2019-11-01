package com.lst.eurekaprovider.model;

public class Permission {
    private Integer pid;

    private String pname;

    private Integer level;

    private Integer ppid;

    private Integer available;

    private String permission;

    public Permission(Integer pid, String pname, Integer level, Integer ppid, Integer available, String permission) {
        this.pid = pid;
        this.pname = pname;
        this.level = level;
        this.ppid = ppid;
        this.available = available;
        this.permission = permission;
    }

    public Permission() {
        super();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getPpid() {
        return ppid;
    }

    public void setPpid(Integer ppid) {
        this.ppid = ppid;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}