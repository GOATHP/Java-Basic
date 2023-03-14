package game;

public class ClericRefactoring {
    String name;
    int hp = MAX_HP;
    int mp = MAX_MP;
    static final int MAX_HP = 50;
    static final int MAX_MP = 10;

    ClericRefactoring(String name) {
        this.name = name;
    }
    ClericRefactoring(String name, int hp) {
        this(name);
        this.hp = hp;
        
    }

    ClericRefactoring(String name, int hp, int mp) {
        this(name, hp);
        this.mp = mp;
    }

    void selfAid() {
        hp = MAX_HP;
        mp -= 5;
    }

    int pray(int sec) {
        int cure = (int) Math.floor(Math.random() * 3) + sec;
        mp += cure;
        if (mp >= MAX_MP) {
            int tmp = mp - MAX_MP;
            mp = MAX_MP;
            return cure - tmp;
        } else {
            return cure;
        }
    }
}

