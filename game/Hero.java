package game;

public class Hero {
    // field variable
    // global variable
    // member variable
    String name;
    int hp;
    Sword sword;
    
    static int money;
    
    //기본 생성자, Primary Constructor
    Hero (String name, int hp) {
        this.name = name;
        hp = 100;
        sword = new Sword();
    }
    
    Hero() {
        this.hp = 100;
        this.name = "김영웅";
    }
    
    Hero(String name) {
        this.hp = 100;
        this.name = name;
    }
    
    public void attack(Kinoko enemy) {
        System.out.println(this.name + "의 공격!");
        enemy.hp -= 5;
        System.out.println("5포인트의 데미지를 주었다!");
    }

    void run() {}

    void sit(int sec) {}

    void slip() {}

    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "는 잠을 자고 회복했다!");
    }

    public int getHP() {
        
        return this.hp;
    }

    public void setHP(int i) {
        this.hp = i;
        
    }

}
