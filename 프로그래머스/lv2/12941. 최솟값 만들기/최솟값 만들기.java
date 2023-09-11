import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int[] B_integer = new int[B.length];
        //Integer[] B_integer = Arrays.stream(B).boxed().toArray(Integer[]::new);
        Arrays.sort(A);
        Arrays.sort(B);
        //Arrays.sort(B_integer, Collections.reverseOrder());
       
        for(int i =0, k=B.length-1; i<B.length; i++, k--){
          
                  B_integer[i] = B[k];
                        
              
            
        }
        
        //System.out.println(Arrays.toString(B_integer));
        
        for(int i =0; i<A.length; i++){
            answer += A[i] * B_integer[i];
            //answer += A[i] * B[i];
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        //System.out.println("Hello Java");

        return answer;
    }
}