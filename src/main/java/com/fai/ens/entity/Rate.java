package com.fai.ens.entity;

import javax.persistence.*;

@Entity
@Table(name = "Rate")
public class Rate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "AccountId")
    private Account account;
    @ManyToOne
    @JoinColumn(name = "PostId")
    private Post post;
    @ManyToOne
    @JoinColumn(name = "Blog")
    private Blog blog;

    public Rate() {
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

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }
}
