package Задания;

import java.util.ArrayList;

public class Exc21 {
    public static int[] findIntersection(int[] rightArray, int[] leftArray){
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < rightArray.length; i++) {
            if(rightArray[i] == leftArray[i]){
                array.add(rightArray[i]);
            }
        }
        int[] retMass = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            retMass[i] = array.get(i);
        }
        return retMass;
    }
}
