package Задания;

public class Exc15 {
    public static boolean isDescend(int input) {
        String stringNumb = Integer.toString(input);
        for (int i = 0; i < 3; i++) {
            if (stringNumb.charAt(i) != stringNumb.charAt(0) || input <= 100 || input >= 999) {
                return false;
            }
        }
        return true;
    }
}
