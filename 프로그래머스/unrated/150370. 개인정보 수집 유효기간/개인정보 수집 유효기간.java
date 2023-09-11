import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        List<Integer>answer_list = new ArrayList<>();
        
        String[] today_arr = today.split("\\.");
        
        //System.out.println(Arrays.toString(today_arr));
        
        for(int i = 0; i<privacies.length; i++){
            
            String p_year ="";
            String p_month = "";
            String p_day = "";
            
            for(int j = 0; j <4; j++){
                p_year += privacies[i].charAt(j);
            }
            for(int j = 5; j <7; j++){
                p_month += privacies[i].charAt(j);
            }
            for(int j = 8; j <10; j++){
                p_day += privacies[i].charAt(j);
                
            }
            
            
            int p_year_Int = (Integer.parseInt(today_arr[0]) - Integer.parseInt(p_year))*336;
            int p_month_Int = (Integer.parseInt(today_arr[1]) - Integer.parseInt(p_month))*28;
            int p_day_Int = Integer.parseInt(today_arr[2]) - Integer.parseInt(p_day);
           
            p_day_Int = p_day_Int+p_year_Int+p_month_Int;
             
            //System.out.println(p_day_Int);
            
            String type = String.valueOf(privacies[i].charAt(11));
            
            
            for(int k = 0; k <terms.length; k++){
                if(terms[k].contains(type)){
                    int exp = Integer.parseInt(terms[k].replaceAll("[^0-9]",""));
                    if(exp*28<=p_day_Int){
                answer_list.add(i+1);
            }
                }
            }
            
            
            
        }
        
        int[] answer = answer_list.stream()
                .mapToInt(i -> i)
                .toArray();
        
        return answer;
    }
}