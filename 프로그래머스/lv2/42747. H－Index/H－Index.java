import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int MAX = Integer.MIN_VALUE;
        int count = 0; 
        int val =0;
        
        Map<Integer, Integer> map = new LinkedHashMap<>();
        Integer[] arr = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(arr);

        
        for(int i = 1; i<arr.length+1; i++){
            map.put(i, arr[i-1]); 
        }
         

        
        for(Integer key : map.keySet()){
          
            count = arr.length - key +1;
            val = map.get(key);
             
            answer = Math.min(count, val);
            
            if(MAX<answer){
                MAX = answer;
            }

            
        }
        
         
        answer = MAX;
        
        return answer;
    }
}