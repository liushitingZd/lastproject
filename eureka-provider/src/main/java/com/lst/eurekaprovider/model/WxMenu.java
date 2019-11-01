package com.lst.eurekaprovider.model;

public class WxMenu {
    private String accno;

    private String menuname;

    private String subname;

    private Integer seqno;

    private String menukey;

    private String summary;

    private String operno;

    private String opertime;

    private String state;

    private String isupdate;

    private String uptime;

    private String upstate;

    public WxMenu(String accno, String menuname, String subname, Integer seqno, String menukey, String summary, String operno, String opertime, String state, String isupdate, String uptime, String upstate) {
        this.accno = accno;
        this.menuname = menuname;
        this.subname = subname;
        this.seqno = seqno;
        this.menukey = menukey;
        this.summary = summary;
        this.operno = operno;
        this.opertime = opertime;
        this.state = state;
        this.isupdate = isupdate;
        this.uptime = uptime;
        this.upstate = upstate;
    }

    public WxMenu() {
        super();
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public Integer getSeqno() {
        return seqno;
    }

    public void setSeqno(Integer seqno) {
        this.seqno = seqno;
    }

    public String getMenukey() {
        return menukey;
    }

    public void setMenukey(String menukey) {
        this.menukey = menukey;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getOperno() {
        return operno;
    }

    public void setOperno(String operno) {
        this.operno = operno;
    }

    public String getOpertime() {
        return opertime;
    }

    public void setOpertime(String opertime) {
        this.opertime = opertime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getIsupdate() {
        return isupdate;
    }

    public void setIsupdate(String isupdate) {
        this.isupdate = isupdate;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public String getUpstate() {
        return upstate;
    }

    public void setUpstate(String upstate) {
        this.upstate = upstate;
    }
}