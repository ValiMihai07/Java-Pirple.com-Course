
package homework_a_i;

import java.util.Scanner;


public class Homework_A_I extends Functions {

    public static void main(String[] args) {

       int num_of_Archer;
       num_of_Archer=20;
       
       int[][] board = new int[num_of_Archer][num_of_Archer] ;
       
       createBoard( board , num_of_Archer);
        
        if (!placeTheArcher(board, 0 , num_of_Archer)) {
            System.out.print("Solution does not exist");
            return;
        }
 
        showTheSolution(board , num_of_Archer);
    
    }
    
    
}
