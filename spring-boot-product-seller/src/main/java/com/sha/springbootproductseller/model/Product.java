package com.sha.springbootproductseller.model;

import java.time.LocalDateTime;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "price", nullable =  false)
    private Double price;

    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;
}
