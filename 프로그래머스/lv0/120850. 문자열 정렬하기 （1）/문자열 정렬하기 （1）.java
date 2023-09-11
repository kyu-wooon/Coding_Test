import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        
        String filter = my_string.replaceAll("[a-z]","");
        String[] answer_int = filter.split("");
        int[] answer = new int[answer_int.length];
        Arrays.sort(answer_int);
        
            for(int i = 0; i<answer_int.length; i++){
                answer[i] = Integer.parseInt(answer_int[i]);
            }
        
        return answer;
    }
}