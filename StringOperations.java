/*
Input :
hello
java
Output:
9
No
Hello Java
 */
import java.io.*;
import java.util.*;

public class StringOperations {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        String C=A+B;
        System.out.println(C.length());  //To print length of newly formed string
        
        if(A.compareTo(B)>0 )    //To check which string is preceeding another    when sorted alphabetically     
           System.out.println("Yes");
       else
           System.out.println("No");
        
        A =A.substring(0, 1).toUpperCase() + A.substring(1);  //To convert first character in uppercase
        B =B.substring(0, 1).toUpperCase() + B.substring(1);
        C=A+" "+B;
        System.out.println(C);
        }
}
