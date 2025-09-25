package exceptionhandling;
import java.util.Scanner;
public class DivisionHandler {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = sc.nextInt();
        int denominator = sc.nextInt();

        try {
            int result = numerator / denominator;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled");
        }
        System.out.println("Dhatchayani U"); 
        System.out.println("2117240070066");
        sc.close();
    }

}
