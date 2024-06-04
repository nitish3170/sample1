import java.util.Scanner;

//    Java Program to print the elements of an array present on odd position
public class prog7 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of Elements ");
        int n= sc.nextInt();

        int[] array=new int[n];
        for (int i=0; i<n;i++){
            array[i]= sc.nextInt();
        }
        for (int i=1;i<n;i+=2){
            System.out.println(array[i]);
        }
    }
}
