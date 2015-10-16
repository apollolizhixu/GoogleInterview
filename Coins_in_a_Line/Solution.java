package Coins_in_a_Line;

//There are n coins in a line. (Assume n is even). Two players take turns to take a coin
//from one of the ends of the line until there are no more coins left. The player with the
//larger amount of money wins.
//1. Would you rather go first or second? Does it matter?
//2. Assume that you go first, describe an algorithm to compute the maximum amount
//of money you can win.

public class Solution {
	private int MAX_N = 100;
	
	public int maxMoney(int[] A, int N){
		int[][] P = new int[N][N];
		int a, b, c;
		for (int i = 0; i < N; i++){
			for (int m = 0; m < N - i; m++){
				a = ((m + 2 <= N - 1) ? P[m + 2][m + i] : 0);
				b = ((m + 1 <= N - 1 && (m + i - 1)>= 0) ? P[m + 1][m + i - 1] : 0);
				c = (m + i - 2 >= 0) ? P[m][m + i - 2] : 0;
				P[m][m + i] = Math.max(A[m] + Math.min(a, b), A[m + i] + Math.min(b, c));
			}
		}
		print(P, A, N);
		return P[0][N - 1];
	}
	
	public void print(int[][] P, int[] A, int N){
		int sum1 = 0, sum2 = 0;
		int m = 0, n = N - 1;
		boolean myTurn  = true;
		while (m <= n){
			int P1 = P[m + 1][n];
			int P2 = P[m][n - 1];
			System.out.print((myTurn ? "I" : "You") + " take coin no.");
			if (P1 <= P2){
				System.out.print((m + 1) + "(" + A[m] + ")");
				m++;
			} else {
				System.out.print((n + 1) + "(" + A[n] + ")");
				n--;
			}
			System.out.print(myTurn ? "," : ".\n");
			myTurn = !myTurn;
		}
		System.out.println("Total money I got is:" + P[0][N - 1]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] A = {3, 2, 2, 3, 1, 2};
		System.out.println(s.maxMoney(A, 6));
		int N = 6;
//		for (int i = 0; i < N; i++){
//			for (int m = 0; m < N - i; m++){
//				System.out.print(m + "," + (m + i));
//				System.out.println();
//			}
//		}
	}
}
