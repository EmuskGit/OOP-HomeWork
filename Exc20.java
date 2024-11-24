package Задания;

import java.util.ArrayList;

public class Exc20 {
    public static int[] findIntersection(int[] rightArray, int[] leftArray){
        ArrayList<Integer> rightList = new ArrayList<>();
        ArrayList<Integer> leftList = new ArrayList<>();
        ArrayList<Integer> array = new ArrayList<>();
        int aI = Math.max(rightArray.length, leftArray.length);
        for (int i = 0; i < aI; i++) {
            rightList.add(rightArray[i]);
            leftList.add(leftArray[i]);
        }
        for (int i = 0; i < aI; i++) {
            for (int j = 0; j < aI; j++) {
                if (rightList.get(i) == leftList.get(j)){
                    array.add(rightList.get(j));
                }
            }
        }
        int[] retMass = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            retMass[i] = array.get(i);
        }
        return retMass;
    }
}
