
import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        List<Integer>tmp = new ArrayList<>();
        int count = 0;
        Integer[] score_sort = new Integer[score.length];
        
       
        for(int j = 0; j<score.length; j++){
       
            
            score_sort[j] = score[j];
        }
        Arrays.sort(score_sort, Collections.reverseOrder());
        

        for(int i = 0 ; i<score.length ; i++){

            
            tmp.add(score_sort[i]);
            count++;
            
            
            if(count == m){
                Collections.sort(tmp);
               
                answer += tmp.get(0) * m;
                
                tmp.clear();
                count = 0;
                
            }
                       
        }
        
        return answer;
    }
}