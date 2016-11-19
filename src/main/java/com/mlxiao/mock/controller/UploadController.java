package com.mlxiao.mock.controller;

import com.mlxiao.mock.service.QiniuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/upload")
public class UploadController {

  @Autowired
  private QiniuService qiniuService;

  @PostMapping
  public String upload(@RequestBody MultipartFile file) throws IOException {
    return qiniuService.uploadImg(file);
  }
}
