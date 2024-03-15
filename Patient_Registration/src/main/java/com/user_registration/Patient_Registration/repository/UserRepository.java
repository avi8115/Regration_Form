package com.user_registration.Patient_Registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user_registration.Patient_Registration.model.user;


@Repository
public interface UserRepository extends JpaRepository<user, Long>{

}