package com.technews.repository;

import com.technews.model.User;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
