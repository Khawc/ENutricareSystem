package com.fai.ens.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "BodyInfo")
public class BodyInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "Weigth")
    private Double weigth;
    @Column(name = "Height")
    private Double height;
    @Column(name = "Bust")
    private Double bust;
    @Column(name = "Waist")
    private Double waist;
    @Column(name = "Hip")
    private Double hip;
    @Column(name = "ActivityLevel", columnDefinition = "VARCHAR(50)")
    private String activityLevel;
    @Column(name = "CreateTime")
    private LocalTime createTime;
    @Column(name = "UpdateTime")
    private LocalTime updateTime;


    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    public BodyInfo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getWeigth() {
        return weigth;
    }

    public void setWeigth(Double weigth) {
        this.weigth = weigth;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getBust() {
        return bust;
    }

    public void setBust(Double bust) {
        this.bust = bust;
    }

    public Double getWaist() {
        return waist;
    }

    public void setWaist(Double waist) {
        this.waist = waist;
    }

    public Double getHip() {
        return hip;
    }

    public void setHip(Double hip) {
        this.hip = hip;
    }

    public String getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(String activityLevel) {
        this.activityLevel = activityLevel;
    }

    public LocalTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalTime createTime) {
        this.createTime = createTime;
    }

    public LocalTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalTime updateTime) {
        this.updateTime = updateTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
