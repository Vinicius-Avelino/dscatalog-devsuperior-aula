package com.devsuperior.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dscatalog.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{ //Espera o tipo da entidade e o tipo do ID

}
