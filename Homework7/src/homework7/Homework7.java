
package homework7;

public class Homework7 {

    public static void main(String[] args) {

       Cars a = new Cars();
       Cars b = new Cars();
       Cars c = new Cars();
       
       for( int i = 0 ; i < 3 ; i++ )
       {
            a.Drive();;
            a.Stop();
       }

       for( int i = 0 ; i < 4 ; i++ )
       {
            b.Drive();;
            b.Stop();
       }

       for( int i = 0 ; i < 7 ; i++ )
       {
            c.Drive();;
            c.Stop();
       }       
       
       a.Print();
       b.Print();
       c.Print();
    }
    
}
