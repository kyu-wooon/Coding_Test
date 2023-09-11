import java.util.*;
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int x_add = 0;
        String[] arr = String.valueOf(x).split("");
        
        for(int i = 0; i < arr.length ; i++){
            x_add += Integer.parseInt(arr[i]);
        }
        if(x%x_add ==0){
            answer = true;
        }else{answer = false;}
        return answer;
    }
}