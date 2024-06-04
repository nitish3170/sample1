import java.util.Scanner;

public class prog2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of Elements ");
        int n= sc.nextInt();
        int[] array=new int[n];
        for (int i=0; i<n;i++){
            array[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int count=0;
            int ele=array[i];
            if (array[i]!=-1) {
                for (int j = 0; j < n; j++) {
                    if (ele == array[j]) {
                        count++;
                        array[j] = -1;
                    }
                }
                System.out.printf("Frequency of %d is : %d %n", ele, count);
            }
        }
    }
}
