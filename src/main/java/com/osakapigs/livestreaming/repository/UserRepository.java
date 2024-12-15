package com.osakapigs.livestreaming.repository;

import com.osakapigs.livestreaming.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
