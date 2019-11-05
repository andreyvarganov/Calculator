import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    private static double result = 0;
    private static int value1;
    private static int value2;

    public static void main(String[] args) {
        int decision = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.print("Enter the first number: ");
                value1 = Integer.parseInt(reader.readLine());
                System.out.print("Enter the second number: ");
                value2 = Integer.parseInt(reader.readLine());

                System.out.println("Choose an action:\n" +
                        "'+' - 1\n" +
                        "'-' - 2\n" +
                        "'*' - 3\n" +
                        "'/' - 4\n" +
                        "'%' - 5");
                System.out.print("your choice: ");

                decision = Integer.parseInt(reader.readLine());

                switch (decision) {
                    case 1: {
                        addition();
                        break;
                    }
                    case 2: {
                        subtraction();
                        break;
                    }
                    case 3: {
                        multiplication();
                        break;
                    }
                    case 4: {
                        division();
                        break;
                    }
                    case 5: {
                        mod();
                        break;
                    }
                }

                print();
            }
        } catch (IOException e){
            System.out.println("Ошибка ввода!");
        }
    }

    public static void addition() {
        result = value1 + value2;
    }

    public static void subtraction() {
        result = value1 - value2;
    }

    public static void multiplication() {
        result = value1 * value2;
    }

    public static void division() {
        result = (double) value1 / value2;
    }

    public static void mod() {
        result = value1 % value2;
    }

    public static void print() {
        System.out.printf("Answer is %.2f\n\n", result);
    }
}
