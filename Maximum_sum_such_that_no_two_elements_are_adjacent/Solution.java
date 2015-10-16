package Maximum_sum_such_that_no_two_elements_are_adjacent;

public class Solution {
	/*
	 * http://www.geeksforgeeks.org/maximum-sum-such-that-no-two-elements-are-adjacent/
	 */
	public int findMaxSum(int[] num){
		if (num == null || num.length == 0){
			return 0;
		}
		int[] dp = new int[num.length];
		dp[0] = num[0];
		dp[1] = Math.max(dp[0], num[1]);
		for (int i = 2; i < num.length; i++){
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + num[i]);
		}
		return dp[num.length - 1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] num = {5,  5, 10, 40, 50, 35};
		System.out.println(s.findMaxSum(num));
		System.out.println(Integer.MAX_VALUE);
	}
}
