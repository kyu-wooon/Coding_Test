import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1; i<=number ; i++){
            int count = 0;    
          for(int j = 1; j<=Math.sqrt(i) ; j++){
              if(i%j == 0){
                  if(i/j == j){
                  
                  
                  count = count+1;}
              else{count = count+2;}
                   
                  
              }
              
          }
            
             if(limit<count){
                answer += power;
            }else{answer+= count;}
            
            
            
            
        }
        return answer;
    }
}