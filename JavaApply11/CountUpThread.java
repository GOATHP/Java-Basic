package JavaApply11;

import java.util.Scanner;


class CountUpThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i < 51; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Thread thread = new CountUpThread();
        Thread thread2 = new CountUpThread();
        Thread thread3 = new CountUpThread();
        thread.start();
        thread2.start();
        thread3.start();
        
            
        }
    }

