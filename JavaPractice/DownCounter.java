package JavaPractice;

public class DownCounter extends UpCounter implements Counter{
    public void count() {
        setCount(getCount() - 1);
    }
}
