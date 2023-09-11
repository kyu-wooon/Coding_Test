import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
       
        Integer max = Integer.MIN_VALUE;
        Integer min = Integer.MAX_VALUE;
        
        
        String[] answer_array = s.split(" ");
        
        for(int i = 0; i<answer_array.length; i++){
            if(max < Integer.parseInt(answer_array[i])){
                max = Integer.parseInt(answer_array[i]);
            }
            if(Integer.parseInt(answer_array[i]) < min){
                min = Integer.parseInt(answer_array[i]);
               
            }
             //System.out.println("max : " + max + ", min :" + min);
        } 
        
        answer = min + " " + max;
        
        
       
        return answer;
    }
}