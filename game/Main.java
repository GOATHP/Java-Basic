package game;

public class Main {
    int num = 10;
    public static void solution() {
    }
    public static void main(String[] args) {
        Main.solution();
        Main main = new Main();
        System.out.println(main.num);
        
        Cleric cleric = new Cleric();
        cleric.hp = 40;
        cleric.mp = 40;
        System.out.println("HP : " + cleric.hp);
        System.out.println("MP : " + cleric.mp);
        System.out.println("Max HP : " + cleric.maxHp);
        System.out.println("Max MP : " + cleric.maxMp);

        cleric.selfAid();
        System.out.println("selfAid 이후 결과");
        System.out.println("HP : " + cleric.hp);
        System.out.println("MP : " + cleric.mp);


        System.out.println("pray 이후 결과");
        System.out.println("실제 회복량 : " + cleric.pray(5));
        System.out.println("HP : " + cleric.hp);
        System.out.println("MP : " + cleric.mp);

        Sword sword = new Sword();
        sword.name = "불의 검";
        sword.damage = 10;
        
        ClericRefactoring clericUpgrade = new ClericRefactoring("박태현짱");
        
        System.out.println(clericUpgrade.name + " " +clericUpgrade.hp + " " + clericUpgrade.mp);
    }

}
