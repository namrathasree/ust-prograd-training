import java.util.InputMismatchException;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Number1: ");
            int num1 = scanner.nextInt();
            System.out.println("Number2: ");
            int num2 = scanner.nextInt();
            System.out.println(num1 / num2);
        }catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }catch (ArithmeticException ae){
            System.out.println(ae);
        }
    }
}