import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] num = String.valueOf(n).split("");
        for(int i  = 0; i<num.length; i++){
            answer = answer + Integer.parseInt(num[i]);
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}