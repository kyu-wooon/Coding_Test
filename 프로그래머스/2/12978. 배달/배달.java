import java.util.*;
class Solution {
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        //초기화 
        int[][] arr = new int[N][N];
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(i==j) {
                    arr[i][j]=0;//자기 자신일 경우에는 0 
                    continue;
                }
                arr[i][j]=10000000; //이외의 값에는 큰 값을 넣어서 초기화 
            }
        }
        
        for(int i=0; i<road.length; i++) {
            int v1 = road[i][0]-1; //시작위치
            int v2 = road[i][1]-1; //도착위치 
            int cost = road[i][2]; //거리 

            arr[v1][v2] = Math.min(arr[v1][v2], cost); // 원래 있던값과 cost 비교해서 작은값 넣음
            arr[v2][v1] = Math.min(arr[v2][v1], cost); // 순서 반대로도 넣음 
        }
        
        //노드를 1개부터 N개까지 거쳐가는 경우를 모두 고려한다 
        for(int k=0; k<N; k++) {
            //노드 i에서 j로 가는 경우 
            for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++) {  
                    //System.out.println("k : " + (k+1) +", i : " + (i+1) + " , j: " + (j+1) +", arr[i][j] : " + arr[i][j] );
                    //k번째 노드를 거쳐가는 비용이 기존 비용보다 더 작은 경우 갱신 
                    //또는 연결이 되어있지 않았던 경우(큰값으로 설정되어있던) 연결 비용 갱신 
                    arr[i][j] = Math.min(arr[i][j], arr[i][k]+arr[k][j]);
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        for(int j=0; j<arr.length; j++) {
            if(arr[0][j]<=K) answer++; 
        }
        return answer;
    }
}