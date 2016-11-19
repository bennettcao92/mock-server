package com.mlxiao.mock.repository;

import com.mlxiao.mock.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
