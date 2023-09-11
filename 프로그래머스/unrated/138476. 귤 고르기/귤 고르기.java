import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int count = k;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        Arrays.sort(tangerine);
        
        for(int i = 0; i<tangerine.length; i++){
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1); 
            
        }
        
        /* map.forEach((key, value) -> {
            System.out.println("key: " + key + ", value: " + value);
        });*/
        
        
         List<Integer> valueList = new ArrayList<>(map.values());
        valueList.sort(Comparator.reverseOrder());
        for (Integer value : valueList) {
            //System.out.println("Value: " + value);
            if(value<=count){
                count = count - value;
                answer= answer+1;}
            else if(0<count && count<value){
                count = 0;
                answer = answer+1;
                break;
                
            }else if(count == 0){
                break;
            }
            
            
        }
        
        
        return answer;
    }
}