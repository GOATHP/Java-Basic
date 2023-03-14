package game;

import java.util.Random;


public class Cleric {
    String name;
    int hp = 50;
    int mp = 10;
    final int maxHp = 50;
    final int maxMp = 50;

    void selfAid() {

        hp = maxHp;
        mp -= 5;
    }

    int pray(int sec) {
        int cure = (int) Math.floor(Math.random() * 3) + sec;


        mp += cure;

        if (mp >= maxMp) {
            int tmp = mp - maxMp;
            mp = maxMp;

            return cure - tmp;
        } else {

            return cure;

        }
    }
}

