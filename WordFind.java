// George Chen

import java.io.File;
import java.util.Scanner;
import java.io.*;

public class WordFind {

    public static boolean SearchingNorth(char array[][], int cur_row, int cur_col, String search){

        for (int i = 0; i < search.length(); ++i){

            // Comparing keys
            if (search.charAt(i) == array[cur_row-i][cur_col]){}
            else return false;
        }
        return true;
    }

    public static boolean SearchingSouth(char array[][], int cur_row, int cur_col, String search){

        for (int i = 0; i < search.length(); ++i){

            // Comparing keys
            if (search.charAt(i) == array[cur_row+i][cur_col]){}
            else return false;
        }        
        return true;
    }
    
    public static boolean SearchingWest(char array[][], int cur_row, int cur_col, String search){

        for (int i = 0; i < search.length(); ++i){
            
            // Comparing keys
            if (search.charAt(i) == array[cur_row][cur_col-i]){}
            else return false;
        }
        return true;
    }

    public static boolean SearchingEast(char array[][], int cur_row, int cur_col, String search){

        for (int i = 0; i < search.length(); ++i){
 
            // Comparing keys
            if (search.charAt(i) == array[cur_row][cur_col+i]){}
            else return false;

        }
        return true;
    }

    public static boolean SearchingNorthEast(char array[][], int cur_row, int cur_col, String search){

        for (int i = 0; i < search.length(); ++i){

            // Comparing keys
            if (search.charAt(i) == array[cur_row-i][cur_col+i]){}
            else return false;
        }
        return true;
    }

    public static boolean SearchingNorthWest(char array[][], int cur_row, int cur_col, String search){

        for (int i = 0; i < search.length(); ++i){
           
            // Comparing keys
            if (search.charAt(i) == array[cur_row-i][cur_col-i]){}
            else return false;
        }
        return true;
    }

    public static boolean SearchingSouthWest(char array[][], int cur_row, int cur_col, String search){

        for (int i = 0; i < search.length(); ++i){
         
            // Comparing keys
            if (search.charAt(i) == array[cur_row+i][cur_col-i]){}
            else return false;
        }
        return true;
    }

    public static boolean SearchingSouthEast(char array[][], int cur_row, int cur_col, String search){

        for (int i = 0; i < search.length(); ++i){
            
            // Comparing keys
            if (search.charAt(i) == array[cur_row+i][cur_col+i]){}
            else return false;
        }
        return true;
    }

    public static boolean SearchNorth(char array[][], int i, int j, String search, String searchToCap){
        
        boolean found = false;

        // Check if there is enough character space going upward (North)
        if (i-(searchToCap.length()-1) >= 0){
            found = SearchingNorth(array,i,j,searchToCap); //Call function to search North direction
            if (found) {
                System.out.print(search + " was found starting at " + (i+1) + ", " + (j+1));
                System.out.println(" and oriented North");
                return true;
            }
        }
        return false;
    }

    public static boolean SearchSouth(char array[][], int i, int j, int rows, String search, String searchToCap){
        
        boolean found = false;

        // Check if there is enough character space going downward (South)
        if (i+searchToCap.length()-1 < rows){
            found = SearchingSouth(array,i,j,searchToCap); //Call function to search South direction
            if (found) {
                System.out.print(search + " was found starting at " + (i+1) + ", " + (j+1));
                System.out.println(" and oriented South");
                return true;
            }
        }    
        return false;
    }

    public static boolean SearchEast(char array[][], int i, int j, int cols, String search, String searchToCap){
        
        boolean found = false;

        // Check if there is enough character space going right (East)
        if (j+searchToCap.length()-1 < cols){
            found = SearchingEast(array,i,j,searchToCap); //Call function to search East direction
            if (found) {
                System.out.print(search + " was found starting at " + (i+1) + ", " + (j+1));
                System.out.println(" and oriented East");
                return true;
            }
        }
        return false;
    }

    public static boolean SearchWest(char array[][], int i, int j, String search, String searchToCap){
        
        boolean found = false;

        // Check if there is enough character space going left (West)
        if (j-(searchToCap.length()-1) >= 0){
            found = SearchingWest(array,i,j,searchToCap); //Call function to search West direction
            if (found){
                System.out.print(search + " was found starting at " + (i+1) + ", " + (j+1));
                System.out.println(" and oriented West");
                return true;
            } 
        }    
        return false;
    }

    public static boolean SearchNorthEast(char array[][], int i, int j, int cols, String search, String searchToCap){
        
        boolean found = false;

        // Check if there is enough character space going diagonal (Northeast)
        if ( (i-(searchToCap.length()-1) >= 0) && (j+(searchToCap.length()-1) < cols) ){
            found = SearchingNorthEast(array,i,j,searchToCap); //Call function to search Northeast direction
            if (found){
                System.out.print(search + " was found starting at " + (i+1) + ", " + (j+1));
                System.out.println(" and oriented Northeast");
                return true;    
            }
        }    
        return false;
    }

