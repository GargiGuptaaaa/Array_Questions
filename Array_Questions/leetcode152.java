public class leetcode152 {
    public static void main(String[] args) {
        int nums[] = { 0, 2 };
        int max = Integer.MIN_VALUE;
        if (nums.length == 1) {
            System.out.println(nums[0]);
        }
        for (int i = 0; i <= nums.length - 1; i++) {
            int prod = nums[i];
            max = Math.max(prod, max);
            for (int j = i + 1; j < nums.length; j++) {
                prod *= nums[j];
                max = Math.max(prod, max);
            }
        }
        System.out.println(max);

    }
}
