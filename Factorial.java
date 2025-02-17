import java.util.*;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] a){

        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=1;
        int i=0;
        
        if (n>=0){
        while(i<n){
        result=result*(n-i);
        i=i+1;

        }
        System.out.println(result);
        }else{
            System.out.println("Invalid number:"+n);
        }
    }
        
}

