package com.fai.ens.entity;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "Account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "Account",columnDefinition = "VARCHAR(50)",nullable = false)
    private String account;
    @Column(name = "Password",columnDefinition = "VARCHAR(50)",nullable = false)
    private String password;
    @Column(name = "Status")
    private Boolean status;
    @Column(name = "CreateTime")
    private LocalTime createTime;
    @Column(name = "UpdateTime")
    private LocalTime updateTime;

    @OneToOne(mappedBy = "account")
    private User user;

    @OneToMany(mappedBy = "account")
    private List<Post> posts;

    @OneToMany(mappedBy = "account")
    private List<Comment> comment;

    public Account() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }
}
