package via.sdj3.websocketdemo.server;

import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;

@Component
@ServerEndpoint("/websocket/chat")
public class ChatServer {
    // trigger when a message comes from the client -- once new message is received
    @OnMessage
    public String echo(String clientMessage) {
        // logging
        return "From Server {" + clientMessage +"} ";
    }

    // also
    //@OnOpen -- called once new connection is established
    //@OnClose -- called once the connection is being closed
    //@OnError --called once Exception in being thrown by any method (with 4 annoations)
}
