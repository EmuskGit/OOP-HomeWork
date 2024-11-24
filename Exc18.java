package Задания;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Exc18 {
    public static int[] removeElement(int[] nums, int val) {
        ArrayList<Integer> massive = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                massive.add(nums[i]);
            }
        }
        int[] ret = new int[massive.size()];
        for (int i = 0; i < massive.size(); i++) {
            ret[i] = massive.get(i);
        }
        return ret;
    }
}
