package com.estudo.projetoSpringBoot.Repositories;

import com.estudo.projetoSpringBoot.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category,Long> {
}
