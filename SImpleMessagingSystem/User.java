package SImpleMessagingSystem;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Message> chatbox;

    public User(String name) {
        this.name = name;
        this.chatbox = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void sendMessage(SImpleMessagingSystem.User receiver, Message message) {
        receiver.receiveMsg(message);
    }

    public void receiveMsg(Message msg) {
        chatbox.add(msg);
    }

    public void displayInbox() {
        for (Message m : chatbox) {
            m.display();
        }
    }
}

