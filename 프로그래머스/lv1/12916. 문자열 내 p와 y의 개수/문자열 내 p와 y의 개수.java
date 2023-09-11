class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p_num = 0 ;
        int y_num = 0 ;
       
        String s_low = s.toLowerCase();
        for(int i = 0; i<s_low.length(); i++){
           if( s_low.charAt(i) == 'p'){
               p_num+=1;
           } else if( s_low.charAt(i) == 'y'){
               y_num+=1;
           }
        }
        if(p_num == y_num){
            answer = true;
        }else if(p_num != y_num){
            answer = false;
        }else if(p_num == 0 && y_num == 0){
            answer = true;
        }
        

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}