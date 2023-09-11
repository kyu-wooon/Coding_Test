class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        if(num_list.length >= 11){
            for(int e : num_list){
                answer += e;
            }
        }else if(num_list.length <= 10){
                  answer = 1;
                for(int e : num_list){
                    
                    answer = answer * e;
                }
            }
        return answer;
    }
}