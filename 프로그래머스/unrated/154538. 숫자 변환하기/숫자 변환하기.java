import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        Queue<int[]> que = new LinkedList<>();
        HashSet<Integer> distinct = new HashSet<>();
        
        //초기 값 삽입 
        que.add(new int[]{x, 0});
        
        //큐가 비지 않는 한 반복
        while (!que.isEmpty()) {
            int[] tmp = que.poll();
            int num = tmp[0];
            int cnt = tmp[1];

            if (num > y) continue; //num이 y보다 클 경우 계속해서 poll 반복

            if (num == y) {
                return cnt; //같을 경우 cnt 반환 
            } else {
                cnt++; // 연산 전에 cnt 추가 
                //set에 값이 존재하지 않는다면 연산 진행 
                if (!distinct.contains(num + n)) {
                    distinct.add(num + n);
                    que.add(new int[]{num + n, cnt});
                }
                if (!distinct.contains(num * 2)) {
                    distinct.add(num * 2);
                    que.add(new int[]{num * 2, cnt});
                }
                if (!distinct.contains(num * 3)) {
                    distinct.add(num * 3);
                    que.add(new int[]{num * 3, cnt});
                }
            }
        }
        return -1;
    }
}