package com.section7.recipe.model;

import lombok.*;

import javax.persistence.*;


@Data
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

}
