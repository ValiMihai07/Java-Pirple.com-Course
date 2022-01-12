
package elevatorproject;

import java.util.*;

public class Functions {
    
    
    public int choice;
    public int choice2;
    public Scanner reader = new Scanner(System.in);
    public int time; 
    public boolean isInTransitA = false;
    public boolean isInTransitB = false;
         
    
    public void firstStep(int elevatorA , int elevatorB)
    {
        System.out.println("Which floor you want the Elevator to come?");
        choice = reader.nextInt() ;
        
        if( choice == elevatorA )
        {
            System.out.println(">A: open doors");
            System.out.println(">A: close doors");
            isInTransitA = true;
            time = 0;
        }
        else if( choice == elevatorB )
        {
            System.out.println(">B: open doors");
            System.out.println(">B: close doors");
            isInTransitB = true;
            time = 0;
        }
        else
        {
            if(choice == -1)
            {
                time= absDifference(choice, elevatorA );
                System.out.println(">A: move to -1");
                System.out.println(">A: open doors");
                System.out.println(">A: close doors");
                elevatorA = -1;
                isInTransitA = true;
            }
            else if(choice == 10)
            {
                time= absDifference(choice, elevatorB );
                System.out.println(">B: move to 10");
                System.out.println(">B: open doors");
                System.out.println(">B: close doors");
                elevatorB = 10;
                isInTransitB = true;
            }
            else
            {
                if( absDifference( elevatorA , choice ) <= absDifference( elevatorB , choice ) )
                {
                    time= absDifference(choice, elevatorA );
                    System.out.println(">A: move to " + choice);
                    System.out.println(">A: open doors");
                    System.out.println(">A: close doors");
                    elevatorA = choice ;
                    isInTransitA = true;
                }
                else
                {
                    time= absDifference(choice, elevatorB );
                    System.out.println(">B: move to " + choice);
                    System.out.println(">B: open doors");
                    System.out.println(">B: close doors");
                    elevatorB = choice;
                    isInTransitB = true;
                }
            }
        }
    }
    
    public void secondStep( int elevatorA , int elevatorB )
    {
        if( isInTransitA )
        {
            System.out.println("Which floor you want to go with elevator A?");
            choice2= reader.nextInt();
            if(choice2 == 10)
            {
                time=time + absDifference(choice, elevatorB )+ absDifference(choice, choice2);
                System.out.println("This elevator don't go to penthouse");
                System.out.println("Wait for elevator B");
                System.out.println(">B: move to " + choice);
                System.out.println(">B: open doors");
                System.out.println(">B: close doors");
                System.out.println(">B: move to " + choice2);
                System.out.println(">B: open doors");
                System.out.println(">B: close doors");
                elevatorB = choice2;
                isInTransitA = false;
                
            }
            else
            {
                time =time + absDifference(choice2, elevatorA);
                System.out.println(">A: move to " + choice2);
                System.out.println(">A: open doors");
                System.out.println(">A: close doors");
                elevatorA = choice2;
                isInTransitA = false;
            }
        }
        else if( isInTransitB )
        {
            System.out.println("Which floor you want to go with elevator B?");
            choice2= reader.nextInt();
            if(choice2 == -1 )
            {
                time=time + absDifference(choice, elevatorA )+ absDifference(choice, choice2);
                System.out.println("This elevator don't go to basement");
                System.out.println("Wait for elevator A");
                System.out.println(">A: move to " + choice);
                System.out.println(">A: open doors");
                System.out.println(">A: close doors");
                System.out.println(">A: move to " + choice2);
                System.out.println(">A: open doors");
                System.out.println(">A: close doors");
                elevatorA = choice2;
                isInTransitB = false;
            }
            else
            {
                time =time + absDifference(choice2, elevatorB);
                System.out.println(">B: move to " + choice2);
                System.out.println(">B: open doors");
                System.out.println(">B: close doors");
                elevatorB = choice2;
                isInTransitB = false;
            }
        }
    }
    
    public int absDifference (int a , int b)
    {
       return Math.abs(a-b); 
    }
    
    public void emergency()
    {
        if(isInTransitA)
        {
            System.out.println(">A :Stop"
                             + ">A :Open doors");
            isInTransitA = false;
        }
        else
        {
            System.out.println(">B :Stop"
                             + ">B :Open doors");
            isInTransitB = false;
        }
    }
    
    public void resetEmergency()
    {
        if(isInTransitA)
        {
            System.out.println( ">A :The elevator was restarted"
                              + ">A :Close doors");
            isInTransitA =true ;
        }
        else
        {
            System.out.println(">B: The elevator was restarted"
                             + ">B :Close doors");
            isInTransitB = true;
            
        }
    }
}
