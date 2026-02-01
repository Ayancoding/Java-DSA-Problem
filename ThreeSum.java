import java.util.*;
public class ThreeSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pencil =sc.nextFloat();
        float pen =sc.nextFloat();
        float earser =sc.nextFloat();

        float total = pencil + pen + earser;
        System.out.println("Bill is :" +total);

        // Add on with 18% tax
        float newTotal = total + (0.18f + total);
        System.out.println("bll with 18% :" + newTotal);


    }
}
