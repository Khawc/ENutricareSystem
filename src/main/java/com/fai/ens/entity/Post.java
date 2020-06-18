package com.fai.ens.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "Post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @JoinColumn(name = "Title")
    private int title;
    @JoinColumn(name = "Description")
    private String description;
    @JoinColumn(name = "Content")
    private String content;
    @JoinColumn(name = "CreateTime")
    private LocalTime createTime;
    @JoinColumn(name = "UpdateTime")
    private LocalTime updateTime;

    @ManyToOne
    @JoinColumn(name = "AccountId")
    private Account account;

    @OneToMany(mappedBy = "post")
    private List<PostImage> postImages;

    @OneToMany(mappedBy = "post")
    private List<Comment> comments;

    public Post() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<PostImage> getPostImages() {
        return postImages;
    }

    public void setPostImages(List<PostImage> postImages) {
        this.postImages = postImages;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
