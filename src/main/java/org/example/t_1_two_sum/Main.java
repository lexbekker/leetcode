package org.example.t_1_two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Учитывая массив целых чисел nums и целочисленное целевое значение,
 * верните индексы двух чисел таким образом, чтобы они суммировались с целевым значением.
 *
 * Вы можете предположить, что каждый ввод будет иметь ровно одно решение,
 * и вы не можете использовать один и тот же элемент дважды.
 *
 * Вы можете вернуть ответ в любом порядке.
 */
public class Main {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        Main main = new Main();
        int target = 9;

        main.twoSum(nums, target);


    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return res;
    }

    public int[] twoSum1(int[] numbers, int target) {
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();

        for(int i = 0; i < numbers.length; i++){

            Integer diff = target - numbers[i];
            if(hash.containsKey(diff)){
                int[] toReturn = {hash.get(diff)+1, i+1};
                return toReturn;
            }

            hash.put(numbers[i], i);

        }

        return null;
    }
}
