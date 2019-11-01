package com.lst.eurekaprovider.model;

public class Signs {
    private String accno;

    private String type;

    private String ostate;

    private String vouchertypeno;

    private String voucherno;

    private String operno;

    private String opertime;

    public Signs(String accno, String type, String ostate, String vouchertypeno, String voucherno, String operno, String opertime) {
        this.accno = accno;
        this.type = type;
        this.ostate = ostate;
        this.vouchertypeno = vouchertypeno;
        this.voucherno = voucherno;
        this.operno = operno;
        this.opertime = opertime;
    }

    public Signs() {
        super();
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOstate() {
        return ostate;
    }

    public void setOstate(String ostate) {
        this.ostate = ostate;
    }

    public String getVouchertypeno() {
        return vouchertypeno;
    }

    public void setVouchertypeno(String vouchertypeno) {
        this.vouchertypeno = vouchertypeno;
    }

    public String getVoucherno() {
        return voucherno;
    }

    public void setVoucherno(String voucherno) {
        this.voucherno = voucherno;
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
}