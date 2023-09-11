import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        List<Integer> testList = new ArrayList<>();
        
        int n_tmp = n;
        for(int i = 0; i<n-1; i++){
            if(n_tmp != 1){
                if(n_tmp%2==0){
                    testList.add(n_tmp);
                    n_tmp = n_tmp/2;
                }else  if(n_tmp%2!=0){
                    testList.add(n_tmp);
                    n_tmp = 3 * n_tmp + 1;
                }
                
            }else if (n_tmp == 1){
                testList.add(n_tmp);
                break;
            }
        }
        return testList.stream().mapToInt(i -> i).toArray();
    }
}