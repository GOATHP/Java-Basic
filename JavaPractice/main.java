package JavaPractice;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int R = scanner.nextInt();
        String answer = "";
        
        
        
        ConstructionSite site = new ConstructionSite(x,y,R);
        
        TreeShade tree = new TreeShade();
        tree.saveTreeshade(tree.getN());
        
        for (int i = 1; i < tree.getN() + 1; i++) {
            if (Math.pow(tree.treeXy[i][0] - site.getX(), 2) +
                    Math.pow(tree.treeXy[0][i] - site.getY(), 2)
                        <= Math.pow(site.getR(), 2) ) {
                            answer += "noisy" + "\n";
            } else {
                answer += "silent" + "\n";
            }
        }
        System.out.println(answer.trim());
    }
}