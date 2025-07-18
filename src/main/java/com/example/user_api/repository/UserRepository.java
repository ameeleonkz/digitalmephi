package com.example.user_api.repository;

import com.example.user_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByAgeGreaterThanEqualOrderByFirstName(Integer age);
}