package JavaPractice;

import static org.junit.Assert.*;
import org.junit.Test;

public class CountTest {

    @Test
    public void testInit() {
        UpCounter counter = new UpCounter();
        int result = counter.getCount();
        assertEquals(0, result);
        }
    
    @Test
    public void testSetCount() {
        UpCounter counter = new UpCounter();
        counter.setCount(10);
        int result = counter.getCount();
        assertEquals(10, result);
    }
    
    @Test
    public void testIncre() {
        UpCounter counter = new UpCounter();
        counter.count();
        int result = counter.getCount();
        assertEquals(1, result);
    }
    @Test
    public void testDescre() {
        DownCounter counter = new DownCounter();
        counter.count();
        int result = counter.getCount();
        assertEquals(-1, result);
    } 
}
