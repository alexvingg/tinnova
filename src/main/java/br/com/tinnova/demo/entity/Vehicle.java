package br.com.tinnova.demo.entity;

import br.com.tinnova.demo.enums.Brand;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "vehicle")
@Data
public class Vehicle extends AbstractEntity<Long> {

    @Column(nullable = false)
    @NotNull
    private String name;

    @Column(name = "brand", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    @NotNull
    private Brand brand;

    @Column(nullable = false)
    @NotNull
    private Integer year;

    @Column(nullable = false)
    private boolean isSelled;

}
