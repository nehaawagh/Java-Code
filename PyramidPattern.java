import java.util.Scanner;

public class Pattern1 {
  public static void main(String[] args) {
    System.out.println("Enter the number of rows to print pyramid pattern of stars:");
    Scanner sc=new Scanner(System.in);

    int rows=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=rows-i-1;j>=1;j--){
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
              System.out.print("* ");
            }
            System.out.println();
        }
  }
}
