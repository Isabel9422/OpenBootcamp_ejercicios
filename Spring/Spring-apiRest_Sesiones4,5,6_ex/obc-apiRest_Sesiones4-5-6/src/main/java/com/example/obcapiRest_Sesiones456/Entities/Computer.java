package com.example.obcapiRest_Sesiones456.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    private String brand;
    private Double price;
    private String colour;
    private LocalDate releaseDate;
    private Boolean OSincluded;  //Si viene con el S0 ya instalado o no

    public Computer() {
    }

    public Computer(Long id, String model, String brand, Double price, String colour, LocalDate releaseDate, Boolean OSincluded) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.colour = colour;
        this.releaseDate = releaseDate;
        this.OSincluded = OSincluded;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Boolean getOSincluded() {
        return OSincluded;
    }

    public void setOSincluded(Boolean OSincluded) {
        this.OSincluded = OSincluded;
    }

    @Override
    public String toString() {
        return "computer{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                ", releaseDate=" + releaseDate +
                ", OSincluded=" + OSincluded +
                '}';
    }
}
