package com.example.ketthucmodule4_springboot.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    @ManyToOne
    private Department department;


}
