class Solution {
    public int solution(int n) {
        int answer = n+1;
        int count = 0;
        int answer_count = 0;
        boolean correct = false;
        
        String s = Integer.toBinaryString(n);
        for (int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                count++;
            }
        }
        
        //System.out.println(s);
        //System.out.println(count);
        
        
        

        
        
        
        
       while(correct == false){
           answer_count = 0;
           
            String s_2 = Integer.toBinaryString(answer);
           
        for (int i = 0 ; i < s_2.length(); i++){
            
            if(s_2.charAt(i) == '1'){
                answer_count++;
            }
        }
           
           
           if(count == answer_count){
               correct = true;
               
           }
           else{answer++;}
           
           
       }
        
        return answer;
    }
}