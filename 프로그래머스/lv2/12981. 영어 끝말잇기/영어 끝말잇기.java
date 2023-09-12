import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        int count = 0;
        int count_all = 1;
        Map<String, Integer> map = new HashMap<>();
        
        for(int i =0; i<words.length; i++){
             //System.out.println("-----count : "+count+"---count_all"+count_all+"----------");
             if(count != 0 && count%n == 0){
               
               //for(String j : map.keySet()){ //저장된 key값 확인
               //map.put(j,0);
              //  }
               count = 0;
               count_all++;
               
               
           }
            count++;
          map.put(words[i], map.getOrDefault(words[i], 0) + 1); 
            
            
           if(0<i && (1<map.get(words[i]) || words[i].charAt(0) != words[i-1].charAt(words[i-1].length()-1))){
               answer[0] = count;
               answer[1] = count_all;
               return answer;
           }
          
            
          for(String m : map.keySet()){ //저장된 key값 확인
    //System.out.println("[Key]:" + m + " [Value]:" + map.get(m));
              
}
            
            //System.out.println("-----------------------");
            
        }
        
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다. 
       // System.out.println("Hello Java");

        return answer;
    }
}