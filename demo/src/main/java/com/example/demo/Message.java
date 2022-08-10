package com.example.demo;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class Message {
    
    @Id
    private String messageId;

    private Integer id2;
    private Integer shortId;
    private String headline;
    private String text;
    private String hyperlink;
    private String author;
    private String startDate;
    private String endDate;
    private String publishingDate;
    private String logo;
    private String[] targetGroup;

    Message() {}

    Message(String headline, String text, String hyperlink, String author, String startDate, String endDate, String[] targetGroup) {

        this.headline = headline;
        this.text = text;
        this.hyperlink = hyperlink;
        this.author = author;
        this.startDate = startDate;
        this.endDate = endDate;
        this.targetGroup = targetGroup;
    }

    public String getId() {
        return this.messageId;
    }

    public Integer getId2() {
        return this.id2;
    }

    public Integer getShortId() {
        return this.shortId;
    }

    public String getHeadline() {
        return this.headline;
    }

    public String getText() {
        return this.text;
    }

    public String getHyperlink() {
        return this.hyperlink;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public String getPublishingDate() {
        return this.publishingDate;
    }

    public String getLogo() {
        return this.logo;
    }

    public String[] getTargetGroup() {
        return this.targetGroup;
    }

    public void setId(String id) {
        this.messageId = id;
    }

    public void setId2(Integer id2) {
        this.id2 = id2;
    }

    public void setShortId(Integer shortId) {
        this.shortId = shortId;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setHyperlink(String hyperlink) {
        this.hyperlink = hyperlink;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setPublishingDate(String publishingDate) {
        this.publishingDate = publishingDate;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setTargetGroup(String[] targetGroup) {
        this.targetGroup = targetGroup;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
        return true;
        if (!(o instanceof Message))
        return false;
        Message message = (Message) o;
        return Objects.equals(this.messageId, message.messageId) && Objects.equals(this.id2, message.id2) && Objects.equals(this.shortId, message.shortId)
            && Objects.equals(this.headline, message.headline) && Objects.equals(this.text, message.text) 
            && Objects.equals(this.hyperlink, message.hyperlink) && Objects.equals(this.author, message.author) 
            && Objects.equals(this.startDate, message.startDate) && Objects.equals(this.endDate, message.endDate) 
            && Objects.equals(this.publishingDate, message.publishingDate) && Objects.equals(this.logo, message.logo)
            && Objects.equals(this.targetGroup, message.targetGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.messageId, this.id2, this.shortId, this.headline, this.text, this.hyperlink, this.author, this.startDate, this.endDate, this.publishingDate, this.logo, this.targetGroup);
    }

    @Override
    public String toString() {
        return "Message{" + "id=" + this.messageId + ", headline='" + this.headline + ", id2='" + this.id2
        + '\'' + ", shortId='" + this.shortId + '\'' + ", text='" + this.text + '\'' + ", hyperlink='" + this.hyperlink + '\'' + ", author='" + this.author 
        + '\'' + ", startDate='" + this.startDate + '\'' + ", endDate='" + this.endDate + '\'' + ", publishingDate='" 
        + this.publishingDate + '\'' + ", logo='" + this.logo + '\'' + ", targetGroup='" + this.targetGroup + '}';
    }
}