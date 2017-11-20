package com.train.dao.entity;

import java.util.Date;

public class User {
    private Integer userid;

    private String userna;

    private Date jointi;

    private String mobile;

    private String eMail;

    private Integer classid;

    private Integer famyid;

    private String cityno;

    private String pingyna;

    private String status;

    private Date borndt;

    private String imgpath;

    private String gender;

    private String role;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUserna() {
        return userna;
    }

    public void setUserna(String userna) {
        this.userna = userna == null ? null : userna.trim();
    }

    public Date getJointi() {
        return jointi;
    }

    public void setJointi(Date jointi) {
        this.jointi = jointi;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail == null ? null : eMail.trim();
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Integer getFamyid() {
        return famyid;
    }

    public void setFamyid(Integer famyid) {
        this.famyid = famyid;
    }

    public String getCityno() {
        return cityno;
    }

    public void setCityno(String cityno) {
        this.cityno = cityno == null ? null : cityno.trim();
    }

    public String getPingyna() {
        return pingyna;
    }

    public void setPingyna(String pingyna) {
        this.pingyna = pingyna == null ? null : pingyna.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getBorndt() {
        return borndt;
    }

    public void setBorndt(Date borndt) {
        this.borndt = borndt;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath == null ? null : imgpath.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }
}