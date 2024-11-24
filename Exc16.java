package Задания;

public class Exc16 {
    public static boolean isTriangle(int a, int b, int c){
        int[] mass = {a,b,c};
        int highest = a;
        int sum = a + b + c;
        for (int i = 0; i < 3; i++) {
            if(highest < mass[i]){
                highest = mass[i];
            }
        }
        sum -= highest;
        if(highest < sum) return true;
        return false;
    }
}
