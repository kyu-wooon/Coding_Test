import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
    //char[] chars = s.toCharArray(); //문자열 배열로 변경하기
        String[]chars = s.split("");
    Arrays.sort(chars, Collections.reverseOrder()); // 배열 정렬 
        for(int i = 0; i<chars.length; i++){
            answer += chars[i];
        }
   
        
        return answer;
    }
}