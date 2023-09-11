class Solution {
    public int[] solution(String s) {
        int[] answer = {0,0};
        
        while(s.equals("1") == false){
        //System.out.println(answer[0] + "번째 루프 시작");
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '0'){
                //System.out.println("0 탐지");
                answer[1]++;
            }
        }    
    
        s = s.replace("0","");
        
        int slen = s.length();
        // System.out.println("0 제거 s 값 : " + s);
        // System.out.println("slen 값 : " + slen);
        s = Integer.toBinaryString(slen);
        //     System.out.println("s 값 : " + s);
            
         answer[0]++;
            
            
        }
       
        
        
        
        
        
        
        return answer;
    }
}