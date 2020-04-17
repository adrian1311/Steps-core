package com.steps.steps.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FlyDTO {

    @JsonProperty(value="id")
    private Long id;
    @JsonProperty(value = "from_city")
    private String from_city;
    @JsonProperty(value = "to_city")
    private String to_city;
    @JsonProperty(value = "seats")
    private Integer seats;
    @JsonProperty(value = "price")
    private Double price;

    public FlyDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom_city() {
        return from_city;
    }

    public void setFrom_city(String from_city) {
        this.from_city = from_city;
    }

    public String getTo_city() {
        return to_city;
    }

    public void setTo_city(String to_city) {
        this.to_city = to_city;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
