//package com.mlxiao.mock.ws;
//
//import com.mlxiao.mock.entity.Comment;
//import com.mlxiao.mock.ws.encoder.CommentEncoder;
//import org.springframework.stereotype.Component;
//import org.springframework.web.socket.server.standard.SpringConfigurator;
//
//import javax.websocket.*;
//import javax.websocket.server.ServerEndpoint;
//import java.io.IOException;
//import java.util.List;
//import java.util.concurrent.CopyOnWriteArraySet;
//
//@Component
//@ServerEndpoint(value = "/comments", encoders = {CommentEncoder.class}, configurator = SpringConfigurator.class)
//public class CommentWs {
//
//  private static CopyOnWriteArraySet<CommentWs> webSocketSet = new CopyOnWriteArraySet<>();
//
//  private Session session;
//
//  public void send (List<Comment> comments) throws IOException, EncodeException {
//    this.session.getBasicRemote().sendObject(comments);
//  }
//
//  @OnOpen
//  public void onOpen (Session session) throws IOException, EncodeException {
//    this.session = session;
//    webSocketSet.add(this);
//
//    Comment comment = new Comment();
//    comment.setId(Long.parseLong("1"));
//    comment.setAuthor("hello");
//    comment.setText("world");
//    this.session.getBasicRemote().sendObject(comment);
//  }
//
//  @OnClose
//  public void onClose (){
//    webSocketSet.remove(this);
//  }
//
//  @OnMessage
//  public void onMessage (String message, Session session) throws IOException {
//    // 群发消息
//    for ( CommentWs item : webSocketSet ){
//    }
//  }
//
//}
