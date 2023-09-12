import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
         Set<Integer> set = new HashSet<>();
        
        for(int i = 1; i<elements.length+1; i++){//가짓수
            
           
            //System.out.println("==========더하는 갯수: "+ i + "===========");
            for(int j = 0; j<elements.length; j++){//실제 원소 
                int order = j; 
                int count = i;
                 int add = 0;
                //System.out.println("----------시작 순서: "+ j + "------------");
                
                while(count != 0){
                    //System.out.println("반복 순서: " + order);
                    if(count>0 && order==elements.length){
                        order = 0;
                        add = add+elements[order];
                        count = count -1;
                        order++;
                        
                    }else{
                    add = add+elements[order];
                    count = count -1;
                    order++;}
                }set.add(add);
                
            }
            
            
            
        }
        
         //System.out.println(set.toString());
        answer = set.size();
        return answer;
    }
}