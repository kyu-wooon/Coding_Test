class Solution {
    public int solution(int n) {
        int answer = 0;
        int maxnum = n/2;
        long count1 = 1;
        long count2 = 2;
        
        if(n == 1){
            return (int)count1;
        }else if(n ==2){
            return (int)count2;
        }
        
        for(int i = 0 ; i<n-2; i++){
            long tmp = count1%1000000007;
            count1 = count2%1000000007;
            count2 = (count1+tmp)%1000000007;
        }
        answer = (int)(count2%1000000007); 
        
        return answer;
        
                         
    }
}