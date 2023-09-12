import java.util.*;
class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int[] cur = {0,0};
        Set<String> walk = new LinkedHashSet<>();
        String[] go = dirs.split("");
        int[] last = {0,0};
        List <String[]> answer_list = new ArrayList<>();
        for(int i = 0; i< go.length ; i++){
            if(go[i].equals("U") && cur[1]+1 !=6){
                
                //System.out.println("위");
                cur[1] = cur[1]+1;
                walk.add(String.valueOf(last[0])+String.valueOf(last[1])+String.valueOf(cur[0])+String.valueOf(cur[1]));
                walk.add(String.valueOf(cur[0])+String.valueOf(cur[1])+String.valueOf(last[0])+String.valueOf(last[1]));
                
                last[0] = cur[0];
                last[1] = cur[1];
                
            }
            else if(go[i].equals("D") && cur[1]-1 !=-6){
                //System.out.println("아래");
                cur[1] = cur[1]-1;
                walk.add(String.valueOf(last[0])+String.valueOf(last[1])+String.valueOf(cur[0])+String.valueOf(cur[1]));
                walk.add(String.valueOf(cur[0])+String.valueOf(cur[1])+String.valueOf(last[0])+String.valueOf(last[1]));
                
                last[0] = cur[0];
                last[1] = cur[1];
               
            }
            else if(go[i].equals("R") && cur[0]+1 !=6){
                //System.out.println("오른");
                cur[0] = cur[0]+1;
                walk.add(String.valueOf(last[0])+String.valueOf(last[1])+String.valueOf(cur[0])+String.valueOf(cur[1]));
                walk.add(String.valueOf(cur[0])+String.valueOf(cur[1])+String.valueOf(last[0])+String.valueOf(last[1]));
                last[0] = cur[0];
                last[1] = cur[1];
              
            }
            else if(go[i].equals("L") && cur[0]-1 !=-6){
               //System.out.println("왼");
                cur[0] = cur[0]-1;
                walk.add(String.valueOf(last[0])+String.valueOf(last[1])+String.valueOf(cur[0])+String.valueOf(cur[1]));
                walk.add(String.valueOf(cur[0])+String.valueOf(cur[1])+String.valueOf(last[0])+String.valueOf(last[1]));
                
                last[0] = cur[0];
                last[1] = cur[1];
                
            }
            
            
        }
        //System.out.println(walk.toString());
        

        answer = walk.size()/2;
        return answer;
    }
}