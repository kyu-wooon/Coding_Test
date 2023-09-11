import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int zero_cnt =-0;
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        
        
        
        for(int k = 0; k<lottos.length; k++){
            if(lottos[k] ==0){
                zero_cnt++;
            }
        }
        
        
        
        for(int i = 0; i<lottos.length; i++){
            for(int j = 0; j<lottos.length; j++){
                if(lottos[j] == win_nums[i]){
                    count++;
                }
                
                
            }
            
            
        }
        if(count + zero_cnt == 6){
            answer[0] =1; 
        }else if(count + zero_cnt == 5){
            answer[0] =2; 
        }else if(count + zero_cnt == 4){
            answer[0] =3; 
        }else if(count + zero_cnt == 3){
            answer[0] =4; 
        }else if(count + zero_cnt == 2){
            answer[0] =5; 
        }else{
            answer[0] =6; 
        }
        
        if(count== 6){
            answer[1] =1; 
        }else if(count== 5){
            answer[1] =2; 
        }else if(count == 4){
            answer[1] =3; 
        }else if(count== 3){
            answer[1] =4; 
        }else if(count== 2){
            answer[1] =5; 
        }else{
            answer[1] =6; 
        }
        
        
        return answer;
    }
}