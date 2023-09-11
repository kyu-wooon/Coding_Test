class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i = 0; i <nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                for(int k = j+1; k<nums.length; k++){
                    int adds = nums[i] + nums[j] + nums[k];
                    int prime = 0;
                    for(int z = 1; z<adds+1; z++){
                        if(adds%z == 0){
                            prime++;
                        }
                    }
                    if(prime == 2){
                        answer++;
                    }
                    
                    
                    
                    
                }
                
                
            }
            
            
            
        }
        

        return answer;
    }
}