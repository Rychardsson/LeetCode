class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int reversedHalf = 0;
        
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }
        
        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Example 1: 121 -> true
        System.out.println("121: " + sol.isPalindrome(121));
        
        // Example 2: -121 -> false
        System.out.println("-121: " + sol.isPalindrome(-121));
        
        // Example 3: 10 -> false
        System.out.println("10: " + sol.isPalindrome(10));
    }
}
