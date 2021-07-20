package com.mphasis.cui;

import java.io.*;

class Data implements Serializable{

   private static final long serialVersionUID= 10L;
   public int id;
    public String name;
    public float salary;

    public Data() {
    }

    public Data(int id, String name, float salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

//    public Data(int i, String ravi1, float v) {
//    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Data data=new Data(10,"Ravi1",12345.67f);
        try{
            FileOutputStream fos=new FileOutputStream("ObjectStore.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(data);
            FileInputStream fis=new FileInputStream("ObjectStore.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Data dataRestored=(Data) ois.readObject();
            System.out.println("Deserailzed Object value:" + dataRestored.id + "..." + dataRestored.name +"..."+ dataRestored.salary);
        }catch(IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
