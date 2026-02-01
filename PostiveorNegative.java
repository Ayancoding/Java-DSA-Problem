import java.util.*;
public class PostiveorNegative {
    public static void main(String args[]){
        System.out.println("Enter the number to be check");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x > 0){
            System.out.println("x is greater than 0");
        } else {
            System.out.println("x is less than or equal to 0");
        }
        sc.close();
    }
}
