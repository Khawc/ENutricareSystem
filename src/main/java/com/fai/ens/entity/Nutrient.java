package com.fai.ens.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Nutrient")
public class Nutrient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;

    @OneToMany(mappedBy = "nutrient")
    private List<FoodNutrient> foodNutrients;
    public Nutrient() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
