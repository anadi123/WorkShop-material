package main.java.com.mphasis.cui.main.cui;
import com.mphasis.cui.components.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class Main {

    public static void main(String[] args) {
	// write your code here
      //  ((AbstractApplicationContext)Context).registerShutdownHook();
        ApplicationContext context=new FileSystemXmlApplicationContext("src/main/java/com/mphasis/cui/main/cui/Beans.xml");
        main.java.com.mphasis.cui.components.Message messageService = (main.java.com.mphasis.cui.components.Message) context.getBean("emailService");
        messageService.sendMessage("This is an email","Raj@gmail.com");

        messageService=(main.java.com.mphasis.cui.components.Message) context.getBean("twitterService");
        messageService.sendMessage("This is a tweet","_Raj");

        TextEditor textEditor=(TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();
     //  context.registerShutDownHook();
    }
}
