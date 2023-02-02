package com.api.Springboot.API.Testing.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor // Generates constructors that take no arguments, one argument per final / non-null field, or one argument for every field.
@NoArgsConstructor
@Entity // create an entity class
@Table(name = "USER_TBL") // create table

public class User {

   @Id // annotate as id
   @GeneratedValue
   // created an interface for the id in user repository

    private Integer id; // take long for commercial use
    private String name;
    private String email;
    private String password;
    private Integer age;
    private LocalDate dob;

}
