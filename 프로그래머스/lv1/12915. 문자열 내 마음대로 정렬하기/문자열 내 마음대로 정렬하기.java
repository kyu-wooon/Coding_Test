import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        for(int i = 0 ; i<strings.length; i++){
            
            strings[i] = strings[i].charAt(n) + strings[i];
                        
            
        }
        
        Arrays.sort(strings);
        
        for(int j = 0; j<strings.length; j++){
            
            StringBuilder sb = new StringBuilder(strings[j]);
            
            
            sb.deleteCharAt(0);
                
            answer[j] = sb.toString();
            
        }
        
        
        return answer;
    }
}