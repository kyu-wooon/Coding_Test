import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
       
        Set<Integer> tmp = new HashSet<>();
        for(int i = 0 ; i<numbers.length-1; i++){
            int add = 0;
            for(int j = i+1; j<numbers.length; j++){
                add = numbers[i] + numbers[j];
                tmp.add(add);
             
            }
        }
        //Set<Integer> set = new HashSet<Integer>(tmp);
        //List<Integer> tmp_2 =new ArrayList<Integer>(set);
        
        //int[] answer = tmp_2.stream().mapToInt(z -> z).toArray();
        int[] answer = tmp.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}