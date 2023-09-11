import java.lang.*;
import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        //데크 선언 
        Deque<int[]> queue = new ArrayDeque<>(); 
        //높은 숫자가 우선 순위인 int 형 우선순위 큐 선언
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());
        
        //데크와 P큐에 값 삽입 
        for(int i =0; i<priorities.length; i++){
            queue.offer(new int[]{i,priorities[i]});
            pQueue.offer(priorities[i]);
        }
        
        //덱이 빌 때까지 반복
        while(!queue.isEmpty()){
            //덱 첫번째 값의 [1](우선순위 값)이  p큐 첫번째 값과 같을 때 
            if(queue.peekFirst()[1] == pQueue.peek()){
                pQueue.poll(); //p큐 첫번째 값 제거 
                int[] temp = queue.poll(); //temp 배열에 덱 첫번째 값 저장 & 덱에서 첫번째 값 제거  
                answer ++; //answer 증가 
                if(temp[0] == location) return answer; //temp[0](원래 인덱스의 값)이 location일 경우, answer 값 리턴
            }else{
                queue.offer(queue.poll()); //location이 아닐 경우, 덱에 poll값 삽입 
            }
        }
        return 0;
    }
}