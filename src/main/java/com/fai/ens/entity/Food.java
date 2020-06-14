package com.fai.ens.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Image")
    private String image;
    @Column(name = "Water")
    private int water;
    @Column(name = "Protein")
    private int protein;
    @Column(name = "Lipid")
    private int lipid;
    @Column(name = "Glucid")
    private int glucid;
    @Column(name = "Fiber")
    private int fiber;
    @Column(name = "Tro")
    private int tro;
    @Column(name = "Calcium")
    private int calcium;
    @Column(name = "Photpho")
    private int photpho;
    @Column(name = "Iron")
    private int iron;
    @Column(name = "VitaminA")
    private int vitaminA;
    @Column(name = "VitaminB1")
    private int vitaminB1;
    @Column(name = "VitaminB2")
    private int vitaminB2;
    @Column(name = "VitaminC")
    private int vitaminC;
    @Column(name = "VetaCaroten")
    private int betaCaroten;
    @Column(name = "Niacin")
    private int niacin;
    @Column(name = "Valories")
    private int calories;
    @Column(name = "Waste")
    private int waste;
    @Column(name = "Description")
    private String description;
    @Column(name = "Status")
    private Boolean status;

    @OneToMany(mappedBy = "food")
    private List<DiaryDetail> diaryDetails;

    public Food() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getLipid() {
        return lipid;
    }

    public void setLipid(int lipid) {
        this.lipid = lipid;
    }

    public int getGlucid() {
        return glucid;
    }

    public void setGlucid(int glucid) {
        this.glucid = glucid;
    }

    public int getFiber() {
        return fiber;
    }

    public void setFiber(int fiber) {
        this.fiber = fiber;
    }

    public int getTro() {
        return tro;
    }

    public void setTro(int tro) {
        this.tro = tro;
    }

    public int getCalcium() {
        return calcium;
    }

    public void setCalcium(int calcium) {
        this.calcium = calcium;
    }

    public int getPhotpho() {
        return photpho;
    }

    public void setPhotpho(int photpho) {
        this.photpho = photpho;
    }

    public int getIron() {
        return iron;
    }

    public void setIron(int iron) {
        this.iron = iron;
    }

    public int getVitaminA() {
        return vitaminA;
    }

    public void setVitaminA(int vitaminA) {
        this.vitaminA = vitaminA;
    }

    public int getVitaminB1() {
        return vitaminB1;
    }

    public void setVitaminB1(int vitaminB1) {
        this.vitaminB1 = vitaminB1;
    }

    public int getVitaminB2() {
        return vitaminB2;
    }

    public void setVitaminB2(int vitaminB2) {
        this.vitaminB2 = vitaminB2;
    }

    public int getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(int vitaminC) {
        this.vitaminC = vitaminC;
    }

    public int getBetaCaroten() {
        return betaCaroten;
    }

    public void setBetaCaroten(int betaCaroten) {
        this.betaCaroten = betaCaroten;
    }

    public int getNiacin() {
        return niacin;
    }

    public void setNiacin(int niacin) {
        this.niacin = niacin;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getWaste() {
        return waste;
    }

    public void setWaste(int waste) {
        this.waste = waste;
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
