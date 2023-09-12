import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        String count = ""; 
        Arrays.sort(phone_book);
        
         for (int i = 0; i<phone_book.length ; i++){
            if(i<phone_book.length-1){
                String cur = phone_book[i];
               
                String next = phone_book[i+1];
                
                  if(cur.length()<=next.length()){
                      if(next.indexOf(cur) == 0){
                          answer = false;
                          return answer;
                          
                      }
                  }
                   
                    
                
            }
            
            
            
            
                
            }
        
        
        
        
        
        
        
        return answer;
    }
}