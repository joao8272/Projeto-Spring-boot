package com.estudo.projetoSpringBoot.Repositories;

import com.estudo.projetoSpringBoot.Entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
