package game;

public class Cleric {
    final static int MAX_HP = 50;
    final static int MAX_MP = 50;
    String name;
    int hp = MAX_HP;
    int mp = MAX_MP;

    public void selfAid() {

        hp = MAX_HP;
        mp -= 5;
    }

    public int pray(int sec) {
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

