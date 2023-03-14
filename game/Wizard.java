package game;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    Wand wand;

    // 체력 마나 Setter & Getter
    public int getMp() {
        return mp;
    }

    public void setMP(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("마법사의 MP는 0이상이어야 합니다.");
        }
        this.mp = mp;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        }
        this.hp = hp;
    }
    // 이름 Setter & Getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wand getWand() {
        return wand;
    }

    // 완드 Setter & Getter
    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("마법사의 지팡이는 null 일 수 없다.");
        }
        this.wand = wand;
    }

    public void heal(Hero hero) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.wand.getPower());
        hero.setHP(hero.getHP() + recovPoint);
    }
}
