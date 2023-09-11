import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        List<String> adds = new ArrayList<>();
        int count = 0;
        int[] tmp = new int[cards1.length + cards2.length];
        
        
        for(int i = 0 ; i<cards1.length;i++){
            if(Arrays.asList(goal).contains(cards1[i])){
                
                adds.add(cards1[i]);}
        }
                for(int j = 0 ; j<cards2.length;j++){
                    
        if(Arrays.asList(goal).contains(cards2[j])){
            adds.add(cards2[j]);}
        }
        
        
        for(int k = 0 ; k <goal.length; k++){
            for (int z = 0; z<adds.size(); z++){
                if(goal[k].equals(adds.get(z))){
                    tmp[z] = count;
                    count++;
                    
                }else{count++;}
                
                
                
            }
            
        }
        
       
        
        for(int p = 0; p<cards1.length-1 ; p++){
            if(tmp[p] > tmp[p+1] && tmp[p+1] !=0){
                answer = "No";
            }
        }
                for(int u = cards1.length; u<tmp.length-1; u++){
            if(tmp[u] > tmp[u+1] && tmp[u+1] !=0){
                answer = "No";
            }
        }
        
        System.out.println(Arrays.toString(tmp));
        
        return answer;
    }
}