package Задания;

public class Exc17 {
    public static int[] richManWorld(int[][] input, int number){
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if(input[i][j] == number){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0,0};
    }
}
