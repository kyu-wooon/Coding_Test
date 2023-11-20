import java.util.*;
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        List<String> list = new ArrayList<>();
        String change = Integer.toString(n,k);
        
        String[] arr = change.split("0");
       //System.out.println(Arrays.toString(arr));
        for(String s : arr){
            s = s.replaceAll(" ", "");
            if(s.equals("") != true){
                list.add(s);
            }
            
        }

        for(int i = 0; i<list.size(); i++){
            
            long arrLong = Long.parseLong(list.get(i));
             
            if(arrLong==1){
                answer += 0;
            }else{answer += isPrime(arrLong);}
             
           
            
        }
        
        return answer;
    }
    
    public long isPrime(long arrLong){
        	for (long i = 2; i<(long)Math.sqrt(arrLong)+1; i++) {
                
            if (arrLong % i == 0) {
                    return 0;
                 }
	        }
        
	return 1;
        
    }
}