package readfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadSQL {
    // String used for SQL Code One to link database info
    String sqlOne;
    // String used for SQL Code Two to link database info
    String sqlTwo;
    // String used for SQL Code One to link database info
    String sqlThree;
    // String used for SQL Code Two to link database info
    String sqlFour;
    // Row Count
    int i = 0;
    // Individual Element Count
    int p = 0;
    
    public void ReadSQL() throws FileNotFoundException, IOException{
        // File URL Location
        String fName = "https://dl.dropboxusercontent.com/s/05nufbydxhs6tg0/sqlread.csv";
        // URL Object 
        URL url = new URL(fName);
        // Buffered Reader and Input Sctream to read CSV File located in cloud.
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        // Determine what is considered a line
        String thisLine;
        // Iterate through CSV File to find the proper connection information.
        while((thisLine = reader.readLine()) != null){
            // Array to store all elements seperated by @ symbols
            String readBlock[] = thisLine.split("\n");
            // For loop to read through the array
            for(int j = 0; j < readBlock.length; j++){
                // If not Title row of the CSV file, write to variables to be 
                // passed back to JSP files. 
                if(i != 0){
                    // Set first SQL Statement for successfully created account.
                    if(p == 1){
                        sqlOne = readBlock[j];
                        System.out.println("Here is p1: " + sqlOne);
                    }
                    // Remote Database Link information storage.
                    else if(p == 2){
                        sqlTwo = readBlock[j];
                        System.out.println("Here is p2: " + sqlTwo);
                    }
                    else if(p == 3){
                        sqlThree = readBlock[j];
                        System.out.println("Here is p3: " + sqlThree);
                    }
                    else if(p == 4){
                        sqlFour = readBlock[j];
                        System.out.println("Here is p4: " + sqlFour);
                    }
                    p++;
                }
                else{
                    p++;
                }
            }
                // Add new row in loop to attempt to iterate through.
                i++;
        }
    }
    public String getSQLOne(){
        return sqlOne;
    }
    public String getSQLTwo(){
        return sqlTwo;
    }
    public String getSQLThree(){
        return sqlThree;
    }
    public String getSQLFour(){
        return sqlFour;
    }
}

