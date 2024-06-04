import java.util.Scanner;

//Find 2nd Largest Number in an Array
public class prog10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of Elements ");
        int n= sc.nextInt();

        int[] array=new int[n];
        for (int i=0; i<n;i++){
            array[i]= sc.nextInt();
        }
        int largest=Integer.MIN_VALUE, slargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if (array[i]>largest){
                slargest=largest;
                largest=array[i];
            }
            else if(array[i]>slargest){
                slargest=array[i];
            }
        }
        System.out.printf("Second Largest element is : %d",slargest);
    }
}
