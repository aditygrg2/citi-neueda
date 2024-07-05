package com.glzd.expenseTrackerApp.repository;


import com.glzd.expenseTrackerApp.business.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

