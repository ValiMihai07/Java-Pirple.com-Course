
package homework6;

public class Homework6 {

    public static void main(String[] args) {
        
        Sphere OneSphere = new Sphere();
        
        OneSphere.read();
        
        System.out.println( OneSphere.circumference() );
        System.out.println( OneSphere.diameter() );
        System.out.println( OneSphere.surfaceArea() );
        System.out.println( OneSphere.volume() );
    }
    
}
