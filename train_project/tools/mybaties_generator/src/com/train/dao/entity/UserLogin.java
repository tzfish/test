package com.train.dao.entity;

import java.util.Date;

public class UserLogin {
    private Integer userid;

    private String passwd;

    private String sessid;

    private String token;

    private String devitp;

    private Date longti;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public String getSessid() {
        return sessid;
    }

    public void setSessid(String sessid) {
        this.sessid = sessid == null ? null : sessid.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getDevitp() {
        return devitp;
    }

    public void setDevitp(String devitp) {
        this.devitp = devitp == null ? null : devitp.trim();
    }

    public Date getLongti() {
        return longti;
    }

    public void setLongti(Date longti) {
        this.longti = longti;
    }
}