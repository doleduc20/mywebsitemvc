package com.mywebsitemvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mywebsitemvc.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
	UserEntity findOneByUserNameAndStatus(String name, int status);
}