//package com.mlxiao.mock.ws.encoder;
//
//import com.mlxiao.mock.entity.Comment;
//
//import javax.json.Json;
//import javax.json.JsonObject;
//import javax.websocket.EncodeException;
//import javax.websocket.Encoder;
//import javax.websocket.EndpointConfig;
//
//public class CommentEncoder implements Encoder.Text<Comment> {
//  @Override
//  public String encode(Comment comment) throws EncodeException {
//    JsonObject jsonObject = Json.createObjectBuilder()
//            .add("id", comment.getId())
//            .add("author", comment.getAuthor())
//            .add("text", comment.getText())
//            .build();
//    return jsonObject.toString();
//  }
//
//  @Override
//  public void init(EndpointConfig endpointConfig) {
//
//  }
//
//  @Override
//  public void destroy() {
//
//  }
//}
