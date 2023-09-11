class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] tmp = s.toCharArray();
        
        for(int i = 0 ; i<tmp.length ; i++){
            if(tmp[i] == ' '){
                answer += tmp[i];
            }
                        
            else{ 
                char c = tmp[i];
                c = (char)(c+n);
                if(tmp[i]<=90 &&91<=(int)c){
                   char d = (char)('A'-1);
                   d = (char)(d+(c-90));
                   answer += String.valueOf(d);}
                else if(96<tmp[i] && 123<=(int)c){
                   char e = (char)('a'-1);
                   e = (char)(e+(c-122));
                   answer += String.valueOf(e);
                
                
                }else{
                    
                    answer += String.valueOf(c);}
                
               }
           
            
            
        }
        
        
        
        return answer;
    }
}