package JavaPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class TreeShade {
    
    Scanner scanner = new Scanner(System.in);
    private int N = scanner.nextInt();
    int[][] treeXy = new int[N + 1][N + 1];

    
    public int[][] saveTreeshade(int N) {
        for (int i = 1; i < N + 1; i++) {
            treeXy[i][0] = scanner.nextInt();
            
            treeXy[0][i] = scanner.nextInt();
        }
        return treeXy;
        
    }


    public int getN() {
        return N;
    }


    public void setN(int n) {
        N = n;
    }

}
