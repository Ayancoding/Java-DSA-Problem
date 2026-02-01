import java.util.*;
public class AreaofSquare {
    public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int side = sc.nextInt();

    int area = side * side;

    System.out.println("Area of squre is :" +area);
    sc.close();
}
}
