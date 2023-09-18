import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Set<Integer> top1_set = new HashSet<>();
        Map<Integer,Integer> top2_map = new HashMap<>();
        int top2_count = 0; 
        
        //초기 값 넣기 (top1에 제일 앞 값 한개, top2에 나머지)
        top1_set.add(topping[0]);
        for(int i = 1 ; i<topping.length; i++){
            top2_map.put(topping[i], top2_map.getOrDefault(topping[i], 0) + 1);
            }
            //토핑 가지수 비교
        /*
        for(Integer k : top2_map.keySet()){
            if(0<top2_map.get(k)){
                top2_count++;
            }
        }*/
        if(top1_set.size() == top2_map.size()){
            answer++;
        }
        //top1에 값 하나씩 추가, top2에 값 하나씩 빼기 
        for(int i = 1 ; i<topping.length; i++){ 
            top2_count = 0;
            top1_set.add(topping[i]);
            top2_map.put(topping[i], top2_map.getOrDefault(topping[i], 0) - 1);
            if(top2_map.get(topping[i]) == 0){
                top2_map.remove(topping[i]);
            }
        //토핑 가지수 비교 
        /*
        for(Integer k : top2_map.keySet()){
            if(0<top2_map.get(k)){
                top2_count++;
            }
        }*/
            
        
        if(top1_set.size() == top2_map.size() ){
            answer++;
        }
        }
        return answer;
    }
}