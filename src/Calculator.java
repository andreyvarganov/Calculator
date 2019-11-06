import java.io.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator {

    public static void main(String[] args) {
//        int decision = 0;
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            while (true) {
//                System.out.print("Enter the first number: ");
//                value1 = Integer.parseInt(reader.readLine());
//                System.out.print("Enter the second number: ");
//                value2 = Integer.parseInt(reader.readLine());
//
//                System.out.println("Choose an action:\n" +
//                        "'+' - 1\n" +
//                        "'-' - 2\n" +
//                        "'*' - 3\n" +
//                        "'/' - 4\n" +
//                        "'%' - 5");
//                System.out.print("your choice: ");
//
//                decision = Integer.parseInt(reader.readLine());
//
//                switch (decision) {
//                    case 1: {
//                        addition();
//                        break;
//                    }
//                    case 2: {
//                        subtraction();
//                        break;
//                    }
//                    case 3: {
//                        multiplication();
//                        break;
//                    }
//                    case 4: {
//                        division();
//                        break;
//                    }
//                    case 5: {
//                        mod();
//                        break;
//                    }
//                }

//            }
//        } catch (IOException e){
//            System.out.println("Ошибка ввода!");
//        }
        GUI gui = new GUI();
        gui.go();
    }
}
