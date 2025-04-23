package com.example.DoctorExample.Model;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity //it is an entity class representing table inside database
@Table(name="doctor")//this will create table inside database if name is not given it will be classsname
public class Doctor {
    @Id//it is the primary key of the table
    @Column(name="doctorid")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int doctorid;
    @Column(name="doctorname",nullable=false)


    private String doctorName;
    @Column(name="doctorspeciality",nullable=false)
    private String doctorSpeciality;
    @Column(name="doctoremail",nullable=false,unique=true)
    private String email;
    

}

