package com.fai.ens.entity;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "Diary")
public class Diary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "Description")
    private String description;
    @Column(name = "totalCalories")
    private int totalCalories;
    @Column(name = "CreateDate")
    private LocalTime createDate;
    @Column(name = "UpdateDate")
    private LocalTime updateDate;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    public Diary() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(int totalCalories) {
        this.totalCalories = totalCalories;
    }

    public LocalTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalTime createDate) {
        this.createDate = createDate;
    }

    public LocalTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalTime updateDate) {
        this.updateDate = updateDate;
    }
}
