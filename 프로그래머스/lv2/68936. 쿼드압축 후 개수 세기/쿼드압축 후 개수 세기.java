import java.util.*;

class Solution {
    public int[] solution(int[][] arr) {
        int[] answer = {0,0};
        
        int count = arr.length;
        int len = arr.length;
        String arrst = Arrays.deepToString(arr);
        
        if(arrst.contains("1") == false){
            answer[0]++;
            return answer;
        }else if(arrst.contains("0") == false){
            answer[1]++;
            return answer;
        }

        

        while(2<len){
            for(int i = 0 ; i<arr.length; i = i + (len/2) ){
            for(int j= 0 ; j<arr.length; j = j + (len/2)){
                Stack<Integer> stack = new Stack<>();
                for(int k = i; k<i+len/2 ; k++){
                    for(int p = j; p<j+len/2 ; p++){
                    stack.add(arr[k][p]);
                }}
                if(stack.contains(2) == true){
                    continue;
                }
                else if(stack.contains(0) == false){
                    answer[1]++;
                for(int k = i; k<i+len/2 ; k++){
                    for(int p = j; p<j+len/2 ; p++){
                    arr[k][p] = 2;
                }}                    
                }
                else if(stack.contains(1) == false){
                    answer[0]++;
                for(int k = i; k<i+len/2 ; k++){
                    for(int p = j; p<j+len/2 ; p++){
                    arr[k][p] = 2;
                }}                    
                }
            }} len = len/2;               
        }        
        for(int i = 0 ; i<arr.length; i++){
             for(int j = 0 ; j<arr.length; j++){
                 if(arr[i][j] == 1){
                     answer[1]++;
                 }else if(arr[i][j] == 0){
                     answer[0]++;
                 }
             }
        }
        
            
        //    count++;
       // }
       
        return answer;
    }
}