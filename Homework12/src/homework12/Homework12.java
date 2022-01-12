
package homework12;

import java.io.*;

public class Homework12 {
    
    public static void main(String[] args) throws IOException {
        File outFile = new File( "fifa-tab.xml" );
        File inFile = new File( "data.csv");
        
        
            FileWriter out = new FileWriter(outFile);
            BufferedReader in = new BufferedReader ( new FileReader (inFile));
            String input = "";
            String newInput ;
            while ( (newInput = in.readLine())  != null )
            {
                input += (newInput + "\r\n");
            }
        
            out.write( input.replace( "," , "   "));
        
       
            out.close();
            in.close();
        

    }
}    

