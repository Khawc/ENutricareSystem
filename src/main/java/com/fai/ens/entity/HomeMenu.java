package com.fai.ens.entity;

import javax.persistence.*;
import java.awt.*;
import java.util.List;

@Entity
@Table(name = "HomeMenu")
public class HomeMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "Name", columnDefinition = "NVARCHAR(250)", nullable = false)
    private String name;

    @OneToMany(mappedBy = "homeMenu")
    private List<RoleHomeMenu> roleHomeMenu;

    public HomeMenu() {
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

    public List<RoleHomeMenu> getRoleHomeMenu() {
        return roleHomeMenu;
    }

    public void setRoleHomeMenu(List<RoleHomeMenu> roleHomeMenu) {
        this.roleHomeMenu = roleHomeMenu;
    }

}
