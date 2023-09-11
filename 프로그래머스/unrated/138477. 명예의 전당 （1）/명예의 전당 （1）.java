import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> tmp = new ArrayList<>();
        
        for(int i = 0 ; i<score.length ; i++){
            
            if(i < k ){
                
                tmp.add(score[i]);
                Collections.sort(tmp, Collections.reverseOrder() );
                answer[i] = tmp.get(i);
                
            }else{
                tmp.add(score[i]);
                Collections.sort(tmp, Collections.reverseOrder() );
                answer[i] = tmp.get(k-1);
                
            }
            
            
        }
        
        
        
        return answer;
    }
}