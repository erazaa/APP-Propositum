package com.gradesolutions.propositum.models;

/**
 * Created by William on 13/07/2017.
 */

public class Advisor {
    private String id;
    private String name;
    private String description;
    private String price;
    private String availability;
    private String speciality;

    public Advisor() {
    }

    public Advisor(String id, String name, String description, String price, String availability, String speciality) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.availability = availability;
        this.speciality = speciality;
    }

    public String getId() {
        return id;
    }

    public Advisor setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Advisor setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Advisor setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public Advisor setPrice(String price) {
        this.price = price;
        return this;
    }

    public String getAvailability() {
        return availability;
    }

    public Advisor setAvailability(String availability) {
        this.availability = availability;
        return this;
    }

    public String getSpeciality() {
        return speciality;
    }

    public Advisor setSpeciality(String speciality) {
        this.speciality = speciality;
        return this;
    }
}
