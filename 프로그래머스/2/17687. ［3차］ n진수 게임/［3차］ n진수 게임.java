import java.util.*;
class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        List<String> list  = new ArrayList<>();
        for(int i = 0; i< m*t+1 ; i++){
            String s =  Integer.toString(i,n);
            for(int j = 0; j< s.length(); j++){
                if(list.size() < m*t){
                    list.add(String.valueOf(s.charAt(j)).toUpperCase());
                }else{break;}
            }
        }
        
        for(int i = p-1; i<list.size(); i=i+m){
            answer+= list.get(i);
        }
        return answer;
    }
}