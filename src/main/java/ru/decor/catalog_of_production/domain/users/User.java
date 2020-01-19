package ru.decor.catalog_of_production.domain.users;

import ru.decor.catalog_of_production.domain.ids.IdOfUser;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Ivan Rovenskiy
 * 19 January 2020
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String name;
    private String surName;
    private UserType userType;
    private String password;

    protected User() {
    }

    public User(String name, String surName, UserType userType, String password) {
        this.name = name;
        this.surName = surName;
        this.userType = userType;
        this.password = password;
    }

    public IdOfUser getUserId() {
        return IdOfUser.of(userId);
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public UserType getUserType() {
        return userType;
    }

    public String getPassword() {
        return password;
    }
}