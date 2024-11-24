package Задания;

public class Exc13 {
    public static boolean isDoublePrime(int input) {
        int number1 = input / 100;
        int number2 = (input / 10) % 10;
        int number3 = input % 10;
        if (input >= 100 && input <= 999 && (number1 + number2 + number1) % 2 == 0 && (number1 * number2 * number1) % 2 == 0) {
            System.out.println("Число double четное");
            return true;
        }
        return false;
    }
}
