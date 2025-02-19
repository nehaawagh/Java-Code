/*
 * Program to print following patter
  1 2 3
  3 4 5
  5 6 7
 */
import java.util.Scanner;
public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        

        int rows=sc.nextInt();
        System.out.println("Enter number of columns:");
        int columns=sc.nextInt();
       
        int startFrom=1;
        for (int i = 0; i < rows; i++) {  
            for (int j = 0; j < columns; j++) {  
                System.out.print(startFrom + " ");
                startFrom++;  // Increment number
            }
            System.out.println();  // Move to the next line
            startFrom--;  // Adjust start for next row
        }
    }
} 
