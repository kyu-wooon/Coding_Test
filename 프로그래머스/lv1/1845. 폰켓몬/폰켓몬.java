import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 1;
        int count = nums.length/2;
        
        
        Set<Integer> tmp = new HashSet<>();
        for(int j = 0; j<nums.length ; j++){
            tmp.add(nums[j]);
            
        }

       
        if(count<=tmp.size()){
            
                answer = count;
 
           
        }else{
            answer = tmp.size();
            
        }
        
        
        
        return answer;
    }
}