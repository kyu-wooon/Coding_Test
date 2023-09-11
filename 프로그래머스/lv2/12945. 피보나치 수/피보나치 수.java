import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 2;
        List<Integer> pibo = new ArrayList<>();   
        
        
        pibo.add(0);
        pibo.add(1);
        
        while(count != n+1){
            
             //System.out.println("count 값 : " + count);
           pibo.add((pibo.get(count-2) + pibo.get(count-1))%1234567); 
            //System.out.println("pibo 값 : " + pibo.get(count));
                
                count ++;
            
            
            
        }
        
        answer = pibo.get(count-1);
        
        
        
        return answer;
    }
}