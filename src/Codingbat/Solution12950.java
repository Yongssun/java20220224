package Codingbat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution12950 {

	@Test
	void test() {
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{5,6}};
		int [][]answer=solution(arr1,arr2);
		assertEquals(4,answer[0][0]);
		assertEquals(6,answer[0][1]);
		assertEquals(7,answer[1][0]);
		assertEquals(9,answer[1][1]);
	}
	  public int[][] solution(int[][] arr1, int[][] arr2) {
	        int[][] answer = new int[arr1.length][arr1[0].length];
	        for(int i=0;i<arr1.length;i++){
	            for(int j=0;j<arr1[i].length;j++){
	                answer[i][j]=arr1[i][j]+arr2[i][j];
	            }
	        }
	        return answer;
	    }
	}

