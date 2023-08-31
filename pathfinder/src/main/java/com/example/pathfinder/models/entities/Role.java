package com.example.pathfinder.models.entities;

import com.example.pathfinder.models.enums.RoleNameEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity {

    private RoleNameEnum name;

    public Role() {
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "name")
    public RoleNameEnum getName() {
        return name;
    }

    public void setName(RoleNameEnum name) {
        this.name = name;
    }
}
