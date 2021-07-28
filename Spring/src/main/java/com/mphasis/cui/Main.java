package com.mphasis.cui;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Message message=new EmailService();
//        message.sendMessage("This is email","R@gmail.com");
//        message=new TwitterService();
//        message.sendMessage("This is tweet","_Rm");
        new FileSystemXmlApplicationContext("src/main/java/com/mphasis/cui/Bean.xml");

    }
}
