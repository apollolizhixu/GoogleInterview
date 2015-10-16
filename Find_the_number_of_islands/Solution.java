package Find_the_number_of_islands;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	
	/*
	 * http://www.geeksforgeeks.org/find-number-of-islands/
	 * */
	int islands;
	public int numIslands(int[][] M){
		int m = M.length;
		int n = M[0].length;
		islands = 0;
		for (int i = 0; i < m; i++){
			for (int j = 0; j < n; j++){
				if (M[i][j] == 1){
					helperDfsRec(M, i, j, m, n);
					islands++;
				}
			}
		}
		return islands;
	}
	public void helperDfsRec(int[][] M, int i, int j, int m, int n){
		//Time complexity: O(ROW x COL)
		if (i < 0 || j < 0 || i >= m || j >= n || M[i][j] != 1){
			return;
		}
		M[i][j] = 2;
		helperDfsRec(M, i + 1, j, m, n);
		helperDfsRec(M, i - 1, j, m, n);
		helperDfsRec(M, i, j + 1, m, n);
		helperDfsRec(M, i, j - 1, m, n);
	}
	public void helperBfs(int[] M, int i, int j, int m, int n){
		Queue<int[]> q = new LinkedList<int[]>();
		int[] pres = new int[2];
		pres[0] = i;
		pres[1] = j;
		q.offer(pres);
		while (!q.isEmpty()){
			int[] tmp = q.poll();
			int col = tmp[0];
			int row = tmp[1];
			if (tmp[0] < 0 || tmp[0] > m || tmp[1] < 0 || tmp[1] > n || M[col][row] != 1){
				continue;
			}
			M[tmp[0]][tmp[1]] = 2;
		}
		q.offer(new int[]{i - 1, j});
		q.offer(new int[]{i + 1, j});
		q.offer(new int[]{i, j - 1});
		q.offer(new int[]{i, j + 1});
	}
	
	public static void main(String[] args) {
		int[][] M;
		M = new int[5][];
		M[0] = new int[]{1, 1, 0, 0, 0};
        M[1] = new int[]{0, 1, 0, 0, 1};
        M[2] = new int[]{1, 0, 0, 1, 1};
        M[3] = new int[]{0, 0, 0, 0, 0};
        M[4] = new int[]{1, 0, 1, 0, 1};
        Solution s = new Solution();
        System.out.println(s.numIslands(M));
	}
	
}
