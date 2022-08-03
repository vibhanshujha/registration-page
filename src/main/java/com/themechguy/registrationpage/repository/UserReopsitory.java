package com.themechguy.registrationpage.repository;

import com.themechguy.registrationpage.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface UserReopsitory extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
