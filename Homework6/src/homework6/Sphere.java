
package homework6;

import java.util.*;

public class Sphere {
    
    private double radius;
    private double pi;
    
    Sphere()
    {
        radius=0;
        pi=3.14;
    }
    
    public void read()
    {   
            Scanner reader = new Scanner(System.in);
            radius = reader.nextFloat();
    }
    
    public double diameter ()
    {
        return 2*radius;
    }
    
    public double circumference()
    {
        return 2*radius*pi;
    }
    
    public double surfaceArea()
    {
        return pi*radius*radius*4 ;
    }
    
    public double volume()
    {
        return (4*pi*radius*radius*radius)/3;
    }
}

