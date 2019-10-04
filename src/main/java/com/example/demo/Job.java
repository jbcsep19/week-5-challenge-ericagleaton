package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;


@Entity
public class Job {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @Size(min = 4, message = "Please provide the Author's name (at least 4 characters.)")
    private String author;


    @Size(min = 4, message = "Please provide the Employer Name (at least 4 characters.)")
    private String employer;


    @Size(min = 3, message = "Please provide Job Title (at least 3 characters.)")
    private String title;


    @Size(min = 10, message = "Please provide a brief Job Description (at least 10 characters.)")
    private String description;

    @DateTimeFormat(pattern = "yyyy-MM-dd")

    private Date date;


    @Size(min = 10, message = "Please provide a Phone (at least 10 characters.)")
    private String phone;

    public Job() {
    }
    public Job(@Size(min = 4, message = "Please provide the Author's name (at least 4 characters.)") String author, @Size(min = 4, message = "Please provide the Employer Name (at least 4 characters.)") String employer, @Size(min = 3, message = "Please provide Job Title (at least 3 characters.)") String title, @Size(min = 10, message = "Please provide a brief Job Description (at least 10 characters.)") String description, Date date, @Size(min = 10, message = "Please provide a Phone (at least 10 characters.)") String phone) {
        this.author = author;
        this.employer = employer;
        this.title = title;
        this.description = description;
        this.date = date;
        this.phone = phone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}