import java.util.*;
class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        
        Arrays.sort(data, (o1, o2) -> {
            if(o1[col-1] == o2[col-1]){
                return o2[0]-o1[0];
            }return o1[col-1]-o2[col-1];  
        });    
        
        for(int i  = row_begin-1; i<row_end; i++){
            int tmp = 0;
           // System.out.println("i : " + i);
            for(int j = 0; j<data[i].length; j++){
                //System.out.println("data[i][j] % i : " + data[i][j] % (i+1));
                tmp += data[i][j] % (i+1);
            }
            list.add(tmp);
        }
        //System.out.println(Arrays.deepToString(data));
        //System.out.println(list.toString());
        answer = list.get(0); 
        for(int i = 1 ; i<list.size(); i++){
            answer = answer ^ list.get(i);
        }
        
        return answer;
    }
}