package Remove_duplicate_Space;

public class Solution {
	/*
	 * È¥³ýinvalid¿Õ¸ñÌâ¡£
		input: "     the   sky is   blue    "
		output: "the sky is blue"
	 */
	public String removeInvalidSpace(String str){
		if (str == null || str.length() == 0){
			return "";
		}
		int start = 0;
		int end = 0;
		StringBuilder sb = new StringBuilder();
		for (; end <= str.length(); end++){
			if (str.charAt(start) == ' '){
				while (end < str.length() && str.charAt(end) == ' '){
					end++;
				}
				if (start != 0 && end != str.length()){
					sb.append(" ");
				}
			} else {
				while (end < str.length() && str.charAt(end) != ' '){
					end++;
				}
				sb.append(str.substring(start, end));
			}
			start = end;
		}
		return sb.toString();
	}
		public String remove(String s) {
			if (s == null || s.length() == 0) {
				return s;
			}
			StringBuilder sb = new StringBuilder();
			int start = 0;
			int n = s.length();
			while (start < n) {
				while (start < n && s.charAt(start) == ' ') {
					start++;
				}
				if (start == n) {
					break;
				}
				int end = start + 1;
				while (end < n && s.charAt(end) != ' ') {
					end++;
				}
				sb.append(s.substring(start, end));
				sb.append(" ");
				start = end;
			}
			sb.deleteCharAt(sb.length() - 1);
			return sb.toString();
		}
	public String reverse(String str){
		String[] words = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--){
			sb.append(words[i]);
			sb.append(" ");
		}
		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();	
		System.out.println(s.reverse(s.remove("     the   sky is   blue   ")));
	}

}
