package com.romanf.crud_with_web_interface.repository;

import com.romanf.crud_with_web_interface.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
