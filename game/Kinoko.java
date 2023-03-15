package game;

public class Kinoko {
    int hp;
    final int LEVEL = 10;
    char suffix;
    
    void run() {
        System.out.println("괴물 버섯 " + this.suffix + "는 도망갔다!");
    }
    
    public Kinoko(char suffix) {
        this.suffix = suffix;
    }
    
    public void attack(Hero hero) {
        System.out.println("키노코 " + this.suffix);
        System.out.println("10의 데미지");
        hero.setHP(hero.getHP() - 10);
    }
    
    public Kinoko(int hp) {
        this.hp = 50;
    }
}
