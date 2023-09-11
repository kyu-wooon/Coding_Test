import java.util.*;
class Solution {
    public String solution(String new_id) {
        String answer = "";
        //StringBuilder sb = new StringBuilder(new_id);
        int count = 0;
           //1
           new_id = new_id.toLowerCase();
           //System.out.println("1단계 문자열 : " + new_id);
            //2
            new_id = new_id.replaceAll("[^a-z0-9._-]","");
            //System.out.println("2단계 문자열 : " + new_id);
        
            //3
          new_id  = new_id.replaceAll("\\.+", ".");
       
       // System.out.println("3단계 문자열 : " + new_id);
         
        //4
        StringBuilder sb = new StringBuilder(new_id);
        
        if(sb.charAt(0) == '.'){
            sb.deleteCharAt(0);
        }
        if(sb.length() !=0){
            if(sb.charAt(sb.length()-1) == '.' ){
            sb.deleteCharAt(sb.length()-1);
        }
            
        }
        
        
        //System.out.println("4단계 문자열 : " + sb );
        
        //5
        if(sb.length() == 0){sb.append("a") ;}
        //System.out.println("5단계 문자열 : " + sb);
       
        //6
        if(16<=sb.length()){
            for(int i = 0; i<15 ;i++){
                answer += sb.charAt(i);
            }}
        else{
                for(int i = 0; i<sb.length() ;i++){
                answer += sb.charAt(i);   
            }}
            
           
            if(answer.charAt(answer.length()-1) == '.'){
                
                answer = answer.replaceAll("^*.$","");
                
            }
        
        //System.out.println("6단계 문자열 : " + answer);
        
        
        //7
        
        if(answer.length()<=2){
            while(answer.length()<3){
                answer += answer.charAt(answer.length()-1);
            }
        }
        return answer;
    }
}