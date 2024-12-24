package com.kodnest.rolebasedsecurity.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class Users {
    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column
    String username;
    @Column

    String password;
    @Column
    String role;


    public Users(int id, String username, String password, String role) {
        this.id = (int) (id);
        this.username = username;
        this.password = password;
        this.role = role;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Users(){

   }



}
