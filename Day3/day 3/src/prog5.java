import java.util.Scanner;

import static java.lang.System.exit;

public class prog5 {
//    print element on even position
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of Elements ");
        int n= sc.nextInt();

        int[] array=new int[n];
        for (int i=0; i<n;i++){
            array[i]= sc.nextInt();
        }
        for (int i=0;i<n;i+=2){
            System.out.println(array[i]);
        }
    }
}
