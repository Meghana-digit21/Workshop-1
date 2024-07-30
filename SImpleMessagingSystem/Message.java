package SImpleMessagingSystem;

public class Message {
    private String content;
    private User sender;
    public Message(String content, User sender) {
        this.content = content;
        this.sender = sender;
    }

    public void display() {
        System.out.println("Message from- "+sender.getName() + ": " + content);

    }
}

class TextMsg extends Message {
    public TextMsg(String content, User sender) {
        super(content, sender);
    }
}
class MediaMsg extends Message {
    private String mediaLink;

    public MediaMsg(String content, User sender, String mediaLink) {
        super(content, sender);
        this.mediaLink = mediaLink;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Media URL: " + mediaLink);
    }

}

