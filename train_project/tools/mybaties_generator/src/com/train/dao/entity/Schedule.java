package com.train.dao.entity;

import java.util.Date;

public class Schedule {
    private Integer schdid;

    private Integer userid;

    private String title;

    private String content;

    private Date schdti;

    private String schdtp;

    private String alerttp;

    private Date alerti;

    private String status;

    private Date creati;

    private Integer linkid;

    public Integer getSchdid() {
        return schdid;
    }

    public void setSchdid(Integer schdid) {
        this.schdid = schdid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getSchdti() {
        return schdti;
    }

    public void setSchdti(Date schdti) {
        this.schdti = schdti;
    }

    public String getSchdtp() {
        return schdtp;
    }

    public void setSchdtp(String schdtp) {
        this.schdtp = schdtp == null ? null : schdtp.trim();
    }

    public String getAlerttp() {
        return alerttp;
    }

    public void setAlerttp(String alerttp) {
        this.alerttp = alerttp == null ? null : alerttp.trim();
    }

    public Date getAlerti() {
        return alerti;
    }

    public void setAlerti(Date alerti) {
        this.alerti = alerti;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreati() {
        return creati;
    }

    public void setCreati(Date creati) {
        this.creati = creati;
    }

    public Integer getLinkid() {
        return linkid;
    }

    public void setLinkid(Integer linkid) {
        this.linkid = linkid;
    }
}