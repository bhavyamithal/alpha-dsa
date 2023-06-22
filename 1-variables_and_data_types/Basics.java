import java.util.*;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        float a = sc.nextFloat();
        float area = 3.14f * a * a;
        System.out.println(area);
    }
}