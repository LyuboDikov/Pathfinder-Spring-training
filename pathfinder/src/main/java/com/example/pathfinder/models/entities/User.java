package com.example.pathfinder.models.entities;

import com.example.pathfinder.models.enums.LevelEnum;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    private String fullName;
    private Integer age;
    private String username;
    private String password;
    private String email;
    private Set<Role> roles;
    private LevelEnum level;

    public User() {
    }

    @Column(nullable = false)
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Column
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Column(nullable = false, unique = true)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column()
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @ManyToMany
    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @Enumerated(EnumType.STRING)
    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }
}
