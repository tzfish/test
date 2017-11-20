package com.train.model;

import java.util.Date;

import com.train.dao.entity.User;

public class UserInfo extends User{


    private String passwd;

    private String usertp;

    private String sessid;

    private String token;

    private String devitp;

    private Date longti;

 


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


    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public String getUsertp() {
        return usertp;
    }

    public void setUsertp(String usertp) {
        this.usertp = usertp;
    }
}