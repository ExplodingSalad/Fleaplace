package com.example.fleaplace_backend.Repositories;

import com.example.fleaplace_backend.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
