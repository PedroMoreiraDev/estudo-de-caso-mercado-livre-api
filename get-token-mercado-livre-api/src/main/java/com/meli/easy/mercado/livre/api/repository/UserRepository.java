package com.meli.easy.mercado.livre.api.repository;

import com.meli.easy.mercado.livre.api.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <UserEntity, Long> {


    }
