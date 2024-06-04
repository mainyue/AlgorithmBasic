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
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                //判断是否能装进背包
                if (j-nums[i-1] < 0) {
                    //无法装入背包中，选择不装入背包
                    dp[i][j] = dp[i - 1][j];
                } else {
                    //能够装入背包中，选择选或者不选当中任意一个符合条件的
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];
                }
            }
        }
        return dp[n][sum];

    }
}
