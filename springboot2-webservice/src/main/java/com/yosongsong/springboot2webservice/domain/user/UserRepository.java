package com.yosongsong.springboot2webservice.domain.user;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public class UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
