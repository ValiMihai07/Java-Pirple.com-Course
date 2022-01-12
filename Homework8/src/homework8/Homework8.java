
package homework8;

import java.util.*;

public class Homework8 extends Function {

    public static void main(String[] args) {
        int firstInput = 0;
        int secondInput = 0;
        String firstStr = new String();
        String secondStr = new String();
        Scanner intReader = new Scanner(System.in);
        Scanner strReader = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);
        String test  = " days , day , minutes , minute , seconds , second , hour , hours ";
        
        
            try
            {    
                System.out.print("Input the first value: ");
                firstInput = intReader.nextInt();
                
                System.out.print("Say if it's a seconds or minutes or hours or days: ");
                firstStr = strReader.nextLine();
                
                System.out.print("Input the second value: ");
                secondInput = intReader.nextInt();
                
                System.out.print("Say if it's a seconds or minutes or hours or days: ");
                secondStr = strReader.nextLine();
        
            }
        
            catch(InputMismatchException e)
            {
                System.out.println("false");
                System.exit(0);
            }

            corectInput(firstInput, firstStr, secondInput, secondStr , test);
            timeAdder(firstInput, firstStr, secondInput, secondStr);
        }
    }
    

