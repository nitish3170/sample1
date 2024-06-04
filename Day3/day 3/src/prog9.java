import java.util.Scanner;

//Java Program to sort the elements of an array in ascending order
public class prog9 {
    static void merge(int[] arr, int low, int mid, int high){
        int l1=mid-low+1;
        int l2=high-mid;
        int [] a1=new int[l1];
        int []a2= new int[l2];
        for (int i=0;i<l1;i++){
            a1[i]=arr[i+low];
        }
        for (int i=0;i<l2;i++){
            a2[i]=arr[mid+1+i];
        }
        int i=0,j=0,k=low;
        while (i<l1 && j<l2){
            if (a1[i]<a2[j]){
                arr[k]=a1[i];
                i++;
            }
            else{
                arr[k]=a2[j];
                j++;
            }
            k++;
        }
        while (i<l1){
            arr[k]=a1[i];
            i++;k++;
        }
        while (j<l2){
            arr[k]=a2[j];
            j++;
            k++;
        }

    }
    static void merge_sort(int []arr,int low ,int high){
        if (low>=high) return;
        int mid=(low+high)/2;
        merge_sort(arr, low, mid);
        merge_sort(arr, mid+1, high);
        merge (arr,low,mid,high);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of Elements ");
        int n= sc.nextInt();

        int[] array=new int[n];
        for (int i=0; i<n;i++){
            array[i]= sc.nextInt();
        }
        merge_sort(array,0,n-1);
        System.out.println("Sorted array : ");
        for (int i=0; i<n;i++){
            System.out.println(array[i]);
        }

    }
}
