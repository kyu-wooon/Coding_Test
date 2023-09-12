import java.util.*;
class Solution
{
    public int solution(String s)
    {   Stack<Character> stack = new Stack<>();
        int answer = -1;
     
        for(int i = 0; i<s.length(); i++){
            
            if(stack.isEmpty()){stack.push(s.charAt(i));}
            
            else{char prev = stack.pop();
            if(s.charAt(i) == prev){
                continue;
            }else{
                stack.push(prev);
                stack.push(s.charAt(i));
            }
                
                
            }
            
            
            
        }

       if(stack.size() != 0){
           answer = 0;}
       else{answer = 1;}

        return answer;
    }
}