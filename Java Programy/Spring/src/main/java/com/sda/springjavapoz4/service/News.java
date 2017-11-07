package com.sda.springjavapoz4.service;

import com.sda.springjavapoz4.model.User;

import java.time.LocalDate;

public class News {

    private Long id;
    private String title;
    private String description;
    private LocalDate date;
    private String smallImgPath;
    private String bigImgPath;
    private User author;


    public News(Long id, String title, String description, LocalDate date, String smallImgPath, String bigImgPath, User author) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
        this.smallImgPath = smallImgPath;
        this.bigImgPath = bigImgPath;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getSmallImgPath() {
        return smallImgPath;
    }

    public void setSmallImgPath(String smallImgPath) {
        this.smallImgPath = smallImgPath;
    }

    public String getBigImgPath() {
        return bigImgPath;
    }

    public void setBigImgPath(String bigImgPath) {
        this.bigImgPath = bigImgPath;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", smallImgPath='" + smallImgPath + '\'' +
                ", bigImgPath='" + bigImgPath + '\'' +
                ", author=" + author +
                '}';
    }
}