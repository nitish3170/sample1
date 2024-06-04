import java.util.Scanner;

import static java.lang.System.exit;

public class prog3 {
//    Print Largest Element
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of Elements ");
        int n= sc.nextInt();

        if(n==0)exit(0);

        int[] array=new int[n];
        for (int i=0; i<n;i++){
            array[i]= sc.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        for (int i=0; i<n;i++){
            if (largest<array[i])largest=array[i];
        }
        System.out.printf("Largest value: %d",largest);
    }
}
