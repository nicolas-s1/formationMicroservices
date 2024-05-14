package com.ecommerce.micrommerce.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class Product {
    @Id
    private int id;
    @Size(min = 3, max = 25)
    private String nom;
    @Min(value = 1)
    private int prix;


    
}
