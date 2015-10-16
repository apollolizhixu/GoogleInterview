package Count_1s_in_integer;

public class Solution {

	/**
	 * @param args
	 */
	public static int countSetBits(int n){
		//Time Complexity: O(n) -- n is digits of this number;
		int rst = 0;
		while (n != 0){
			if ((n & 1) == 1){
				rst++;
			}
			n = n >> 1;
		}
		return rst;
	}
	public static int countSetBits1(int n){
		//Time: O(m) -- m is number of "1"s in this number
		int rst = 0;
		while (n != 0){
			n = (n & (n - 1));
			rst++;
		}
		return rst;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(countSetBits1(73524));
		for (int i = 0; i < digit; i++) {
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    list.add(nums[j]);
                }
            }
            rst.add(new ArrayList<Integer>(list));
        }
	}
}
