import java.util.*;
class Solution {
    public int[] solution(String s) {
        
        Map<Integer,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(s.length()-1);
        sb.deleteCharAt(0);
        String[] split_tup = sb.toString().split("}");
        for(int i = 0; i<split_tup.length; i++){
            StringBuilder sb_2 = new StringBuilder(split_tup[i]);
            String st = split_tup[i].replace(",{","");
            st = st.replace("{","");
            String[] split_map = st.split(",");
            for(int j = 0; j<split_map.length; j++){
                map.put(Integer.parseInt(split_map[j]), map.getOrDefault(Integer.parseInt(split_map[j]),0)+1);
            }
        }
      
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        int[] answer = new int[keySet.size()];
        for(int i = 0; i<keySet.size(); i++){
            answer[i] = keySet.get(i);
        }
        return answer;
    }
}