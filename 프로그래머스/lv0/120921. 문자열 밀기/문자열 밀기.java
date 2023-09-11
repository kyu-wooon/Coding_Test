import java.util.Arrays;
/*
class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        char[] arrA = A.toCharArray();
        char[] arrB = B.toCharArray();
        
        for (int j =0; j<=arrA.length; j++){
        if(Arrays.equals(arrA, arrB)){break;}
        char temp = arrA[arrA.length-1];
         for(int i=arrA.length-1; i>=1; i--) {
            arrA[i] = arrA[i-1];
        }
        arrA[0] = temp;
        answer = answer + 1;            
        }        
        if (answer>arrA.length)
        {answer = -1;}
        return answer;
    }
}
*/
class Solution {
    public int solution(String A, String B) {
    int answer = 0;
    String temp=B+B;
    answer =  temp.indexOf(A);
    return answer;
        
    }
}