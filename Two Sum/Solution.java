import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>(); // value -> index
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }
            
            seen.put(nums[i], i);
        }
        
        return new int[] {}; // No solution found
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Example 1
        System.out.println(Arrays.toString(sol.twoSum(new int[] {2, 7, 11, 15}, 9))); // [0, 1]
        
        // Example 2
        System.out.println(Arrays.toString(sol.twoSum(new int[] {3, 2, 4}, 6))); // [1, 2]
        
        // Example 3
        System.out.println(Arrays.toString(sol.twoSum(new int[] {3, 3}, 6))); // [0, 1]
    }
}
