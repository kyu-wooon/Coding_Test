import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("R", 0);
        map.put("T", 0);
        map.put("C", 0);
        map.put("F", 0);
        map.put("J", 0);
        map.put("M", 0);
        map.put("A", 0);
        map.put("N", 0);
     
        
        for(int i = 0; i<choices.length; i++){
            
            String sur_1 = String.valueOf(survey[i].charAt(0));
            String sur_2 = String.valueOf(survey[i].charAt(1));
            
                 if(choices[i] == 1){
                
                    map.put(sur_1, map.get(sur_1) + 3);
                }else if(choices[i] == 2){
                
                    map.put(sur_1, map.get(sur_1) + 2);
                }
            else if(choices[i] == 3){
                
                    map.put(sur_1, map.get(sur_1) + 1);
                }
            else if(choices[i] == 5){
                
                    map.put(sur_2, map.get(sur_2) + 1);
                }
            else if(choices[i] == 6){
                
                    map.put(sur_2, map.get(sur_2) + 2);
                }
            else if(choices[i] == 7){
                
                    map.put(sur_2, map.get(sur_2) + 3);
                }
            
            
                
            }
                
            
           if(map.get("R")>map.get("T")){
               answer += "R";
               
           }else if(map.get("R")<map.get("T")){
                answer += "T";
           }else{ 
           String[] RT = "RT".split("");
               Arrays.sort(RT);
               answer += RT[0];
           
           }
        
        if(map.get("C")>map.get("F")){
               answer += "C";
               
           }else if(map.get("C")<map.get("F")){
                answer += "F";
           }else{ 
           String[] CF = "CF".split("");
               Arrays.sort(CF);
               answer += CF[0];
           
           }
        
        
        if(map.get("J")>map.get("M")){
               answer += "J";
               
           }else if(map.get("J")<map.get("M")){
                answer += "M";
           }else{ 
           String[] JM = "JM".split("");
               Arrays.sort(JM);
               answer += JM[0];
           
           }
        
        
        if(map.get("A")>map.get("N")){
               answer += "A";
               
           }else if(map.get("A")<map.get("N")){
                answer += "N";
           }else{ 
           String[] AN = "AN".split("");
               Arrays.sort(AN);
               answer += AN[0];
           
           }
            
            
        
        
        
        return answer;
        
        
    }
}