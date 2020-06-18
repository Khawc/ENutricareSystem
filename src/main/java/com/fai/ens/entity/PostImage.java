package com.fai.ens.entity;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "PostImage")
public class PostImage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Image",columnDefinition = "VARCHAR(100)")
    private String image;

    @ManyToOne
    @JoinColumn(name = "PostId")
    private Post post;

    public PostImage() {
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
