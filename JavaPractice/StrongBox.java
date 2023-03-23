package JavaPractice;


import java.util.ArrayList;


public class StrongBox<E> {
    private E item;
    private KeyType keyType;
    private int count;
    
    public int getCount() {
        return count;
    }

    public enum KeyType {
        
        PADLOCK(1024), 
        BUTTON(10000), 
        DIAL(30000), 
        FINGER(10000000);
        
        private int limit;
        
        KeyType(int limit) {
            this.limit = limit;
    }
        
    public int getLimit() {
        return limit;
    }
}
    public StrongBox(KeyType keyType) {
        this.keyType = keyType;
    }
    
    public void put(E item) {
        this.item = item;
    }

    public E get() {
        count++;
        if (count > keyType.getLimit()) {
            return null;
        }
        return item;
    }

}


