package com.fai.ens.entity;

import javax.persistence.*;

@Entity
@Table(name = "FoodNutrient")
public class FoodNutrient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Double value;
    private Double net;

    @ManyToOne
    @JoinColumn(name = "FoodId")
    private Food food;

    @ManyToOne
    @JoinColumn(name = "NutrientId")
    private Nutrient nutrient;

    public FoodNutrient() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Nutrient getNutrient() {
        return nutrient;
    }

    public void setNutrient(Nutrient nutrient) {
        this.nutrient = nutrient;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getNet() {
        return net;
    }

    public void setNet(Double net) {
        this.net = net;
    }
}
