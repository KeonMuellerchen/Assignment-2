package assignment2;

/**
 * @date 2017-12-18
 * @author Keon Muellerchen
 * @version 1
 * The application takes 5 students, each with 5 grades, calculates the student with the highest average, and
 * all the students that have a failing average below 50%.
 */
public class Assignment2 {
    private static String[][] arrays;
    
    public static void main(String[] args) {
        
        initializeData();
        displayNamesAndGrades();
        highestAverage();
        failingAverages();
 
    }//end of main method
    
    
    /**
     * This method populates the chart with data.
     */
    public static void initializeData()
    {
        //initialize the 2-dimensional arrray
        arrays = new String[6][7];
        
        //Header row
        arrays[0][0] = "Student";
        arrays[0][1] = "Course 1";
        arrays[0][2] = "Course 2";
        arrays[0][3] = "Course 3";
        arrays[0][4] = "Course 4";
        arrays[0][5] = "Course 5";
        
        //First student
        arrays[1][0] = "Ginger Vitus";
        arrays[1][1] = "50";
        arrays[1][2] = "65";
        arrays[1][3] = "43";
        arrays[1][4] = "79";
        arrays[1][5] = "92";
       
        //Second student
        arrays[2][0] = "Sam Tokes";
        arrays[2][1] = "39";
        arrays[2][2] = "77";
        arrays[2][3] = "98";
        arrays[2][4] = "78";
        arrays[2][5] = "66";
        
        //Third student
        arrays[3][0] = "Hazle Nutt";
        arrays[3][1] = "50";
        arrays[3][2] = "55";
        arrays[3][3] = "43";
        arrays[3][4] = "30";
        arrays[3][5] = "28";
        
        //Fourth student
        arrays[4][0] = "Rambo Man";
        arrays[4][1] = "99";
        arrays[4][2] = "87";
        arrays[4][3] = "91";
        arrays[4][4] = "82";
        arrays[4][5] = "79";
        
        //Fifth student
        arrays[5][0] = "Jessica Nixon";
        arrays[5][1] = "48";
        arrays[5][2] = "65";
        arrays[5][3] = "76";
        arrays[5][4] = "15";
        arrays[5][5] = "41";
        
    }//end of method initializeData
    
    
    /**
     * This method displays the data of the two-dimensional array to the console.
     */
    public static void displayNamesAndGrades()
    {   
        for(int row=0; row<arrays.length; row++)
        {
            for(int col=0; col<arrays.length; col++)
            {
                if (col <= 6)
                    System.out.printf("%-20s", arrays[row][col]); 
                else
                    System.out.print("\n");
            }//end  of for
            
            System.out.println();   //prints new line
        }//end of for 
    }//end of method initializeLayOut
    
    
    /**
     * This method calculates which student has the highest average.
     */
    public static void highestAverage()
    {
        //set variables to zero
        float sumForValue = 0;
        float average = 0;
        float highestAverage = 0;
        int highestStudent = 0;
        
        //Start row at 1 to skip the header
        for(int row=1; row<=5; row++)
        {
            sumForValue = 0;    //have to reset sumForValue for each row
            
            for(int col=1; col<=5; col++)
                sumForValue = sumForValue + Integer.parseInt(arrays[row][col]); //Integer.parseInt converts string to an integer

            average = sumForValue/5;    //formula for finding average
            
            //If average higher the highestAverage, sets new value for highestAverage
            if (average > highestAverage)
            {
                highestAverage = average;
                highestStudent = row;
            }//end of if
        
        }//end of for
        //displays the console which student has highest average
        System.out.printf("The student with the highest average %.1f%% is %s.%n", highestAverage, arrays[highestStudent][0]);  
    }//end of method highestGrade
    
    
     /**
     * This method calculates which student(s) have a failing grade below 50%.
     */
    public static void failingAverages()
    {
        //set variables to zero
        float sumForValue = 0;
        float average = 0;
        
        for(int row=1; row<=5; row++)
        {
            sumForValue = 0;    //have to reset sumForValue for each row
            
            for(int col=1; col<=5; col++)
                sumForValue = sumForValue + Integer.parseInt(arrays[row][col]); //Integer.parseInt converts string to an integer
            
            average = sumForValue/5;    //formula for finding average
            
            //if average below 50%, prints to console
            if (average < 50)
                System.out.printf("We are concerned with %s who has an average of %.1f%%%n", arrays[row][0], average);

        }//end of for
    }//end of method failingAverages
    
}//end of Assignment2
