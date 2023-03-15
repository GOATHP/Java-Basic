package game;

public class SuperHero extends Hero {
    private boolean flying;
    public SuperHero() {
        System.out.println("SuperHero 생성자");
    }
    public void fly() {
        flying = true;
    }

    public void land() {
        flying = false;
    }

    @Override
    public void run() {
        System.out.println("퇴각했다");
    }

    @Override
    public void attack(Kinoko enemy) {
        System.out.println("준비운동");
        super.attack(enemy);
        enemy.hp -= 5;

        if (flying) {
            enemy.hp -= 5;
            System.out.println("추가 공격");
        }
    }
}