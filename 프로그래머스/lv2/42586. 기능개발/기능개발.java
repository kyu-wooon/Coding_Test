import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        int[] end_array = new int[progresses.length];
        List<Integer>answer_list = new ArrayList<>();
        
        int count = 0;
        int end = 0;
        int index = 0; 
        int imsi = 0;
        
        while(imsi < progresses.length){
  
             for(int i =0; i<progresses.length;i++){
            if(progresses[i]<100){
                
                progresses[i] += speeds[i];
                
            }
            else if(100<=progresses[i] && i==0){
                end_array[i] = 1;

            }else if(100<=progresses[i] && end_array[i-1]==1){
                end_array[i] = 1;
              
            }
            
            
        }
            
            if(index ==0){
                for(int j = 0; j< end_array.length; j++){
                 count+= end_array[j];}
            }else{
                for(int j = index; j< end_array.length; j++){
                count+= end_array[j];
            }
            }
            
            if(count != 0){answer_list.add(count);}
          //  System.out.println("------------------");
           // System.out.println(answer_list.toString());
            
            
            for(int k = 0; k<answer_list.size(); k++){
                imsi += answer_list.get(k);
            }
            
            if(imsi < progresses.length){ imsi = 0;
                                        }
            index+= count;
            count = 0; 
            
            
           // System.out.println(Arrays.toString(progresses));
           // System.out.println(Arrays.toString(end_array));
            
            
            
 
        }
       
        
        
       // System.out.println(answer_list.toString());
        
        int[] answer = answer_list.stream()
                .mapToInt(i -> i)
                .toArray();
    
        
        return answer;
    }
}