package com.sangamone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sangamone.model.Users;

public interface UsersRepo extends JpaRepository<Users, Integer>{

}
