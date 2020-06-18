package com.fai.ens.entity;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "[AccountRole]")
public class AccountRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "AccountId")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "roleId")
    private Role role;

    public AccountRole() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
