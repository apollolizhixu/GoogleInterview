package Youtube_Phone_Interview1;

/*http://www.meetqun.com/thread-1410-1-4.html
 * 1. Given a bag of letters and a stream of words, identify whether word can be formed 
 * by the letter in the bag(letter in the bag cannot be reused).
		E.X.  bag: [A, A, B, N,, C, I, K, J, N]   word: Ninja. return true#  	
 * */

public class search_in_bag {

	public boolean searchInBag(char[] bag, String word){
		if (word == null){
			return false;
		}
		int[] letters = new int[26];
		for (int i = 0; i < bag.length; i++){
			letters[Character.toLowerCase(bag[i]) - 'a']++;
		}
		for (int i = 0; i < word.length(); i++){
			char c = Character.toLowerCase(word.charAt((i)));
			if (letters[c - 'a'] == 0){
				return false;
			}
			letters[c - 'a']--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		search_in_bag s = new search_in_bag();
		char[] bag = {'A', 'A', 'B', 'N', 'C', 'I', 'K', 'J', 'N'};
		String word = "Ninja";
		System.out.println(s.searchInBag(bag, word));
	}

}
