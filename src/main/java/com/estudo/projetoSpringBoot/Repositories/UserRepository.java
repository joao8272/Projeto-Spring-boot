package com.estudo.projetoSpringBoot.Repositories;

import com.estudo.projetoSpringBoot.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
