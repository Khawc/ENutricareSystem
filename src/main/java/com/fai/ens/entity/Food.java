package com.fai.ens.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Image")
    private String image;
    @Column(name = "Description")
    private String description;
    @Column(name = "Status")
    private Boolean status;

    @OneToMany(mappedBy = "food")
    private List<DiaryDetail> diaryDetails;

    public Food() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<DiaryDetail> getDiaryDetails() {
        return diaryDetails;
    }

    public void setDiaryDetails(List<DiaryDetail> diaryDetails) {
        this.diaryDetails = diaryDetails;
    }
}
