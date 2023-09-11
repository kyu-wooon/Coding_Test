import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int[] arr_tmp = arr;
        
         List<Integer> answer_tmp = new ArrayList<>();
        
        for (int element : arr) {
            answer_tmp.add(element);
        }
        
        Arrays.sort(arr_tmp);
        
        answer_tmp.remove(Integer.valueOf(arr_tmp[0]));
        
        if(answer_tmp.size() == 0){
            answer_tmp.add(-1);
        }
        
        answer =  answer_tmp.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}