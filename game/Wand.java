package game;

public class Wand {
    private String name;
    private double power;
    public void setName(String name) { 
        if (name == null || name.length() < 3 ) {
            throw new IllegalArgumentException("지팡이의 이름은 빈 값이 올 수 없고 3문자 이상이어야 합니다.");
        }
        this.name = name;
    }
    
    public void setPower(double power) { 
        if (0.5 <= power && power >= 100.0) {
            throw new IllegalArgumentException("지팡이의 마력은 0.5 이상 100.0 이하여야 합니다.");
        }
        this.power = power;
    } 
    public String getName() {
        return name;
    }

    public double getPower() {
        return power;
    }
}
