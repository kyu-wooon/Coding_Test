import java.util.*;
class Solution {
    public int[] solution(String s) {
        
        s = s.replaceAll("\\{|\\}","");
        String[] s_arr = s.split(",");
        //System.out.println(Arrays.toString(s_arr));
        Map<String, Integer> map = new HashMap<>();
        
        for(int i =0; i<s_arr.length; i++){
            
            map.put(s_arr[i], map.getOrDefault(s_arr[i], 0) + 1); 
            
        }
        
        //System.out.println(map.toString());
        List<String> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        
        int[] answer = new int[keySet.size()];
        for(int i =0; i<keySet.size(); i++){
            answer[i] = Integer.parseInt(keySet.get(i));
        }
        
        
        return answer;
    }
}