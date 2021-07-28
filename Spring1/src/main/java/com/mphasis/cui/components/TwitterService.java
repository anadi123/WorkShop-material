package main.java.com.mphasis.cui.components;

public class TwitterService implements Message{
    public TwitterService() {
        System.out.println("This is twitter instantiated");
    }

    @Override
    public boolean sendMessage(String message,String receiver){
        System.out.println("Tweet send to"+ receiver +"with the message" +message);
        return true;
    }
}
