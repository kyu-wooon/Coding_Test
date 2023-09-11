import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        
        for (int i = 0; i<commands.length ; i++){
            
            List<Integer> tmp = new ArrayList<>();
            for(int j = commands[i][0]-1; j<commands[i][1]; j++){
             
                
                tmp.add(array[j]);
                
            }
           
          
            int[] tmp_array = tmp.stream().mapToInt(z -> z).toArray();
            Arrays.sort(tmp_array);
            
            System.out.println(Arrays.toString(tmp_array));
            
            if(commands[i][2] == 1){
                answer[i] = tmp_array[0];
               
            }else{answer[i] = tmp_array[commands[i][2]-1]; }
            
            
            
            
        }
        
        
        
        return answer;
    }
}