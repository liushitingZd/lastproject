package com.lst.eurekaprovider.model;

public class GjzType {
    private Integer gjid;

    private String type;

    public GjzType(Integer gjid, String type) {
        this.gjid = gjid;
        this.type = type;
    }

    public GjzType() {
        super();
    }

    public Integer getGjid() {
        return gjid;
    }

    public void setGjid(Integer gjid) {
        this.gjid = gjid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}