package com.osakapigs.livestreaming.Repository;

import com.osakapigs.livestreaming.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
