package com.mlxiao.mock.service;


import com.mlxiao.mock.exception.UploadFailed;
import com.mlxiao.mock.util.Utils;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import com.qiniu.util.Json;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class QiniuService {

  //TODO 将以下常量写到配置文件中去
  static final String ACCESS_KEY = "f-4qhQ_bGUQVhEryo-XUF89Njqeg1SgDJ2uKVv3Y";
  static final String SECRET_KEY = "9O1xieJDu76UxsRPkt9g-v-oMbh9wgrC5dpIwPKd";
  static final String BUCKET = "micropoplar";
  static final String DOMAIN = "http://ogw9ek3ff.bkt.clouddn.com";

  private UploadManager uploadManager = new UploadManager();
  private Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);

  public String getUpToken() {
    return auth.uploadToken(BUCKET);
  }

  public String uploadImg(MultipartFile file) throws IOException {

    String key = Utils.generateUniqueKey() + "." + Utils.getExtension(file);
    byte[] fileBytes = file.getBytes();

    Response res;

    try {
      res = uploadManager.put(fileBytes, key, getUpToken());
    } catch (QiniuException e) {
      throw new UploadFailed(e.response.bodyString());
    }

    return DOMAIN + "/" + Json.decode(res.bodyString()).get("key");
  }

}
