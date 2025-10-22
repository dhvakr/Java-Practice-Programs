package dsa;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        twoSum(new int[]{3,11,6,7}, 9);
    }

    public static void twoSum(int[] nums, int target) {
        // Brute Force Approach
//        for(int i=0; i<lengthOfTheArray; i++){
//            for(int j=i+1; j<lengthOfTheArray; j++){
//                if(nums[i] + nums[j] == target){
//                    System.out.println("Indices are: " + i + " " + j);
//                    return new int[]{i, j};
//                }
//            }
//        }

        // Optimal Approach using HashMap
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i< nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                System.out.println("Indices are: " + map.get(complement) + " " + i);
                return;
            }
            map.put(nums[i], i);
        }
    }
}
