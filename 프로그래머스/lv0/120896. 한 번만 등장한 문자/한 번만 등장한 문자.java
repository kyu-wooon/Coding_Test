import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
 

class Solution {
    public String solution(String s) {
        String answer = "";
        String[]arr = s.split(""); // 문자열 배열로 변환
        StringBuilder sb = new StringBuilder(); //sb 생성 
        
        //Arrays.sort(arr);
        ArrayList<String> newList = new ArrayList<>(Arrays.asList(arr)); //배열 arr을 ArrayList로 변경 
        
        for(int i = 0; i<s.length(); i++){
            int Frequency = Collections.frequency(newList, String.valueOf(s.charAt(i)));
            if(Frequency ==1){sb.append(String.valueOf(s.charAt(i)));}
        }
        
        String tmp = sb.toString();
        char[] chars = tmp.toCharArray();
        Arrays.sort(chars);
        answer = new String(chars);
        return answer;
    }
}