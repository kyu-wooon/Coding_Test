import java.util.Arrays;
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] arrA =  my_string.toCharArray();
        
        for(int i = 0; i < n; i++){
            answer += arrA[i];
        }
        return answer;
    }
}