package JavaBasic11;

import java.util.ArrayList;
import JavaBasic12.A;
import JavaBasic12.B;
import JavaBasic12.X;
import JavaBasic12.Y;

public class main {

    public static void main(String[] args) {
        X obj = new A();
        Y y1 = new A();
        Y y2 = new B();
        
        ArrayList<Y> list = new ArrayList<>();
        
        list.add(y1);
        list.add(y2);
        
        for (Y y : list) {
            y.b();
        }
    }
}
