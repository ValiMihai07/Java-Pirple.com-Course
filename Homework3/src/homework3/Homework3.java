
package homework3;

public class Homework3 {

    public static void main(String[] args)
    {
        int j;
        boolean prime = false;
        for(int i=1 ; i<=100 ; i++)
        {   
            for( j = 2; j <= i / 2; j++)
                {
                    if ( i % j == 0)
                    {
                       prime = true;
                       break;
                    }
                    else
                    {
                        prime = false;
                    }
                }
            if(i != 1)
            {
                if(!prime)
                    {
                        System.out.println("prime");
                    }
                else
                { 
                    if(i % 3 == 0  &&  i % 5 ==  0)
                        {
                            System.out.println("FizzBuzz");
                        }
                    else
                        {
                            if( i % 3 == 0)
                                System.out.println("Fizz");
                            else if( i % 5 ==  0)
                            {
                                System.out.println("Buzz");
                            }
                            else
                                System.out.println(i);
                        }
                }
            }
            else
            {
                System.out.println(1);
            }
        }
    }
    
}