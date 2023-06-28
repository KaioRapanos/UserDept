package com.firstproject.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstproject.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
