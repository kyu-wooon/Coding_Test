class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        if ((common[1] - common[0]) == (common[2] - common[1])){
           int i = common.length;
            answer = common[i-1] +  (common[1] - common[0]);
        }
        else if ((common[1]/common[0]) == (common[2]/common[1])){
            int i = common.length;
            answer = common[i-1] * ((common[1]/common[0]));
            
        }
        return answer;
    }
}