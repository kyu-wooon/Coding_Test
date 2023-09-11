class Solution {
    public int[] solution(int n) {
        int slength = 0;
        if(n%2 ==0){slength = n/2;}else{slength = (n/2)+1;}
        int[] answer = new int[slength];
        for (int i = 1,j = 0; j<slength; i++ ){
            if (i%2 != 0){
                answer[j] = i;
                 j++;
               
            }else{}
        }
        return answer;
    }
}