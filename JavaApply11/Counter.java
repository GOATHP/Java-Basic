package JavaApply11;



class Counter implements Runnable{
    private long count = 0;
    
    public synchronized void add(long i) {
         {
        count += i;
        System.out.println(this.count);

        }
    }
    public synchronized void mul(long i) {
        System.out.println("곱하기");
        count *= i;
    }
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(10);
                add(i);
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }



public static void main(String[] args) {
    Counter counter = new Counter();
    Counter counter2 = new Counter();
    
    Thread t1 = new Thread(counter);
    Thread t2 = new Thread(counter2);
    
    t1.start();
    t2.start();

    }
}
