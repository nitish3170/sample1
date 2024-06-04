/**
 * Hello
 */

import java.util.Scanner; 
import java.lang.Math;
public class Hello {

    public static void percent(int num){

        if (num<1){
            System.out.println("wrong");
            return;
        }
        float h=0,t=0;
        for(int i=0;i<num;i++){
            double j=Math.random();
            if (j<0.5){
                h++;
                System.out.println("H");
            }
            else{
                t++;
                System.out.println("T");
            }
        }
        System.out.println("HPercent "+ (h/num)*100);
        System.out.println("TPercent "+ (t/num)*100);

    }
    
        
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a frequency of coin flip: ");
        percent(sc.nextInt());

    }
}