import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        //Queue<Integer> que1 = new LinkedList<>(); //일반q1
        //Queue<Integer> que2 = new LinkedList<>(); //일반q2
        Deque<Integer> que1 = new ArrayDeque<>();
        Deque<Integer> que2 = new ArrayDeque<>();
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());//pq1
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());//pq2
        long all = 0;//두 큐 수의 합
        long que1_add  = 0;//q1수의 합 
        long que2_add = 0;//q2수의 합 

        //q1과 pq1에 값 넣고, all에 값 합산, q1수의 합에 합산 
        for(int i = 0; i<queue1.length; i++){
            que1.add(queue1[i]);
             pq1.add(queue1[i]);
            all += queue1[i];
            que1_add += queue1[i];
        }
         //q2과 pq2에 값 넣고, all에 값 합산, q2수의 합에 합산 
        for(int i = 0; i<queue2.length; i++){
            que2.add(queue2[i]);
             pq2.add(queue2[i]);
            all += queue2[i];
            que2_add += queue2[i];
        }
        //큐 합산이 홀수라면, 둘이 같은 값을 나누어가질 수 없으므로 -1 리턴 
        if(all%2 != 0){
            return -1;
        }
        // 각 큐의 가장 큰 값이 all의 반값보다 크다면, 서로 동등한 값이 될 수 없으므로 -1 리턴 
        if(all/2<pq1.poll() || all/2<pq2.poll() ){
            return -1;
        }    
        while(que1_add != que2_add && answer<=600000){
            if(que1_add < que2_add){//q1합산보다 q2합산이 클 경우 
                int tmp = que2.poll();//q1에 q2 poll값 추가, q1합산에 poll값 추가 / q2합산에 poll값 빼기 
                que1.offer(tmp);
                que1_add += tmp;
                que2_add -= tmp;
                answer++;//수행횟수 더하기 
            }else if(que2_add < que1_add){//q2합산보다 q1합산이 클 경우 
                int tmp = que1.poll();//q2에 q1 poll값 추가, q2합산에 poll값 추가 / q1합산에 poll값 빼기 
                que2.offer(tmp);
                que1_add -= tmp;
                que2_add += tmp;
                answer++;//수행횟수 더하기 
            }
        }
        if(600000<answer){
            return -1;
        }
        return answer;
    }
}