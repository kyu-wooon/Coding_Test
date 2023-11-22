import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        List<Integer> time_list = new ArrayList<>();
        Map<String,Integer> map_alltime = new HashMap<>();
        Map<String,Integer> map_inout = new HashMap<>(); 
        
        for(int i = 0; i< records.length; i++){
            String[] tmp = records[i].split(" ");
            String[] time_split = tmp[0].split(":");
            int time = Integer.parseInt(time_split[0]) * 60 + Integer.parseInt(time_split[1]);
            if(tmp[2].equals("IN")){
                map_inout.put(tmp[1], time);
            }else{
                time = time-map_inout.get(tmp[1]);
                map_alltime.put(tmp[1], map_alltime.getOrDefault(tmp[1],0) + time);
                map_inout.put(tmp[1], -1);
            }
        }
        for(String s : map_inout.keySet()){
            if(map_inout.get(s)!=-1){
                int time = 1439-map_inout.get(s);
                map_alltime.put(s, map_alltime.getOrDefault(s,0) + time);
            }
        }

        Map<String, Integer> sortedMap = new TreeMap<>(map_alltime);
          
        for(String s : sortedMap.keySet()){
            int time = sortedMap.get(s);
            int price = 0;
            if(time <= fees[0]){
                time_list.add(fees[1]);
            }else{
                price += fees[1];
                time -= fees[0];
                price += (time/fees[2]) *fees[3];
                if(time%fees[2] != 0 ){
                    price += fees[3];
                }
                time_list.add(price);
            }
        }
        int[] answer = new int[time_list.size()];
        for(int i = 0; i<time_list.size(); i++){
            answer[i] = time_list.get(i);
        }
        return answer;
    }
}