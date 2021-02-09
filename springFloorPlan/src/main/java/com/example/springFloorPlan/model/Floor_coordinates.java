package com.example.springFloorPlan.model;


import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Data
@Entity
@Validated
@Table(name = "floor_coordinates")
public class Floor_coordinates {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NotBlank(message = "This field should not be empty")
    @Column(name = "name")
    String name;
    @Column(name = "a1")
    @Size(min= 50,max = 250,message = "Coordinate should be between 50 and 250")
    @NotEmpty(message = "This field should not be empty")
    int a1;
    @Column( name = "a2")
    @Size(min= 50,max = 250,message = "Coordinate should be between 50 and 250")
    @NotEmpty(message = "This field should not be empty")
    int a2;
    @Column(name = "a3")
    @Size(min= 50,max = 250,message = "Coordinate should be between 50 and 250")
    @NotEmpty(message = "This field should not be empty")
    int a3;
    @Column(name = "a4")
    @NotEmpty(message = "This field should not be empty")
    @Size(min= 50,max = 250,message = "Coordinate should be between 50 and 250")
    int a4;
    @Column(name = "b1")
    @NotEmpty(message = "This field should not be empty")
    @Size(min= 50,max = 250,message = "Coordinate should be between 50 and 250")
    int b1;
    @Column(name = "b2")
    @Size(min= 50,max = 250,message = "Coordinate should be between 50 and 250")
    @NotEmpty(message = "This field should not be empty")
    int b2;
    @Column(name = "b3")
    @Size(min= 50,max = 250,message = "Coordinate should be between 50 and 250")
    @NotEmpty(message = "This field should not be empty")
    int b3;
    @Column(name = "b4")
    @Size(min= 50,max = 1000,message = "Coordinate should be between 50 and 250")
    @NotEmpty(message = "This field should not be empty")
    int b4;

    public Floor_coordinates(Long id,String name, int a1, int a2, int a3, int a4, int b1, int b2, int b3, int b4) {
        this.id = id;
        this.name = name;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.b4 = b4;
    }

    public Floor_coordinates() {

    }

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getA1() {
        return a1;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public int getA2() {
        return a2;
    }

    public void setA2(int a2) {
        this.a2 = a2;
    }

    public int getA3() {
        return a3;
    }

    public void setA3(int a3) {
        this.a3 = a3;
    }

    public int getA4() {
        return a4;
    }

    public void setA4(int a4) {
        this.a4 = a4;
    }

    public int getB1() {
        return b1;
    }

    public void setB1(int b1) {
        this.b1 = b1;
    }

    public int getB2() {
        return b2;
    }

    public void setB2(int b2) {
        this.b2 = b2;
    }

    public int getB3() {
        return b3;
    }

    public void setB3(int b3) {
        this.b3 = b3;
    }

    public int getB4() {
        return b4;
    }

    public void setB4(int b4) {
        this.b4 = b4;
    }



}
