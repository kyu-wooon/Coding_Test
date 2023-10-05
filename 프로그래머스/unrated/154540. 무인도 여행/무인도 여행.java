import java.util.*;

class Solution {

    public List<Integer> ansList;

    public int[] solution(String[] inputMap) {
        //return type is int[]
        ansList = new ArrayList<>();

        int[][] map = new int[inputMap.length][inputMap[0].length()];

        for(int i=0; i<inputMap.length; i++){
            String elem = inputMap[i];
            for(int j=0; j<elem.length(); j++){
                String target = elem.substring(j,j+1);
                if(target.equals("X")){
                    map[i][j] = -1;
                }
                else map[i][j] = Integer.parseInt( target );
            }
        }

        boolean[][] visited = new boolean[map.length][map[0].length];

        //
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[0].length; j++){
                if(map[i][j] != -1 && visited[i][j] == false){
                    // 정답 리스트에 0을 추가한다.
                    ansList.add(0);

                    // dfs 돌린다.
                    dfs(visited, i, j, map);
                }
            }
        }


        if(ansList.isEmpty()) return new int[]{-1};
        else {
            Collections.sort(ansList);
            int[] ans = new int[ansList.size()];
            for(int i=0; i<ans.length; i++){
                ans[i] = ansList.get(i);
            }
            return ans;
        }
    }//main

    public void dfs(boolean[][] visited, int row, int col, int[][] map){
        // 범위 벗어나면 아웃
        if(
            row < 0 || row > map.length-1 || col < 0 || col > map[0].length-1
        ) return;
        // -1이면 아웃
        if (map[row][col]==-1) return;
        // 이미 방문했으면 아웃
        if(visited[row][col]) return;

        // 방문 체크
        visited[row][col] = true;

        // 리스트의 마지막 요소에 현 요소를 누적
        int val = ansList.get(ansList.size()-1);
        val += map[row][col];
        ansList.set(ansList.size()-1, val);

        // 동서남북 호출
        dfs(visited, row, col+1, map);
        dfs(visited, row, col-1, map);
        dfs(visited, row+1, col, map);
        dfs(visited, row-1, col, map);
    }//func

}//main class
