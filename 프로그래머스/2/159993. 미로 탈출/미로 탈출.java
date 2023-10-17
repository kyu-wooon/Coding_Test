import java.util.*;

class Solution {
    int[] X = {0, 0, 1, -1};//Maps 배열 위치 
    int[] Y = {1, -1, 0, 0};//String Char 위치 
 
    public int solution(String[] maps) {
        int[] start = getStartPosition('S', maps); //시작 위치 좌표 반환
        int[] lever = getStartPosition('L', maps); // 레버 위치 좌표 반환 
        
        int leverCount = bfs('L', start, maps);//찾는 char, 시작 좌표, 바탕인 maps를 인자로 넣는다. (시작점에서 레버까지의 길이 )
        
        if (leverCount == 0) {//결과가 0이면 길이 없다는 의미니, -1을 반환한다. 
            return -1; 
        }
        
        int exitCount = bfs('E', lever, maps);//찾는 char, 시작 좌표, 바탕인 maps를 인자로 넣는다. (레버에서 탈출까지의 길이 )
        
        if (exitCount == 0) {//결과가 0이면 길이 없다는 의미니, -1을 반환한다. 
            return -1;
        }
        
        return leverCount + exitCount; // 시작-레버까지의 최단길이와 레버-출구까지의 최단길이를 더한 값을 리턴한다. 
    }
    
    private int bfs(char find, int[] start, String[] maps) {//찾는 char, 시작하는 좌표, 바탕인 maps를 인자로 받는다. 
        Queue<Node> q = new LinkedList<>(); // 방문한 노드들을 저장할 큐 
        q.offer(new Node(start[0], start[1], 0));// 노드에 시작 x좌표, 시작 y좌표, count 0을 넣는다. 
        
        boolean[][] visited = new boolean[maps.length][maps[0].length()]; // 같은 크기의 배열 생성 
        visited[start[0]][start[1]] = true; // 시작 지점은 true(방문완료) 로 설정 
        
        int answer = 0;
        
        while(!q.isEmpty()) {
            Node cur = q.poll(); //현재 위치 노드 poll
            
            if (maps[cur.x].charAt(cur.y) == find) {//현재 위치가 찾는 char에 위치해 있으면 
                if (answer == 0) { // answer가 0일 경우 (값이 들어간 적이 없으면)
                    answer = cur.count; //현재 count를 넣는다
                } else {//값이 있는 경우 
                    answer = Math.min(answer, cur.count);//더 짧게 걸리는 값을 넣는다 
                }
            }
            
            for (int i = 0; i < 4; i++) {//상하좌우로 이동 
                int x = cur.x + X[i];//현재 좌표값에 X값 더함
                int y = cur.y + Y[i];//현재 좌표값에 Y값 더함 
                
                if (x < 0 || y < 0  //x나 y가 0보다 작거나
                    || x >= maps.length //x가 맵의 범위를 넘어가거나
                    || y >= maps[0].length() //y가 문자열의 범위를 넘어가거나
                    || maps[x].charAt(y) == 'X' //해당 위치가 X(장애물)이 있거나
                    || visited[x][y]//이미 방문한 곳이면 
                   ) {
                    continue;//무시하고 지나간다 
                }
                //아니라면?
                visited[x][y] = true;//방문한 곳으로 체크하고 
                q.offer(new Node(x, y, cur.count + 1));//큐에다가 현재 위치를 넣고 count를 증가시킨다. 
            }
        }
        
        return answer;
    }
    //map에서 특정 값의 위치를 찾는 함수 
    private int[] getStartPosition(char find, String[] maps) {
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                if (maps[i].charAt(j) == find) {
                    return new int[]{i, j};//해당 char 문자를 찾으면 좌표 반환 
                    
                }
            }
        }
 
        return null;
    }
}
 //Node 클래스 
class Node {
   int x;
   int y;
   int count;
 
   public Node(int x, int y, int count) {
       this.x = x;
       this.y = y;
       this.count = count;
   }
}