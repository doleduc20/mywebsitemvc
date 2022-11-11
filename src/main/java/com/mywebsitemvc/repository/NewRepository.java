package com.mywebsitemvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mywebsitemvc.entity.NewEntity;

public interface NewRepository extends JpaRepository<NewEntity, Long> {

}
