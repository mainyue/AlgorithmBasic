package dynamic_programming;

/**
 * @author yue
 * @description 输入：nums = [1,5,11,5]
 * 输出：true
 * 解释：数组可以分割成 [1, 5, 5] 和 [11] 。
 * @create 2024-06-04 22:30
 */
public class PartitionEqualSubsetSum416 {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        sum = sum / 2;
        //可以转换为背包问题：要求符合前n个物品的和 == sum
        boolean[][] dp = new boolean[n + 1][sum + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                //判断是否符合
                if(dp[i][])
            }
        }
    }
}
