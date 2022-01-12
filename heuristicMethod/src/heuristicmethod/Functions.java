
package heuristicmethod;

import java.util.ArrayList;

public class Functions {
    static void printBoardInTerminal( int[] board , int len)
    {
        for(int i=0 ; i< len ; i++)
        {
            for(int j=0 ; j < len ; j++)
            {
                if( j == board[i])
                {
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    
    static int seeHowManyAttackThemselv(int[] board , int len)
    {
        int attack=0;
        for( int i=0 ; i< len-1 ; i++)
        {
            for(int j= i+1 ; j<len ; j++)
            {
                if(board[i] == board[j])
                {
                    attack++;
                    continue;
                }
                if(board[i] - board[j] == i - j)
                {
                    attack++;
                    continue;
                }
                if(board[i] - board[j] == j - i)
                {
                    attack++;
                }
            }
        }
        return attack;
    }
    static int[] gerenateBoard(int[] board , int len)
    {
        ArrayList<Integer> choice = new ArrayList<Integer>();
        int temp ;
        int score;
        int eval= seeHowManyAttackThemselv(board , len);
        int k;
        
        int[] boardOut = new int[len];
        
        for(int i=0 ; i<len ; i++)
        {
            boardOut[i]=(board[i]);
        }
        
        for(int i=0 ; i<len ; i++)
        {
            choice.add(boardOut[i]);
            temp = boardOut[i];
            
            for(int j=0 ; j < len ; j++)
            {
                boardOut[i] = j;
                
                k=seeHowManyAttackThemselv(boardOut , len);
                
                if(k==eval)
                {
                    choice.add(j);
                }
                
                if(k < eval)
                {
                    choice.clear();
                    choice.add(j);
                    eval=k;
                }
            }
            int x= (int)(Math.random() % choice.size());
            boardOut[i] = choice.get(x);
        }
        
        return boardOut;
    }
    
    static boolean findNextState( int[] board ,int len)
    {
        int maineval = seeHowManyAttackThemselv(board , len);
        
        int[] tempBoard;
        
        tempBoard = gerenateBoard(board , len);
        
        if(seeHowManyAttackThemselv(tempBoard , len) < maineval)
        {
            for (int p = 0; p < len; p++)
            {
		board[p] = tempBoard[p];
            }
            return true;
        }
        return false;
    }
    
    static void initialRandomBoard(int[] board, int len)
    {
        for (int i = 0; i < len; i++)
        {
            int x;
            x = (int)(Math.random() % len);
            board[i] = x;
        }
    }
    
    static void solveArchers(int len)
    {
        int[] board= new int[len];
        initialRandomBoard(board, len);
        
        while (seeHowManyAttackThemselv(board, len) != 0)
        {
            if (!findNextState(board, len))
            {
                initialRandomBoard(board, len);
            }
        }
        
        printBoardInTerminal(board, len);
    }
}
