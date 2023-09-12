class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1 ; i<n+1 ; i++){
            int add = i; 
            int count = 0;
             //System.out.println("i의 값 : " + i);
            if(i == n){
                answer++;
                break;
            }
            for(int j = i+1 ; j<n+1; j++){
                 //System.out.println("j의 값 : " + j);
                add +=j;
                count ++;
                
                if(add == n){
                   // System.out.println("정답 +1");
                    //System.out.println("숫자 갯수 : "+ count);
                    answer ++;
                    break;
                }else if(n<add){
                   // System.out.println("정답 실패");
                    break;
                }
                
                
            }
            
            
        }
        
        
        return answer;
    }
}