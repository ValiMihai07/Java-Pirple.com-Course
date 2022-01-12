
package homework7;

public class Cars extends Vehicle {
    private boolean isDriving = true;
    
    public Cars()
    {
        super();
    }
    
    public void Drive()
    {
        this.isDriving = true;
    }
    
    public void Stop()
    {
        this.isDriving = false;
        if( !isDriving )
        {
            TripsSinceMaintenance++;
        }
        if( TripsSinceMaintenance == 100)
        {
            NeedsMaintenance = true;
        }
    }
    
}
