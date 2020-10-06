package com.programozzteis.cardealer.cardealer.car;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "advertisments")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column
    private CarTypes type;

    @DateTimeFormat(pattern = "yyyy.mm.dd")
    @Column(name="prodYear")
    private LocalDate date;

    @Column
    private String power;

    @Column
    private String consumption;

    @Column
    private int price;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setType(CarTypes type) {
        this.type = type;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public CarTypes getType() {
        return type;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getConsumption() {
        return consumption;
    }

    public void setConsumption(String consumption) {
        this.consumption = consumption;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
