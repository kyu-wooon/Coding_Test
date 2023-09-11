import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(int i = arr.length-1, j = 0; i >-1 ; i--, j++){
            answer += Long.parseLong(arr[j]) * Math.pow(10, i);
        }
       
       
        return answer;
    }
}