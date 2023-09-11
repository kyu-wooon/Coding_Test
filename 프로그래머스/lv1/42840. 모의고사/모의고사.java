import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int count_1 = 0; 
        int answer_1 = 0;
        int count_2 = 0; 
        int answer_2 = 0;
        int count_3 = 0; 
        int answer_3 = 0;
        int MAX = Integer.MIN_VALUE;
        List<Integer> tmp = new ArrayList<>();
         List<Integer> tmp_2 = new ArrayList<>();
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; 
        
        for(int i = 0; i <answers.length ; i++){
            if(answers[i] == first[count_1]){
                answer_1 ++;
                count_1 ++;
                
            }else{count_1++;}
            
            
            
            if(answers[i] == second[count_2]){
                answer_2 ++;
                count_2 ++;
                
            }else{count_2 ++;}
           if(answers[i] == third[count_3]){
               answer_3 ++; 
               count_3 ++;
                
            }else{count_3 ++;}
            
            if(count_1 == 5){
                count_1 = 0;
            }
            if(count_2 == 8){
                count_2 = 0;
            }
            if(count_3 == 10){
                count_3 = 0;
            }
       
        }
        

        tmp.add(answer_1);
        tmp.add(answer_2);
        tmp.add(answer_3);

        
        
        if(answer_1 == 0 && answer_2 ==0 && answer_3 ==0){
            int[] answer =  tmp_2.stream()
                .mapToInt(z -> z)
                .toArray();
            
            return answer;
            
        }
        
    
        
        System.out.println("1,2,3번 학생의 정답 갯수 : " +  tmp.toString());
        
        
        for(int j = 0 ; j<3; j++){
            
            if(MAX <= tmp.get(j)){
                MAX = tmp.get(j); 
            }
            
        }
        
        System.out.println("최대 정답 갯수 : " +  MAX);
        
                for(int z = 0 ; z<3; z++){
            
            if(MAX <= tmp.get(z)){
                tmp_2.add(z+1); 
            }
            
        }
        
        
        
        
        /*for(int j = 0 ; j<3; j++){
           if(MAX ==tmp.get(j) && tmp.get(j) != 0){
               MAX = tmp.get(j);
              
               
           } else if(MAX < tmp.get(j) && tmp.get(j) != 0){
               MAX = tmp.get(j);
               if(j !=0 && tmp.get(j-2) == tmp.get(j-1)  ){
                   
                    tmp_2.remove(Integer.valueOf(j));
                   tmp_2.remove(Integer.valueOf(j)-1);
                   
               }
               
           } 
            
            
            
            
            else if(tmp.get(j) < MAX){
               tmp_2.remove(Integer.valueOf(j+1));
            
            
        }}*/

        int[] answer =  tmp_2.stream()
                .mapToInt(z -> z)
                .toArray();
        

        
        return answer;
    }
}