import java.util.*;
class Solution {
    public int[] solution(int n) {
        int len = 0;
        for(int i = n; 0<i; i--){
            len += i;
        }
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[len];
        int[][] tri = new int [n][n];
        int init = 0;
        int count = n/2;
        int max = n;
        int last = 0;
        int[] rot = {0,0,0};
        
        
        while(rot[2] != len){
            
            for(int i = rot[0]; i<n; i++){                
                if(tri[i][rot[1]] == 0){
                    tri[i][rot[1]] = rot[2]+1;
                    rot[0] = i;
                    rot[2]++;
                    
                }
            }

            
            for(int i = rot[1]; i<n; i++){
                
                if(tri[rot[0]][i] == 0){
                    tri[rot[0]][i] = rot[2]+1;
                    rot[2]++;
                    rot[1]++;

                }
                if(rot[1] < n-1){
                    if(tri[rot[0]][rot[1]+1] != 0){break;}
                }
            }
            
            for(int i = rot[0]; 1<i ; i--){
                if(tri[rot[0]-1][rot[1]-1] == 0){
                    tri[rot[0]-1][rot[1]-1] = rot[2]+1;
                    rot[0]--;
                    rot[1]--;
                    rot[2]++;
                }
            }

            count++;
           
            
        }
        
        //System.out.println(Arrays.deepToString(tri));
        
                for(int i = 0; i<n; i++){
            for(int j = 0; j <n; j++){
                if(tri[i][j] != 0){
                    list.add(tri[i][j]);
                }
            }
        }

       
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

  
        return answer;
    }
}