package com.fai.ens.entity;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "Diary")
public class Diary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "Description")
    private String description;
    @Column(name = "totalCalories")
    private int totalCalories;
    @Column(name = "TimeLine")
    private LocalTime timeLine;
    @Column(name = "CreateTime")
    private LocalTime creatTime;
    @Column(name = "updateTime")
    private LocalTime updateTime;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @OneToMany(mappedBy = "diary")
    private List<DiaryDetail> diaryDetails;

    public Diary() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<DiaryDetail> getDiaryDetails() {
        return diaryDetails;
    }

    public void setDiaryDetails(List<DiaryDetail> diaryDetails) {
        this.diaryDetails = diaryDetails;
    }

    public LocalTime getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(LocalTime creatTime) {
        this.creatTime = creatTime;
    }

    public LocalTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalTime updateTime) {
        this.updateTime = updateTime;
    }

    public LocalTime getTimeLine() {
        return timeLine;
    }

    public void setTimeLine(LocalTime timeLine) {
        this.timeLine = timeLine;
    }
}
