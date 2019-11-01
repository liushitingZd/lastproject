package com.lst.eurekaprovider.model;

public class Jg {
    private Integer jgid;

    private String jgname;

    private String jgcz;

    public Jg(Integer jgid, String jgname, String jgcz) {
        this.jgid = jgid;
        this.jgname = jgname;
        this.jgcz = jgcz;
    }

    public Jg() {
        super();
    }

    public Integer getJgid() {
        return jgid;
    }

    public void setJgid(Integer jgid) {
        this.jgid = jgid;
    }

    public String getJgname() {
        return jgname;
    }

    public void setJgname(String jgname) {
        this.jgname = jgname;
    }

    public String getJgcz() {
        return jgcz;
    }

    public void setJgcz(String jgcz) {
        this.jgcz = jgcz;
    }
}