package JavaApply4;

import java.util.ArrayList;

public class StrongBox<E> {
    public enum KeyType {
        PADLOCK(1024), BUTTON(10000), DIAL(30000), FINGER(10000000);

        private final int limit;

        private KeyType(int limit) {
            this.limit = limit;
        }

        int getNumber() {
            return this.limit;
        }
    }
    
    private E content;
    private boolean isOpen;
    private int count;
    private final KeyType keyType;
    
    public StrongBox(KeyType keyType) {
        this.keyType = keyType;
        this.isOpen = false;
    
    public void put(E data) {
        this.data = data;
    }
}
    
    public E get() {
        data
        return this.data;
    }
    public static void main(String[] args) {
        KeyType type = KeyType.BUTTON;
        System.out.println(KeyType.);
    }
}

