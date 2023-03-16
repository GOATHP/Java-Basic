package game;

public class Dancer extends Character implements Human {
    private String name;

    public void dance() {
        System.out.println(this.name + "은 정열적으로 춤을 췄다");
    }
}
