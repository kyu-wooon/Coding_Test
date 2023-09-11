import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        boolean count = false;
        
        PriorityQueue<Integer> scov = new PriorityQueue<>();
        
        for(int i = 0; i<scoville.length; i++){
                scov.add(scoville[i]);
            }
        
        while(scov.peek()<K && scov.size() > 1){
            
        Integer min = scov.poll();
        Integer min_2 = scov.poll();
        Integer scv = min + (min_2*2);
            
        scov.add(scv);
            
            

            answer++;
        }
        if (K > scov.peek()) {
            return -1;
        }
        return answer;
    }
}