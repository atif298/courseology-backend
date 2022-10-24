package com.project.courseology;

import java.time.LocalDate;

public class Course {

    private long id;

    private String name;

    private String category;

    private String duration;

    private int price;

    private int modules;

    private String summary;

    private String author;

    private LocalDate dateCreated = LocalDate.now();

    public Course(long id, String name, String category, String duration, int price, int modules, String summary, String author, LocalDate dateCreated) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.duration = duration;
        this.price = price;
        this.modules = modules;
        this.summary = summary;
        this.author = author;
        this.dateCreated = dateCreated;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getModules() {
        return modules;
    }

    public void setModules(int modules) {
        this.modules = modules;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }
}
