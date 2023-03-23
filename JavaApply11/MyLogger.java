package JavaApply11;

import java.io.FileWriter;
import java.io.IOException;

public class MyLogger {
    private static MyLogger instance;
    private FileWriter writer;
    
    private MyLogger() {
        try {
            writer = new FileWriter("dummylog.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }        
    }
    
    public static synchronized MyLogger getInstance() {
        if (instance == null) {
            instance = new MyLogger();
        }
        return instance;
    }
    
    public void log(String content) {
        try {
            writer.write(content + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

