package JavaBasic14;

import java.awt.List;
import java.util.ArrayList;

public class Class<T> {
    
    
    public static void main(String[] argrs) throws Exception {
        List<String> list = new Class<String>();
        
        
        
        
        ArrayList list = new ArrayList();

        list.add(1);
        list.add("홍길동");
        list.add(null);

        Object object = (int) list.get(0);
        if (object instanceof Integer) {
            System.out.println((int) list.get(0) + 10);
        }
    }
class Outer {
    class Inner { 
        
    }
    }
}

