package com.finalexam4.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@NoArgsConstructor
@Data
@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Mustn't empty or null")
    private String name;

    @Min(0)
    private double area;

    @Min(0)
    private int population;

    @Min(0)
    private double GDP;

    private String description;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
}
