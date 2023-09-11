import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> answer_list = new ArrayList<>();
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                answer_list.add(arr[i]);
            }
        }
        if(answer_list.size() == 0){
             answer_list.add(-1);
        }
        
        answer = answer_list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}