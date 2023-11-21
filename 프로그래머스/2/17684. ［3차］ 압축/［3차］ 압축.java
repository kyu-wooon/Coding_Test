import java.util.*;
class Solution {
    public int[] solution(String msg) {
        
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int char_num = 65;
        int key_num = 27;
        StringBuilder s = new StringBuilder();
        //Map 사전 초기화
        for(int i = 1; i<27 ; i++){
            map.put(String.valueOf((char)char_num), i);
            char_num++;
        }
        //System.out.println(map.toString());
        /*
        for(int i = 0; i<msg.length(); i++){
            s += msg.charAt(i);
            if(map.containsValue(s) == false){
                System.out.println("없는 단어" + s);
                map.put(key_num, s);
                key_num++;
                s = "";
                i--;
            }else{System.out.println("있는 단어" + s);}
        }*/
        for(int i = 0; i<msg.length(); i++){
             s.append(String.valueOf(msg.charAt(i)));
            if(map.containsKey(s.toString()) == true){
                System.out.println("있는 단어" + s.toString());
                if(i == msg.length()-1){
                    list.add(map.get(s.toString()));
                }
                continue;
            }else{
                System.out.println("없어!" + s.toString());
                //s.deleteCharAt(s.length()-1);
                map.put(s.toString(), key_num);
                s.deleteCharAt(s.length()-1);
                list.add(map.get(s.toString()));
                key_num++;
                s = new StringBuilder();
                i--;
            }
            
        }
        
        System.out.println(list.toString());
        int[] answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}