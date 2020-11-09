package com.example.myapplication.entity;

import java.util.Date;

public class weixin {
    // 头像链接
    public String avatar;
    //姓名
    private String name;
    // 最后通信时间
    private String lastTime;
    //最后通信内容
    private String Content;

    public weixin(String avatar, String name, String lastTime, String content) {
        this.avatar = avatar;
        this.name = name;
        this.lastTime = lastTime;
        Content = content;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
