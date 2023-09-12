class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i = 0; i<prices.length; i++){
            int sec = 0;
            
            for(int j = i+1 ; j<prices.length; j++){
                
                if(prices[j]<prices[i]){
                    if(j < prices.length){
                        sec++;
                    }
                //System.out.println("i의 값 : " + prices[i] +", j의 값 : " + prices[j]);
                //System.out.println("sec의 값 :" + sec);
                    break;
                }else{
                    sec++;
                    
                }
                //System.out.println("i의 값 : " + prices[i] +", j의 값 : " + prices[j]);
                //System.out.println("sec의 값 :" + sec);
            }
            answer[i] = sec;
        }
        
        return answer;
    }
}