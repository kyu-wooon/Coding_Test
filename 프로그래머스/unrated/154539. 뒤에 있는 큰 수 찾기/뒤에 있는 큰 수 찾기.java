import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Deque<Integer> stack = new ArrayDeque<>();
        
        int val = numbers[numbers.length-1];
        stack.push(val);
        answer[numbers.length-1] = -1;
        
        for(int i = numbers.length-2; i>=0; i--){
            //스택이 비어있지 않고 numbers[i]가 스택 제일 위의 숫자보다 크면 
            while(!stack.isEmpty()&&numbers[i] >= stack.peek()){
                stack.pop();
                
            }
            
            if(!stack.isEmpty()) answer[i] = stack.peek();
            else answer[i] = -1;
            stack.push(numbers[i]);
        }
        System.out.println(stack.toString());
        return answer;
    }
}