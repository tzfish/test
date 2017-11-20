package com.train.dao.entity;

import java.util.Date;

public class Task {
    private Integer taskid;

    private String title;

    private String content;

    private String image;

    private Date beginti;

    private Date endti;

    private Date taskti;

    private String level;

    private String tasktp;

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Date getBeginti() {
        return beginti;
    }

    public void setBeginti(Date beginti) {
        this.beginti = beginti;
    }

    public Date getEndti() {
        return endti;
    }

    public void setEndti(Date endti) {
        this.endti = endti;
    }

    public Date getTaskti() {
        return taskti;
    }

    public void setTaskti(Date taskti) {
        this.taskti = taskti;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getTasktp() {
        return tasktp;
    }

    public void setTasktp(String tasktp) {
        this.tasktp = tasktp == null ? null : tasktp.trim();
    }
}