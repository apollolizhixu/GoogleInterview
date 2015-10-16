package compress_String;

import java.util.Arrays;

public class Solution {
	/*
	 * "第五轮是给一个 BST，可以有 duplicate values，找出出现次数最多的 value，还问了一个把"
	 * "aabbbcc 压缩成 a*2b*3c*2，再解压缩，原来的字符串里可能也有数字和*"
	*/
	public String compressString(String str){
		if (str == null || str.length() == 0){
			return "";
		}
		int start= 0;
		int end = 0;
		StringBuilder sb = new StringBuilder();
		for (; end <= str.length(); end++){
			while (end != str.length() && str.charAt(start) == str.charAt(end)){
				end++;
			}
			sb.append(str.charAt(start));
			sb.append("*");
			sb.append(end - start);
			start = end;
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String str = "abbccc";
		System.out.println(s.compressString(str));
	}

}
