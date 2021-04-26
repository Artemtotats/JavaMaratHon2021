package day13;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private String data;

    public Message(User sender, User receiver, String text ) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.data = new String();
    }

    @Override
    public String toString() {
        return "FROM : " +  this.sender + "\n  TO :" + receiver + "\n ON : " + data + "\n " + this.text;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }


    public String getText() {
        return text;
    }
}
