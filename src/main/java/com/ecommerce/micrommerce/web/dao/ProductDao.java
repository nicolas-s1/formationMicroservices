package com.ecommerce.micrommerce.web.dao;

import com.ecommerce.micrommerce.web.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
    @Query("SELECT id, nom, prix FROM Product p WHERE p.prix > :prixLimit")

    List<Product>  chercherUnProduitCher(@Param("prixLimit") int prix);
    Product findById(int id);
}

