import java.util.Scanner;

//Java Program to print the duplicate elements of an array
public class prog8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of Elements ");
        int n= sc.nextInt();

        int[] array=new int[n];
        for (int i=0; i<n;i++){
            array[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int ele=array[i];
            int dup=0;
            for(int j=i+1;j<n;j++){
                if (ele==array[j]){
                    dup=1;
                }
            }
            if (dup==1){
                System.out.println(ele);
            }
        }
    }
}