    public static boolean SearchNorthWest(char array[][], int i, int j, int cols, String search, String searchToCap){
        
        boolean found = false;

        // Check if there is enough character space going diagonal (Northwest)
        if ( (j-(searchToCap.length()-1) >= 0) && (i-(searchToCap.length()-1) >= 0) ){
            found = SearchingNorthWest(array,i,j,searchToCap); //Call function to search Northwest direction
            if (found) {
                System.out.print(search + " was found starting at " + (i+1) + ", " + (j+1));
                System.out.println(" and oriented Northwest");
                return true;
            }
        }    
        return false;
    }

    public static boolean SearchSouthEast(char array[][], int i, int j, int rows, int cols, String search, String searchToCap){
        
        boolean found = false;

        // Check if there is enough character space going diagonal (Southeast)
        if ((i+searchToCap.length()-1< rows) && (j+searchToCap.length()-1 < cols)){
            found = SearchingSouthEast(array,i,j,searchToCap); //Call function to search Southeast direction
            if (found) {
                System.out.print(search + " was found starting at " + (i+1) + ", " + (j+1));
                System.out.println(" and oriented Southeast");
                return true;
            }
        }
        return false;
    }

    public static boolean SearchSouthWest(char array[][], int i, int j, int rows, String search, String searchToCap){
        
        boolean found = false;

        // Check if there is enough character space going diagonal (Southwest)
        if ( (i+(searchToCap.length()-1) < rows) && (j-(searchToCap.length()-1) >= 0) ){
            found = SearchingSouthWest(array,i,j,searchToCap); //Call function to search Southwest direction
            if (found) {
                System.out.print(search + " was found starting at " + (i+1) + ", " + (j+1));
                System.out.println(" and oriented Southwest");
                return true;
            }
        }
        return false;
    }
    
    public static void Searching(char array[][], int rows, int cols, String search){

        String searchToCap = search.toUpperCase(); //Ensure comparison is not case sensitive
        searchToCap = searchToCap.replace(" ",""); //Remove any space        

        //Search the word grid
        for (int i = 0; i < rows; ++i){
            for (int j = 0; j < cols; ++j){
                
                // If first character match, then search all possible direction
                if (searchToCap.charAt(0) == array[i][j]) {
                     
                    // If search key found, exit the function
                    if (SearchNorth(array,i,j,search,searchToCap)) return;
                    else if (SearchSouth(array,i,j,rows,search,searchToCap)) return;
                    else if (SearchEast(array,i,j,cols,search,searchToCap)) return;
                    else if (SearchWest(array,i,j,search,searchToCap)) return;
                    else if (SearchNorthEast(array,i,j,cols,search,searchToCap)) return;
                    else if (SearchNorthWest(array,i,j,cols,search,searchToCap)) return;
                    else if (SearchSouthEast(array,i,j,rows,cols,search,searchToCap)) return;
                    else { 
                        if (SearchSouthWest(array,i,j,rows,search,searchToCap)) return;
                    }
                }
            }
        }
        // If search key not found, notify the user
        System.out.println(search + " was not found");
    }

    public static void main(String args[]) throws IOException {
        
        // #'s of command argument(s)
        int arg_size = args.length;

        //If no argument, exit program
        if (arg_size < 1){
            System.out.println("Program cannot execute due to no given command argument");
            System.exit(0);
        }
        
        int rows = 1;
        int cols;

        File myfile = new File(args[0]); // Use first command argument as input
        Scanner scanner = new Scanner(myfile);

        // Check length of the line to determine #'s of columns
        String line = scanner.nextLine();
        cols = (line.length()-1)/2;
        
        // Count number of rows
        while (scanner.hasNext()){

            line = scanner.nextLine();
            ++rows;
        }

        // Number of rows after ignoring the dash
        rows = (rows-1)/2;
        
        // Initialize a word grid
        char array [][] = new char[rows][cols];

        scanner.close();
        scanner = new Scanner(myfile);

        int k = 0;

        while (scanner.hasNextLine()){

            //Two scanner.nextLine() to skip the dash line
            line = scanner.nextLine();
            line = scanner.nextLine();
            line = line.toUpperCase();// Ensure grid is not mixed case so it won't affect case comparison
    
            //Populate the array
            for (int i = 0; i < cols; ++i){

                array[k][i] = line.charAt(2*i+1);
            }
            ++k; //Increment k to go next row
            if (k == rows) line = scanner.nextLine();
        }
        
        scanner.close();

        // If only one command argument, prompt user for search key
        if (arg_size < 2){

            scanner = new Scanner(System.in);
            System.out.print("Enter a search key: ");
            line = scanner.nextLine();

            //If search key is blank, exit program
            if (line.isEmpty()) System.exit(0);

            //Prompt user for search key. Terminate when empty string
            while (!line.isEmpty()){
                Searching(array,rows,cols,line);
                System.out.print("Enter a search key: ");
                line = scanner.nextLine();
            }
        }else{ //If two or more command argument, only take in the second argument
            myfile = new File(args[1]);
            scanner = new Scanner(myfile);
            
            while (scanner.hasNext()){
                line = scanner.nextLine();
                Searching(array,rows,cols,line);
            }
            scanner.close();
        }       
    }
}
