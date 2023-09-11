class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for(int j = 0 ; j<arr1.length ; j++){ 
            for(int k = 0; k<arr2.length; k++){ 
                for(int m = 0; m<arr2[0].length ; m++){
                    
                  answer[j][m] += arr1[j][k] * arr2[k][m];
                    
                }
                    
                }
                
        }
        
        return answer;
    }
}