package com.andreamaccan.backportfolio.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
// The model name will give the database column name 
public class User implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    
    @Basic
    String username;
    String password;
    String avatar;
    String banner;
    String firstname;
    String lastname;
    String ubication;
    String title;
    String about;

    public User() {

    }

    public User(Long id, String username, String password, String avatar, String banner, String firstname, String lastname, String ubication, String title, String about) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.avatar = avatar;
        this.banner = banner;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ubication = ubication;
        this.title = title;
        this.about = about;
    }
}
