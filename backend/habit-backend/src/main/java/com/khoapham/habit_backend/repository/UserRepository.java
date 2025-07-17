package com.khoapham.habit_backend.repository;

import com.khoapham.habit_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
