package com.mlxiao.mock.controller;

import com.mlxiao.mock.dto.QiniuUpToken;
import com.mlxiao.mock.service.QiniuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qiniu")
public class QiniuController {

  static final String ACCESS_KEY = "f-4qhQ_bGUQVhEryo-XUF89Njqeg1SgDJ2uKVv3Y";
  static final String SECRET_KEY = "9O1xieJDu76UxsRPkt9g-v-oMbh9wgrC5dpIwPKd";

  @Autowired
  private QiniuService qiniuService;

  @GetMapping("/uptoken")
  public QiniuUpToken getUptoken() {
    return new QiniuUpToken(qiniuService.getUpToken());
  }

}
