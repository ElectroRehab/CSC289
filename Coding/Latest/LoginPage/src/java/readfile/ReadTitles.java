package readfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadTitles {
    // String used for SQL Code to link database info
    String sqlAll;
    
    // User Element Selection
    int p = 0;    
    public void ReadTitles(int p) throws FileNotFoundException, IOException{
        this.p = p;
        // Row Count
        int i = 0;
        // File URL Location
        String fName = "https://dl.dropboxusercontent.com/s/05nufbydxhs6tg0/sqltitle.csv";
        // URL Object 
        URL url = new URL(fName);
        // Buffered Reader and Input Sctream to read CSV File located in cloud.
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        // Determine what is considered a line
        String thisLine;
        // Iterate through CSV File to find the proper connection information.
        while((thisLine = reader.readLine()) != null){
            // Array to store all elements seperated by next line
            String readBlock[] = thisLine.split("\n");
            // For loop to read through the array and set correct statement
            for(int j = 0; j < readBlock.length; j++){
                if(p == i){
                        sqlAll = readBlock[j].replace("\"","");
                }
                // check next row
                i++;
            }
        }
    }
    public String getSQLTitles(){
        return sqlAll;
    }
}

