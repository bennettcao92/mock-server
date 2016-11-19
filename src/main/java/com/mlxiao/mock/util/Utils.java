package com.mlxiao.mock.util;

import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Utils {
  public static String generateUniqueKey() {
    return new SimpleDateFormat("yyMMddHHmmss").format(new Date())
            + "-"
            + UUID.randomUUID().toString();
  }

  public static String getExtension(MultipartFile file) {
    return file.getOriginalFilename().split("\\.")[1];
  }
}
