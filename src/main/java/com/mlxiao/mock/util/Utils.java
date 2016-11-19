package com.mlxiao.mock.util;

import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Utils {
  public static String generateUniqueKey() {
    return UUID.randomUUID().toString()
            + "-" +
            new SimpleDateFormat("yyMMddHHmmss").format(new Date());
  }

  public static String getExtension(MultipartFile file) {
    return file.getOriginalFilename().split("\\.")[1];
  }
}
