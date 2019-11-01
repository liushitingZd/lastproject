package com.lst.eurekaprovider.model;

public class WxAccinfo {
    private String accno;

    private String accname;

    private String cname;

    private String phone;

    private String platkey;

    private String summary;

    private String operno;

    private String opertime;

    private String state;

    public WxAccinfo(String accno, String accname, String cname, String phone, String platkey, String summary, String operno, String opertime, String state) {
        this.accno = accno;
        this.accname = accname;
        this.cname = cname;
        this.phone = phone;
        this.platkey = platkey;
        this.summary = summary;
        this.operno = operno;
        this.opertime = opertime;
        this.state = state;
    }

    public WxAccinfo() {
        super();
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public String getAccname() {
        return accname;
    }

    public void setAccname(String accname) {
        this.accname = accname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPlatkey() {
        return platkey;
    }

    public void setPlatkey(String platkey) {
        this.platkey = platkey;
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
}