package com.example.basicgmailapp;

public class Gmail {
    String sender;
    String title;
    String content;
    String receiveTime;

    public Gmail(String sender, String title, String content, String receiveTime) {
        this.sender = sender;
        this.title = title;
        this.content = content;
        this.receiveTime = receiveTime;
    }

    public Gmail() {
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime;
    }

}
