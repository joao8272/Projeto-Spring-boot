package com.estudo.projetoSpringBoot.Repositories;

import com.estudo.projetoSpringBoot.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Long> {

}
