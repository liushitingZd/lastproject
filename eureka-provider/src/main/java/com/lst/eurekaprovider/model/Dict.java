package com.lst.eurekaprovider.model;

public class Dict {
    private Integer did;

    private String dtype;

    private String dcontent;

    private String djs;

    public Dict(Integer did, String dtype, String dcontent, String djs) {
        this.did = did;
        this.dtype = dtype;
        this.dcontent = dcontent;
        this.djs = djs;
    }

    public Dict() {
        super();
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    public String getDcontent() {
        return dcontent;
    }

    public void setDcontent(String dcontent) {
        this.dcontent = dcontent;
    }

    public String getDjs() {
        return djs;
    }

    public void setDjs(String djs) {
        this.djs = djs;
    }
}