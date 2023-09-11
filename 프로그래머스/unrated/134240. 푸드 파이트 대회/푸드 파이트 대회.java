class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        
        for(int i = 1; i<food.length ; i++){
             int count = 0;
            
           
                count = food[i]/2; 
            
            
            for(int j = 0 ; j<count ; j++ ){
                
                sb.append(String.valueOf(i));
            }
            
        }
        String sb_reverse = sb.reverse().toString();
        
        sb.reverse();
        
        answer = sb.toString() + "0" + sb_reverse;
        
        
        
        
        return answer;
    }
}