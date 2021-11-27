package com.example.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity // This tells Hibernate to make a table out of this class
public class Member {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;
    private String address;
    private String email;
    private String phone;
    private LocalDate memSince;
    private int memDuration;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public LocalDate getMemSince() {
        return memSince;
    }

    public void setMemSince(LocalDate memSince) {
        this.memSince = memSince;
    }

    public int getMemDuration() {
        return memDuration;
    }

    public void setMemDuration(int memDuration) {
        this.memDuration = memDuration;
    }
}
