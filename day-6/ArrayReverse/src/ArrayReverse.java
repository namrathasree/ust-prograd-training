import java.util.*;
class Printer <T> {

    void printArray(T[] input) {
        int length = input.length;
        for (int i = length - 1; i >= 0; i--) {
            System.out.println(input[i] + " ");
        }
    }
}
public class ArrayReverse {
    public static void main(String[] args) {
        Printer print = new Printer();
        //Scanner scanner = new Scanner(System.in);
        Integer[] numArray = {1, 2, 3};
        String[] stringArr = {"Namratha", "Sree"};
        print.printArray(numArray);
        print.printArray(stringArr);
    }
}
