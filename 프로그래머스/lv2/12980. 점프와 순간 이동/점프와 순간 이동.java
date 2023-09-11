import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n!=0){
            
            if(n%2 == 0){
                n = n/2;
                //System.out.println("나눠짐 : "+n);
            }else{
                answer = answer +1;
                 n= n-1;
            //System.out.println("안나눠짐 : "+n);
            }
            
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        

        return answer;
    }
}