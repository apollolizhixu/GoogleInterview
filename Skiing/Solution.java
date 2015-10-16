package Skiing;

import java.util.Arrays;

public class Solution {

	/**
	 * ���⣺����һ��ͼ����ͼ�ϵ�һ������½�·����
		˼·���ܾ����DP�����ά����½������С��ü��仯��������������ÿ����Ϊ������½�·����
		���DP��״̬���̣�DP[i][j] = max(DP[i-1][j],DP[i+1][j],DP[i][j-1],DP[i][j+1]) + 1��
		(if map[i][j] > map[x][y] && (x,y) in the map)��
	 */
	public int[][] h;
	public int m = h.length;
	public int n = h[0].length;
	public int[][] dis = new int[m][n];
	
	public void init(){
		
		for(int i = 0; i < m; i++){
			Arrays.fill(dis[i], -1);
		}
	}
	
	//�ݹ��ȡ�ӵ�(i,j)�������е���󳤶�
	public int getHigh(int i, int j){
		if (dis[i][j] != -1){
			return dis[i][j];
		} else {
			int max = 0;
			int temp;
			if (j > 0){
				if (h[i][j] > h[i][j - 1]){
					temp = getHigh(i, j - 1);
					max = Math.max(temp, max);
				}
			} 
			if (j < m - 1){
				if (h[i][j] > h[i][j + 1]){
					temp = getHigh(i, j + 1);
					max = Math.max(temp, max);
				}
			}
			if (i > 0){
				if (h[i][j] > h[i - 1][j]){
					temp = getHigh(i - 1, j);
					max = Math.max(temp, max);
				}
			}
			if (i < n - 1){
				if (h[i][j] > h[i + 1][j]){
					temp = getHigh(i + 1, j);
					max = Math.max(temp, max);
				}
			}
			dis[i][j] = max + 1;
			return dis[i][j];
		}
	}
	public int getMaxHeight(){
		int max = -1;
		for (int i = 0; i < m; i++){
			for (int j = 0; j < n; j++){
				max = Math.max(max, dis[i][j]);
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
