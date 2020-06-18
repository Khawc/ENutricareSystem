package com.fai.ens.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "[User]")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "FirstName",columnDefinition = "NVARCHAR(50)")
    private String firstName;
    @Column(name = "LastName",columnDefinition = "NVARCHAR(50)")
    private String lastName;
    @Column(name = "Email",columnDefinition = "NVARCHAR(250)")
    private String email;
    @Column(name = "Phone",columnDefinition = "NVARCHAR(15)")
    private String phone;
    @Column(name = "Description",columnDefinition = "NVARCHAR(1000)")
    private String description;
    @Column(name = "Address",columnDefinition = "NVARCHAR(500)")
    private String address;
    @Column(name = "Job",columnDefinition = "NVARCHAR(250)")
    private String job;
    @Column(name = "Certificate",columnDefinition = "NVARCHAR(50)")
    private String certificate;
    @Column(name = "Gender",columnDefinition = "VARCHAR(10)")
    private String gender;
    @Column(name = "Image",columnDefinition = "VARCHAR(250)")
    private String image;
    @Column(name = "Birth")
    private LocalDate birth;
    @Column(name = "CreateTime")
    private LocalTime createTime;
    @Column(name = "UpdateTime")
    private LocalTime updateTime;

    @OneToOne
    @JoinColumn(name = "accountId")
    private Account account;

    @OneToMany(mappedBy = "user")
    private List<BodyInfo> bodyInfos;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
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

    public List<BodyInfo> getBodyInfos() {
        return bodyInfos;
    }

    public void setBodyInfos(List<BodyInfo> bodyInfos) {
        this.bodyInfos = bodyInfos;
    }
}
