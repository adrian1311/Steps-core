package com.steps.steps.models.entity;

import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;

@Entity
@Audited
@EntityListeners(AuditingEntityListener.class)
@Table(name = "flys")
public class FlyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "from_city", nullable = false)
    private String from_city;
    @Column(name = "to_city", nullable = false)
    private String to_city;
    @Column(name = "seats", nullable = false)
    private Integer seats;
    @Column(name = "price", nullable = false)
    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom_city(String from_city) {
        return this.from_city;
    }

    public void setFrom_city(String from_city) {
        this.from_city = from_city;
    }

    public String getTo_city(String to_city) {
        return this.to_city;
    }

    public void setTo_city(String to_city) {
        this.to_city = to_city;
    }

    public Integer getSeats(Integer seats) {
        return this.seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Double getPrice(Double price) {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}