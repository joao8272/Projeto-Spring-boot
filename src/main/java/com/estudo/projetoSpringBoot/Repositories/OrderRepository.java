package com.estudo.projetoSpringBoot.Repositories;

import com.estudo.projetoSpringBoot.Entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order,Long> {

}
