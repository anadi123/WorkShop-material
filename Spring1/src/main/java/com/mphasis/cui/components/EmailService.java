package com.mphasis.cui.components;

public class EmailService implements Message{
    public EmailService() {
        System.out.println("This is mail Instantiated");
    }

    @Override
    public boolean sendMessage(String message,String receiver){
        System.out.println("Email send to"+ receiver +"with the message" +message);
        return true;
    }
}
