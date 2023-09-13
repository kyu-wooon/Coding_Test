import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        Stack<Integer> order = new Stack<>();
        
        for(int i = 0; i<skill_trees.length; i++){
            String s = skill_trees[i];
            boolean count = true;
            for(int j = 0; j<s.length(); j++){
                String sc = String.valueOf(s.charAt(j));
                if(skill.contains(sc)){// skill 문자열에서 sc를 포함하고 있을 때 
                    if(order.size() ==0 && skill.indexOf(sc) == 0){
                        order.add(skill.indexOf(sc));
                    }else if(order.size() != 0 && (order.size() == skill.indexOf(sc))){

                        order.add(skill.indexOf(sc));
                    }
                    else{
                       // System.out.println("orderSize : " + order.size());
                        //System.out.println("index : " + skill.indexOf(sc));
                        count = false;
                        //System.out.println("실패");
                        break;
                    } 
                }
                else
                {continue;}
               if(count == false){
                   break;
                  
               } 
                
            }if(count == true){
                answer++; 
            }
            //System.out.println(order.toString()); 
            order.clear();
            
            
        }
                   
        //System.out.println(order.toString());
        
        return answer;
    }
}
