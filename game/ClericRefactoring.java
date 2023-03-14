package game;

public class ClericRefactoring {

    public static final int MAX_HP = 50;
    public static final int MAX_MP = 10;
    
    private String name;
    private int hp = MAX_HP;
    private int mp = MAX_MP;

    
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

    public String getName() {
        return name;
    }
    
    //수정하고 끝나기 때문에 그냥 void
    public void setName(String name) {
        this.name = name;
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

