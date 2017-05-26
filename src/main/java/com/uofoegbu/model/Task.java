package com.uofoegbu.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table
public class Task {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String Title;

    @Column
    private String details;

    @Column
    private Date expiryDate;

    public Task() {
    }

    public Task(String title, String details, Date expiryDate) {
        Title = title;
        this.details = details;
        this.expiryDate = expiryDate;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}
