
package homework_a_i;



public class Functions {
    
    //with this function we will set the number of archer and the row and col of the board
    static int randomNumForArcher()
    {
        int result;
        double x;
        x=4+ Math.random() * 500;
        result = (int)x;
        return result;
    }
    
    //with this function i will create the board with N Archer
    static void createBoard( int board[][] ,int x)
    {
        for(int i =0 ; i< x ; i++)
        {
            for( int j =0 ; j< x ; j++)
            {
                board[i][j] = 0;
            }
        }
    }
    
    // with this function we will show the solution as a matrix 
    static void showTheSolution(int matrix[][] ,int x)
    {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++)
                System.out.print(" " + matrix[i][j]
                        + " ");
            System.out.println();
        }
    }
    
    // with this function we will see if the space where we want to put the archer is safe and nobody attacks us
    static boolean isAFreeSpace(int matrix[][], int row, int col, int x)
    {
        int i, j;
        for (i = 0; i < col; i++)
            if (matrix[row][i] == 1)
                 return false;
 
        
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (matrix[i][j] == 1)
                return false;
             
        for (i = row, j = col; j >= 0 && i < x; i++, j--)
            if (matrix[i][j] == 1)
                return false;
 
        return true;
    }
    
    // with this function we solves the problem using backtracking 
    public static boolean placeTheArcher(int board[][], int col , int x)
    {
        if (col >= x)
            return true;
 
        for (int i = 0; i < x; i++) {
            if (isAFreeSpace(board, i, col , x)) {
                board[i][col] = 1;
 
                if (placeTheArcher(board, col + 1 , x))
                    return true;
 
                board[i][col] = 0;
            }
        }
        return false;
    }
}
