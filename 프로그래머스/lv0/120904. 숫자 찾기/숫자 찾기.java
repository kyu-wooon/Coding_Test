class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String nums = String.valueOf(num);
        
        String numa[] = nums.split("");
        
        for(int i = 0; i<numa.length; i++){
            if(numa[i].equals(String.valueOf(k))){
                answer = i+1;
                break;
            }
            
        }if (answer == 0){ answer = -1;}
        return answer;
    }
}