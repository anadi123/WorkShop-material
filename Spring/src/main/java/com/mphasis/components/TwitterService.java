package com.mphasis.components;

public class TwitterService implements Message{
    @Override
    public boolean sendMessage(String message,String receiver){
        System.out.println("Tweet send to"+ receiver +"with the message" +message);
        return true;
    }
}
