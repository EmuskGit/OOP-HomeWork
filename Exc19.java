package Задания;

public class Exc19 {
    public static int[] shiftElements(int[] inputArray){
        int[] newMass = new int[inputArray.length];
        newMass[inputArray.length-1] = inputArray[0];
        for (int i = 0; i < inputArray.length-1; i++) {
            newMass[i] = inputArray[i+1];
        }
        return newMass;
    }
}
