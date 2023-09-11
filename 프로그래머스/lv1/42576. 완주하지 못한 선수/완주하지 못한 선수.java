import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        //String comp = Arrays.toString(participant);
         Arrays.sort(participant);
         Arrays.sort(completion);

        //System.out.println(Arrays.toString(participant));
        //System.out.println(Arrays.toString(completion));
        //List<String>comp = new ArrayList<>(Arrays.asList(completion));
       
        for(int i = 0 ; i<completion.length; i++){
            if(participant[i].equals(completion[i]) == false){
                
                return participant[i];
                
            }
            
        }
        
        return participant[participant.length-1];
    }
}