package com.train.dao.entity;

import java.util.Date;

public class Family {
    private Integer famyid;

    private String famyna;

    private String detail;

    private Date creati;

    public Integer getFamyid() {
        return famyid;
    }

    public void setFamyid(Integer famyid) {
        this.famyid = famyid;
    }

    public String getFamyna() {
        return famyna;
    }

    public void setFamyna(String famyna) {
        this.famyna = famyna == null ? null : famyna.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public Date getCreati() {
        return creati;
    }

    public void setCreati(Date creati) {
        this.creati = creati;
    }
}