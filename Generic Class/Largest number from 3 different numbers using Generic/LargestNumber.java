import java.util.Scanner;

public class LargestNumber<T extends Comparable<T>> {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();
            System.out.print("Enter second number: ");
            int num2 = input.nextInt();
            System.out.print("Enter third number: ");
            int num3 = input.nextInt();

            LargestNumber<Integer> obj = new LargestNumber<>();
            Integer result = obj.max(num1, num2, num3);
            System.out.println("The largest number is: " + result);
        }
    }

    public T max(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
}
