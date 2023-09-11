class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int i = 1;
        int i_tmp = 1;
        boolean p = true;
        if(n == 1){
            answer = 1;
            return answer;
        }
        while(p){
        for(int j = i_tmp; j>1 ; j--){

            i = i * j;
            
        }
        if (i > n){

            answer = i_tmp;
            
            break;

        }else{

            i_tmp = i_tmp+1;
            i = i_tmp;}}

        return answer;
    }
}