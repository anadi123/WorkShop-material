 // Controlling the main Thread.
//package com.mphasis.cui; 
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

//import org.graalvm.compiler.nodes.java.FinalFieldBarrierNode;
public class Q1{
  public static void main(String[] args){
    DataInputStream dis=null;
    Socket socket=null;
    try{
      socket=new Socket("Desktop-Anadi",5432);
      InputStream inputStream=socket.getInputStream();
      DataInputStream dis1=new DataInputStream(inputStream);
      System.out.println(dis1.readUTF());
    
    } catch(IOException e){
      e.printStackTrace();
    // } catch(ConnectException connExc){
    //     System.err.println("Could not connect");
    // }
  }
}
}
//   finally{
//     try{
//       dis.close();
//       socket.close();
    
//     } catch(IOException e){
//       e.printStackTrace();
//     }
//   }
// }