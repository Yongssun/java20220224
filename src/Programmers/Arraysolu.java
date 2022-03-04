package Programmers;

public class Arraysolu {
	
    public int[][] solution(int[][] arr1, int[][] arr2) {
   // 	arr1= [[2, 3, 2], [4, 2, 4], [3, 1, 4]]	
    //		arr2=	[[5, 4, 3], [2, 4, 1], [3, 1, 1]]
    	//			return=[[22, 22, 11], [36, 28, 18], [29, 20, 14]]
    	int[][] answer = new int[arr1.length][arr2[0].length];
        
        for(int i=0; i<arr1.length;i++){
            for(int j=0; j<arr2[0].length;j++){
                for(int k=0; k<arr1[i].length;k++){
                    answer[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        //풀이
        //첫번째  for 실행 i=0 j=0 k=0&& k=1&& k=2
        //answer[0][0]+=arr1[0][0](2)*arr2[0][0](5)= 10
        //answer[0][0]+=arr1[0][1](3)*arr2[1][0](2)= 6+10==16
        //answer[0][0]+=arr1[0][2](2)*arr2[2][0](3)= 6+16 =22
        //i=0 j=1  k=0&& k=1&& k=2
        //answer[0][1]+=arr1[0][0](2)*arr2[0][1](4)= 8
        //answer[0][1]+=arr1[0][1](3)*arr2[1][1](4)= 8+12==20
        //answer[0][1]+=arr1[0][2](2)*arr2[2][1](1)= 2+20==22
        //i=0 j=2 k=0&& k=1&& k=2
        //answer[0][2]+=arr1[0][0](2)*arr2[0][2](3)= 6
        //answer[0][2]+=arr1[0][1](3)*arr2[1][2](1)= 3+6==9
        //answer[0][2]+=arr1[0][2](2)*arr2[2][2](1)= 2+9==11
        
        
        return answer;
    }
}

