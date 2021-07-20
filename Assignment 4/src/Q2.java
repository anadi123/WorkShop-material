import com.mphasis.cui.Main;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Q2{
    static Logger logger;
    static{
        logger=Logger.getLogger(Main.class.getName());
    }
    static void print(String string) {
    }
        logger.getLogger(Main.class.getName()).log(Level.INFO, "string");
        }

public static void main(String[] args) {
        File file = new File("java/COPYRIGHT");

        print("File Name: " + file.getName());
        print("Path: " + file.getPath());
        print("Abs Path: " + file.getAbsolutePath());
        print("Parent: " + file.getParent());
    for (String s : Arrays.asList(file.exists() ? "exists" : "does not exist", file.canWrite() ? "is writeable" : "is not writeable", file.canRead() ? "is readable" : "is not readable", "is " + (file.isDirectory() ? "directory" : "not" + " a directory"), file.isFile() ? "is normal file" : "might be a named pipe", file.isAbsolute() ? "is absolute" : "is not absolute")) {
        print(s);
    }
    print("File last modified: " + file.lastModified());
        print("File size: " + file.length() + " Bytes");
        }