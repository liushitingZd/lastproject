package com.lst.eurekaprovider.model;

public class Gjz {
    private Integer jid;

    private Integer gjid;

    private String gjz;

    private String content;

    private String gimage;

    public Gjz(Integer jid, Integer gjid, String gjz, String content, String gimage) {
        this.jid = jid;
        this.gjid = gjid;
        this.gjz = gjz;
        this.content = content;
        this.gimage = gimage;
    }

    public Gjz() {
        super();
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public Integer getGjid() {
        return gjid;
    }

    public void setGjid(Integer gjid) {
        this.gjid = gjid;
    }

    public String getGjz() {
        return gjz;
    }

    public void setGjz(String gjz) {
        this.gjz = gjz;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getGimage() {
        return gimage;
    }

    public void setGimage(String gimage) {
        this.gimage = gimage;
    }
}