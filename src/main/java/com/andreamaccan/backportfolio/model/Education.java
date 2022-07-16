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
public class Education implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Basic
    String thumb;
    String institution;
    String from_date;
    String to_date;
    String details;
    
    public Education() {

    }

    public Education(Long id, String thumb, String institution, String from_date, String to_date, String details) {
        this.id = id;
        this.thumb = thumb;
        this.institution = institution;
        this.from_date = from_date;
        this.to_date = to_date;
        this.details = details;
    }
}
