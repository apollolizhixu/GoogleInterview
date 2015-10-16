package Google_2014_10_12;

public class atoi {
	/*
	 *  Leetcode 原题 atoi. 先列test case，再写代码
	之后问你如何test。 他期待你回答 unit test. 比如说 java 或者c++里面的 assert 工具. 1point 3acres 璁哄潧
	然后让我手动run 一个sample 3,000,000,000.
	 */
	public int atoi(String str){
		if (str == null || str.length() == 0){
			return 0;
		}
		str = str.trim();
		int rst = 0;
		int i = 0;
		boolean positive = true;
		if (str.charAt(0) == '+'){
			i++;
		} else if (str.charAt(0) == '-'){
			positive = false;
			i++;
		}
		for (; i < str.length(); i++){
		    if (!Character.isDigit(str.charAt(i))){
		        return positive ? rst : -rst;
		    }
			int bit = str.charAt(i) - '0';
			if ((Integer.MAX_VALUE / 10 == rst && bit > Integer.MAX_VALUE % 10) || Integer.MAX_VALUE / 10 < rst){
				return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			rst = rst * 10 + bit;
		}
		return positive ? rst : -rst;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
