package com.train.dao.entity;

import java.util.Date;

public class TrainClass {
    private Integer classno;

    private String classna;

    private Date creatti;

    private String level;

    private Integer schlid;

    private Integer userid;

    private String tag;

    private String detail;

    public Integer getClassno() {
        return classno;
    }

    public void setClassno(Integer classno) {
        this.classno = classno;
    }

    public String getClassna() {
        return classna;
    }

    public void setClassna(String classna) {
        this.classna = classna == null ? null : classna.trim();
    }

    public Date getCreatti() {
        return creatti;
    }

    public void setCreatti(Date creatti) {
        this.creatti = creatti;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public Integer getSchlid() {
        return schlid;
    }

    public void setSchlid(Integer schlid) {
        this.schlid = schlid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}