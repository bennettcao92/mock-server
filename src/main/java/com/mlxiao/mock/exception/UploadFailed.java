package com.mlxiao.mock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class UploadFailed extends RuntimeException {
  public UploadFailed(String message) {
    super(message);
  }
}
