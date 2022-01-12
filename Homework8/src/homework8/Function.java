
package homework8;

public class Function {
    
    public static void corectInput(int value1 ,  String value2 , int value3 , String value4 , String test)
    {
        if( (value2.endsWith("s") && (value1 == 1)) || (value4.endsWith( "s") && (value3 == 1) ) )
        {
            System.out.println( "false");
            System.exit(0);
        }
        else if( !(test.contains(value2)) )
        {
            System.out.println( "false");
            System.exit(0);
        }
        else if( !(test.contains(value4)))
        {
            System.out.println( "false");
            System.exit(0);
        }
        
    }
    
    
    public static void timeAdder(int value1 ,  String value2 , int value3 , String value4)
    {
        if(value2.equals(value4))
        {
            System.out.println( (value1+value3) + "," + value2 );
        }
        else if((value2.equalsIgnoreCase("seconds") && value4.equalsIgnoreCase("hours")) || (value2.equalsIgnoreCase("minutes") && value4.equalsIgnoreCase("hours")))
        {
            System.out.println( value3 + "," + value4);
        }
        else if(value2.equalsIgnoreCase("seconds") && value4.equalsIgnoreCase("minutes"))
        {
            System.out.println( value3 + "," + value4 );
        }
        else if((value2.equalsIgnoreCase("seconds") && value4.equalsIgnoreCase("days")) || (value2.equalsIgnoreCase("hours") && value4.equalsIgnoreCase("days")) || (value2.equalsIgnoreCase("minutes") && value4.equalsIgnoreCase("days")))
        {
            System.out.println( value3 + "," + value4);
        }
        else if((value4.equalsIgnoreCase("seconds") && value2.equalsIgnoreCase("hours")) || (value4.equalsIgnoreCase("minutes") && value2.equalsIgnoreCase("hours")))
        {
            System.out.println( value1 + "," + value2);
        }
        else if(value4.equalsIgnoreCase("seconds") && value2.equalsIgnoreCase("minutes"))
        {
            System.out.println( value1 + "," + value2 );
        }
        else if((value4.equalsIgnoreCase("seconds") && value2.equalsIgnoreCase("days")) || (value4.equalsIgnoreCase("hours") && value2.equalsIgnoreCase("days")) || (value4.equalsIgnoreCase("minutes") && value2.equalsIgnoreCase("days")))
        {
            System.out.println( value1 + "," + value2);
        }
        
    }
}
