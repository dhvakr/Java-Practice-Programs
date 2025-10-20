package dsa;

import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        twoSum(new int[]{3,6,11,7}, 9);
    }

    public static void twoSum(int[] nums, int target) {
        int lengthOfTheArray = nums.length;

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
        Map<Integer, Integer> map = new java.util.HashMap<>();

        for(int i=0; i<lengthOfTheArray; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                System.out.println("Indices are: " + map.get(complement) + " " + i);
                return;
            }
            map.put(nums[i], i);
        }
    }
}
