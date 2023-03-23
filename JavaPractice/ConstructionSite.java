package JavaPractice;

import java.util.Scanner;

public class ConstructionSite {
    
    private int x;
    private int y;
    private int R;
    
    public ConstructionSite(int x, int y, int R) {
        this.x = x;
        this.y = y;
        this.R = R;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }
    
}
