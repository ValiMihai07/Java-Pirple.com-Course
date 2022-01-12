
package homework4;


public class Homework4 {


    public static void main(String[] args) {

        String[][] array = new String[6][2];
        array[0][0]="Bruno";
        array[0][1]="Mars";
        array[1][0]="Leave the door open";     
        array[1][1]="3.12 minutes";
        array[2][0]="That's what i like";
        array[2][1]="3.15 minutes";
        array[3][0]="Grenade";
        array[3][1]="3.13 minutes";
        array[4][0]="Just the way you are";
        array[4][1]="3.02 minutes";
        array[5][0]="4 songs";
        array[5][1]="12.42 minutes";
                
                
        for(int i=0 ; i < array.length ; i++)
        {
            for(int j=0 ; j < array[i].length ; j++)
            {
                if(i==0)
                {
                    if( j%2 ==0 )
                        System.out.print(array[i][j] + "  ");
                    else
                        System.out.println(array[i][j]);
                }
                else{
                    if( j%2 ==0 )
                        System.out.print(array[i][j] + " , ");
                    else
                        System.out.println(array[i][j]);
                }
            }
        }
        
        
        
    }
    
    
}