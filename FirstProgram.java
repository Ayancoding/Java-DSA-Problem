import java.util.*;
public class FirstProgram {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int c = sc.nextInt();

        int average = (A + B + c)/3;

        System.out.println("Average is : " +average);
        sc.close();
    }
}
