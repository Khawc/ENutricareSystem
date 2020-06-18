package com.fai.ens.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "[Role]")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "Name", columnDefinition = "VARCHAR(25)")
    private String name;
    @Column(name = "Description", columnDefinition = "VARCHAR(250)")
    private String description;

    @OneToMany(mappedBy = "role")
    private List<RoleHomeMenu> roleHomeMenus;

    public Role() {
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

    public List<RoleHomeMenu> getRoleHomeMenus() {
        return roleHomeMenus;
    }

    public void setRoleHomeMenus(List<RoleHomeMenu> roleHomeMenus) {
        this.roleHomeMenus = roleHomeMenus;
    }
}
