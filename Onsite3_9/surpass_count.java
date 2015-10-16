package Onsite3_9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//Surpass count j of i means that means that j > i and A[j] > A[i]
public class surpass_count {
	
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	public List<Integer> count(int[] input) {
		if (input == null || input.length == 0) {
			return null;
		}
		int n = input.length;
		int[] tmp = new int[n];
		int[] keep = new int[n];
		for (int i : input) {
			map.put(i, 0);
		}
		List<Integer> rst = new ArrayList<Integer>();
		System.arraycopy(input, 0, keep, 0, n);
		mergeSort(tmp, input);
		for (int i = 0; i < n; i++) {
			rst.add(map.get(keep[i]));
		}
		return rst;
	}
	public void mergeSort(int[] tmp, int[] input) {
		mergeSort(tmp, input, 0, input.length - 1);
	}
	public void mergeSort(int[] tmp, int[] input, int start, int end) {
		if (start < end) {
			int mid = start + (end - start) / 2;
			mergeSort(tmp, input, start, mid);
			mergeSort(tmp, input, mid + 1, end);
			merge(tmp, input, start, mid, end);
		}
	}
	public void merge(int[] tmp, int[] input, int left, int leftEnd, int rightEnd) {
		int right = leftEnd + 1;
		int range = rightEnd - left;
		int k = left;
		while (left <= leftEnd && right <= rightEnd) {
			if (input[left] < input[right]) {
				System.out.println(map.get(input[left]));
				map.put(input[left], map.get(input[left]) + (rightEnd - right + 1));
				tmp[k] = input[left];
				left++;
			} else {
				tmp[k] = input[right];
				right++;
			}
			k++;
		}
		while (left <= leftEnd) {
			tmp[k] = input[left];
			k++;
			left++;
		}
		while (right <= rightEnd) {
			tmp[k] = input[right];
			k++;
			right++;
		}
		for (int i = rightEnd - range; i <= rightEnd; i++) {
			input[i] = tmp[i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		surpass_count s = new surpass_count();
		int[] input = {10, 3, 7, 1, 23, 14, 6, 9};
		System.out.println(s.count(input));
	}
}