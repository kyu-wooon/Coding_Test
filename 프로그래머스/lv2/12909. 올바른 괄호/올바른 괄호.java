class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int left_open = 0;
        
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                answer = false;
                left_open ++;
            }else if(s.charAt(i) == ')'&& 1<=left_open){
                
                left_open --;
            }else if(s.charAt(i) == ')' && answer == true && left_open <1){
                answer = false;
                return answer;
            }
            
        }
        
        if(left_open<= 0){
            answer = true;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
       
        return answer;
    }
}