package dynamic_programming;

import org.junit.Test;

import java.util.Arrays;
import java.util.Map;

/**
 * @author yue
 * @description
 * @create 2024-05-28 19:30
 */
public class LongestIncreasingSubsequence300 {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 1;
        Arrays.fill(dp, 1);

        for (int i = 1; i < dp.length; i++) {
            int temp = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    temp = Math.max(temp, dp[j]);
                    dp[i] = temp + 1;
                }
            }

        }
        int result = 0;
        for (int i = 0; i < dp.length; i++) {
            result = Math.max(result, dp[i]);
        }
        return result;
    }

    @Test
    public void test1() {
        int[] nums = {1,3,6,7,9,4,10,5,6};
        int i = lengthOfLIS(nums);
        System.out.println(i);
    }
}
