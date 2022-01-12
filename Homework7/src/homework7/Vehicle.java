
package homework7;

import java.util.*;

public class Vehicle {
    protected String Make;
    protected String Model;
    protected int Year;
    protected double Weight;
    protected boolean NeedsMaintenance;
    protected int TripsSinceMaintenance;
    
    Scanner reader = new Scanner(System.in);
    
    public Vehicle()
    {
        System.out.print( " Make: " );
        Make = reader.nextLine();
        System.out.print( " Model: ");
        Model = reader.nextLine();
        System.out.print( " Year: ");
        Year = reader.nextInt();
        System.out.print( " Weight: ");
        Weight = reader.nextInt();
        TripsSinceMaintenance = 0;
        NeedsMaintenance = false;
    }
    
    public void Repair()
    {
        if( NeedsMaintenance == true )
        {
            NeedsMaintenance = false;
            TripsSinceMaintenance = 0;
        }
    }
    
    public void Print()
    {
        System.out.println(" Make: " + Make );
        System.out.println(" Model: " + Model );
        System.out.println(" Year: " + Year );
        System.out.println(" Weight: " + Weight );
        System.out.println(" Trips Since Maintenance: " + TripsSinceMaintenance );
        System.out.println(" Needs Maintenance: " + NeedsMaintenance );
        
    }
}
