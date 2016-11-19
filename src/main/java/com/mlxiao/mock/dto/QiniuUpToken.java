package com.mlxiao.mock.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class QiniuUpToken {
  private String uptoken;

  public QiniuUpToken(String uptoken) {
    this.uptoken = uptoken;
  }
}
