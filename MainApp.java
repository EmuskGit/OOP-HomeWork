package Задания;
import java.util.Arrays;
public class MainApp {
    public static void main(String[] args) {
        System.out.println("При выводе 222 должен тру - " + Exc13.isDoublePrime(222));

        System.out.println("Вuсокосный ли год? - " + Exc14.isLeapYear(1944));

        System.out.println("Число плоское? - " + Exc15.isDescend(777));

        System.out.println("Треугольник? - " + Exc16.isTriangle(1,1,1));

        int[][] inputMass = {{5,7,3,17},{7,0,1,12}};
        System.out.println("Должен найти где число 7 - " + Arrays.toString(Exc17.richManWorld(inputMass, 12)));

        int[] vvod = {1,1,2,3,1};
        System.out.println("2, 3 короче должен вернуть - " + Arrays.toString(Exc18.removeElement(vvod, 1)));

        System.out.println("Должен из 1,2,3,4,5 вывести 2,3,4,5,1 - " + Arrays.toString(Exc19.shiftElements(new int[]{1,2,3,4,5})));

        System.out.println("Даны массивы 1,4,7,3,8 и 9,12,7,4 - [4,7] - " + Arrays.toString(Exc20.findIntersection(new int[]{1,4,7,3,8}, new int[]{9,12,7,4})));
    }
}
