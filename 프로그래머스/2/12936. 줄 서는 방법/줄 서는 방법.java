import java.util.*;
//n의 팩토리얼 /  숫자의 갯수 n , 즉 (n-1)! 마다 앞자리가 바뀌게 된다 . 
class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        long temp = k - 1; //처음에 1,2,3,4가 포함되어 있기에, 인덱스 계산 시 k-1으로 계산한다. 
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        
        //리스트 생성 
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        
        //n이 0이 될 때까지 반복 
        while(n != 0){
            long num = temp / factorial(n - 1);
            answer[index] = list.get((int)num);
            list.remove((int)num);
            temp = temp % factorial(n - 1);
            n--;
            index++;
        }

        return answer;
    }
    //팩토리얼 구하는 함수 
    public long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}