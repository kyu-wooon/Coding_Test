class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] tmp = new int[emergency.length];
        int max = Integer.MIN_VALUE;
        
        
        for(int j = 0; j<emergency.length; j++){
            if(emergency[j] > max){ 
                max = emergency[j];
                answer[j] = 1;
            for(int i = 0; i<j ; i++){
                    answer[i] = answer[i]+1;
                } 
            //여기까진 잘됨
        }
            else {answer[j] = 1;for(int p = 0; p<j; p++){
                
                if(emergency[j]>emergency[p]){
                    answer[p] = answer[p]+1;
                }else{answer[j] = answer[j]+1;}
            }}
        // 이쪽 처리가 좀 어렵움... 
        }
        
        return answer;
    }
}