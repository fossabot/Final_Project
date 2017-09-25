/*package org.kh.dajob.chat;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
 
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
 
@ServerEndpoint("/broadcasting")
public class BroadSocket {
    private static Set<Session> clients = Collections.synchronizedSet(new HashSet<Session>());
    
    @OnMessage
    public void onMessage(String message, Session session) throws IOException {
        System.out.println(message);
        synchronized(clients) {
            for(Session client : clients) {
                if(!client.equals(session)) {
                    client.getBasicRemote().sendText(message);
                }
            }
        }
    }
    
    @OnOpen
    public void onOpen(Session session) {
        System.out.println("onOpen");
        clients.add(session);
    }
    
    @OnClose
    public void onClose(Session session) {
    	System.out.println("close");
    	System.out.println("session : " + session.getId());
        clients.remove(session);
    }
    
    @OnError
    public void handleError(Throwable t){
        t.printStackTrace();
    }
}
*/