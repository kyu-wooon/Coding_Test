import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        List<String> answer_list = new ArrayList<>();
        Map<String, String> user = new HashMap<>();
        
        for(int i = 0 ; i<record.length; i++){
            String[] split = record[i].split(" ");
            for(int j = 0; j<split.length; j++){
               if(split[0].equals("Enter")){
                    user.put(split[1], split[2]); 
               }else if(split[0].equals("Change")){
                   user.put(split[1], split[2]); 
               }
            }
        }
        
        for(int i = 0 ; i<record.length; i++){
            String[] split = record[i].split(" ");
            if(split[0].equals("Enter")){
                answer_list.add(user.get(split[1])+"님이 들어왔습니다.");
            }
            else if(split[0].equals("Leave")){
                answer_list.add(user.get(split[1])+"님이 나갔습니다.");
            }
        }
        
        String[] answer = new String[answer_list.size()];
        
        for(int i = 0; i<answer_list.size(); i++){
            answer[i] = answer_list.get(i);
        }
        
        return answer;
    }
}