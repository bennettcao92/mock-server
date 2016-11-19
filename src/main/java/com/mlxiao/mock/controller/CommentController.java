package com.mlxiao.mock.controller;

import com.mlxiao.mock.entity.Comment;
import com.mlxiao.mock.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {

  @Autowired
  CommentRepository commentRepository;

  @GetMapping
  List<Comment> allList() {
    return commentRepository.findAll();
  }

}
