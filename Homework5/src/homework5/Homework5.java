
package homework5;

import java.util.* ;
import java.lang.*;

public class Homework5 
{

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String Input = reader.nextLine();
        
        System.out.println( reverseString(Input));
        isPalindrome(Input);
        
        int min = reader.nextInt();
        int max = reader.nextInt();
        System.out.println( randBetween ( min , max ));
    }
    
    public static char[] reverseString ( String sRev )
    {
        char[] Out = new char[sRev.length()]; 
        for( int i = 0 ; i < sRev.length() ; i++)
        {   
              Out[i] = sRev.toCharArray()[ sRev.length() -i -1 ] ;
        }
        return Out;
    }
    
    public static void isPalindrome( String sPal)
    {
        char[] string = sPal.toCharArray();
        int r=0;
        boolean result = true;
        for(int j = 0 ; j < sPal.length()/2 ; j++)
        {
            if( string[j] == string[ sPal.length()-j-1 ])
            {
                r++;
            }
            else
            {
                r = 0;
                break;
            }
            
        }
        if( r == sPal.length()/2 )
            System.out.println( result );
        else
            System.out.println( !result );
    }
    
    public static int randBetween( int min , int max)
    {
        return (int)(Math.random() * (max - min + 1) + min);
    }
}
