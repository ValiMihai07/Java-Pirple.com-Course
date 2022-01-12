
package heuristicmethod;

import java.io.IOException;
import java.util.Scanner;

public class HeuristicMethod extends Functions {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter number of archers");
        Scanner reader = new Scanner(System.in);
        n=reader.nextInt();
        solveArchers(n);
    }
    
}
