package com.fai.ens.entity;

import javax.persistence.*;

@Entity
@Table(name = "RoleHomeMenu")
public class RoleHomeMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name = "RoleId")
    private Role role;
    @ManyToOne
    @JoinColumn(name = "HomeMenuId")
    private HomeMenu homeMenu;

    public RoleHomeMenu() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public HomeMenu getHomeMenu() {
        return homeMenu;
    }

    public void setHomeMenu(HomeMenu homeMenu) {
        this.homeMenu = homeMenu;
    }
}
