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
    // String used for SQL Code Three to link database info
    String sqlThree;
    // String used for SQL Code Four to link database info
    String sqlFour;
    // String used for SQL Code Five to link database info
    String sqlFive;
    // String used for SQL Code Six to link database info
    String sqlSix;
    // String used for SQL Code Seven to link database info
    String sqlSeven;
    // String used for SQL Code Eight to link database info
    String sqlEight;
    // String used for SQL Code Nine to link database info
    String sqlNine;
    // String used for SQL Code Ten to link database info
    String sqlTen;
    // String used for SQL Code Eleven to link database info
    String sqlEleven;
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
                    }
                    else if(p == 2){
                        sqlTwo = readBlock[j];
                    }
                    else if(p == 3){
                        sqlThree = readBlock[j];
                    }
                    else if(p == 4){
                        sqlFour = readBlock[j].replace("\"","");
                    }
                    else if(p == 5){
                        sqlFive = readBlock[j].replace("\"","");
                    }
                    else if(p == 6){
                        sqlSix = readBlock[j].replace("\"","");
                    }
                    else if(p == 7){
                        sqlSeven = readBlock[j].replace("\"","");
                    }
                    else if(p == 8){
                        sqlEight = readBlock[j].replace("\"","");
                    }
                    else if(p == 9){
                        sqlNine = readBlock[j].replace("\"","");
                    }
                    else if(p == 10){
                        sqlTen = readBlock[j].replace("\"","");
                    }
                    else if(p == 11){
                        sqlEleven = readBlock[j].replace("\"","");
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
    public String getSQLFive(){
        return sqlFive;
    }
    public String getSQLSix(){
        return sqlSix;
    }
    public String getSQLSeven(){
        return sqlSeven;
    }
    public String getSQLEight(){
        return sqlEight;
    }
    public String getSQLNine(){
        return sqlNine;
    }
    public String getSQLTen(){
        return sqlTen;
    }
    public String getSQLEleven(){
        return sqlEleven;
    }
}

