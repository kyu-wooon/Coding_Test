import java.util.*;
class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] map = new int[rows][columns];
        Set<Integer>set = new HashSet<>();
        
        
        
        int first = 1; 
        for(int i = 0; i<rows ; i++){
            for(int j = 0; j<columns; j++){
                map[i][j] = first;
                first++;
            }
        }
        //System.out.println(Arrays.deepToString(map));
        
        for(int i = 0; i<queries.length; i++){
            List<Integer> list = new ArrayList<>();
            int start_x = queries[i][1]-1; // 시작하는 열
            int end_x = queries[i][3]-1; // 끝나는 열 
            int start_y = queries[i][0]-1; // 시작하는 행 
            int end_y = queries[i][2]-1; // 끝나는 행 
            int tmp = 0;
            int index = 0; 
            int min = Integer.MAX_VALUE;
            
            
            //System.out.println()
            for(int j = start_x; j<end_x+1; j++){
                list.add(map[start_y][j]);
                
            }
            for(int j = start_y+1; j<end_y+1; j++){
                list.add(map[j][end_x]);
            }
            for(int j = end_x-1; start_x-1<j; j--){
                list.add(map[end_y][j]);
            }
            for(int j = end_y-1; start_y<j; j--){
                list.add(map[j][start_x]);
            }
            
            tmp = list.get(list.size() -1);
            list.remove(list.size() -1);
            list.add(0, tmp);
            
             
            
            for(int j = start_x; j<end_x+1; j++){
                map[start_y][j] = list.get(index);
                
                if(list.get(index)<min){
                    min = list.get(index);
                }index++;
            }
            for(int j = start_y+1; j<end_y+1; j++){
                map[j][end_x] = list.get(index);
                
                if(list.get(index)<min){
                    min = list.get(index);
                }index++; 
            }
            for(int j = end_x-1; start_x-1<j; j--){
                map[end_y][j] = list.get(index);
                
                if(list.get(index)<min){
                    min = list.get(index);
                }index++;
            }
            for(int j = end_y-1; start_y<j; j--){
                map[j][start_x] = list.get(index);
                
                if(list.get(index)<min){
                    min = list.get(index);
                }index++;
            }
            //System.out.println(list.toString());
            //System.out.println(min);
            answer[i] = min;

            }
        
       //System.out.println(Arrays.deepToString(map));
        
        return answer;
    }
}