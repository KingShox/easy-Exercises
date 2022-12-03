package SumAnB;
import java.util.Scanner;

public class Main {

     static Scanner input = new Scanner(System.in);
     static SumInClass sum = new SumInClass();

    
    public static void main(String[] args) {


        // int num1 = input.nextInt();
        // int num2 = input.nextInt();

        sum.setA( 2);
        sum.setB(2);
        
    
    


        System.out.println(sum.getA());
        System.out.println(sum.getB());

        
        System.out.println(sum.toString());

        


    }
}
