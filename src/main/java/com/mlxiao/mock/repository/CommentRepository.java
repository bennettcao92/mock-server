package com.mlxiao.mock.repository;

import com.mlxiao.mock.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
