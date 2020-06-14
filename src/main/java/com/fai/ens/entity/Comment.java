package com.fai.ens.entity;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "Commment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "Content")
    private String content;
    @Column(name = "CreateTime")
    private LocalTime createTime;
    @Column(name = "UpdateTime")
    private LocalTime updateTime;
    @ManyToOne
    @JoinColumn(name = "CommentId")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    public Comment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
