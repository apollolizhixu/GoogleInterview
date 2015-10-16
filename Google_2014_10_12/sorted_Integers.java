package Google_2014_10_12;

import java.util.Arrays;

public class sorted_Integers {
	//比如给你一个 list [-7, -5, -4, -2, 0, 1, 3, 3, 5]，然后让你输出，每个数平方之后 
	//[49, 25, 16, 4, 0, 1, 9, 9, 25] 的 sorted list。
	public int[] sort(int[] input){
		if (input == null || input.length == 0){
			return null;
		}
		int[] rst = new int[input.length];
		int left = 0;
		int right = input.length - 1;
		int i = rst.length - 1;
		while (left <= right) {
			int squareL = input[left] * input[left];
			int squareR = input[right] * input[right];
			if (squareL > squareR) {
				rst[i--] = squareL;
				left++;
			} else {
				rst[i--] = squareR;
				right--;
			}
		}
		return rst;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sorted_Integers s = new sorted_Integers();
		int[] input = {-4, -2, 0, 1, 3, 5};
		System.out.println(Arrays.toString(s.sort(input)));
	}

}