
package elevatorproject;

public class ElevatorProject {

    public static void main(String[] args) 
    {
        int elevatorA = (int)(Math.random()*9 + (-1)) ;
        int elevatorB = (int)(Math.random()*10 + 1) ;
        
        Functions person1 = new Functions() ;
        Functions person2 = new Functions() ;
        
        System.out.println( ">A " + elevatorA );
        System.out.println( ">B " + elevatorB );
        
        person1.firstStep(elevatorA, elevatorB);
        person2.firstStep(elevatorA, elevatorB);
        person1.secondStep(elevatorA, elevatorB);
        person2.secondStep(elevatorA, elevatorB);
    }
}
