class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        int no_count = 0;
        
       if( (a%2 == 0 && b-a == 1) || (b%2 == 0&& a-b ==1)){
            //System.out.println("no_count = 1" );
            no_count = 1;
        }else{no_count = 0;}
       
    while( Math.abs(a-b) !=1 ||(Math.abs(a-b) ==1 && no_count==1)){
        
         //System.out.println("a :" + a + ", b :"+b +", count : " + answer );

        
        if(a%2 == 0){
                a = a/2;
            }else{a = a-a/2;}
            
            if(b%2 == 0){
            b = b/2;
            }else{b = b-b/2;}
        
        
        
        if( (a %2 == 0 && b-a == 1) || (b%2 == 0&& a-b ==1)){
            //System.out.println("no_count = 1" );
            no_count = 1;
        }else{no_count = 0;}
        
       answer = answer+1;
        
        
    }
            
        
        
        

   
        

        return answer;
    }
}