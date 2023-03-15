package game;

public class PoisonKinoko extends Kinoko {
    private int paNumber = 5;
    public PoisonKinoko(char suffix) {
        super(suffix);
    }
    
    
    @override
    public void attack(Hero hero) {
        super.attack(hero);
        
        if (this.paNumber != 0) {
            System.out.println("추가로 독 포자를 살포했다!");
            hero.setHP(hero.getHP() / 5);
            System.out.println(hero.getHP() / 5 +"포인트의 데미지");
            this.paNumber -= 1;
        }
    }
}
