import java.util.*;



class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() == 4 || s.length() == 6){
            
            if(s.matches(".*[a-zA-Z].*") == true){
                answer = false;
               
            }
            
        }else{answer = false;}
        return answer;
    }
}