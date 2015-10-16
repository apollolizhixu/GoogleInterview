package compress_String;

import java.util.Arrays;

public class Solution {
	/*
	 * "�������Ǹ�һ�� BST�������� duplicate values���ҳ����ִ������� value��������һ����"
	 * "aabbbcc ѹ���� a*2b*3c*2���ٽ�ѹ����ԭ�����ַ��������Ҳ�����ֺ�*"
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
