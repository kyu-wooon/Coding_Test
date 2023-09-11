import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        List<Integer>lost_list = new ArrayList<>();
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        
        for(int i = 0 ; i<lost.length;i++){
            lost_list.add(lost[i]);
        }
        
        
        
        for(int i = 0; i<reserve.length; i++){
            for(int j = 0; j<lost.length; j++){
                if(reserve[i] == lost[j]){
                    reserve[i] = 99;
                    lost_list.remove(Integer.valueOf(lost[j]));
                    //System.out.println(Arrays.toString(reserve) + lost[j]);
                    answer++;
                }
            }
        }
        
        
        
            
        for(int j = 0; j<lost_list.size(); j++){
            
            
            
            for(int i=0; i<reserve.length; i++){
                
   
                
                
                if(reserve[i]+1 == lost_list.get(j)){
                    reserve[i] = 99;
                    answer++;
                    //System.out.println(Arrays.toString(reserve) + lost_list.get(j));
                    
                    break;
                    
                }
                
                else if(reserve[i]-1 == lost_list.get(j)){
                    reserve[i] = 99;
                    answer++;
                    //System.out.println(Arrays.toString(reserve)+ lost[j]);
                    break;
                }
            }
            
        }
        
        
        //System.out.println(Arrays.toString(reserve));
        return answer;
    }
}