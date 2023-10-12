import java.util.*;
class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        Set<Integer> a_set = new HashSet<>();
        Set<Integer> b_set = new HashSet<>();
        List<Integer> a_list = new ArrayList<>();
        List<Integer> b_list = new ArrayList<>();
        int a = 0;
        int b = 0; 
        
        if(arrayA.length == 1){
            a = arrayA[0];
            a_set.add(a);
            b = arrayB[0];
            b_set.add(b);
        }else{
         for(int i = 0; i<arrayA.length-1; i++){
            a = GCD(arrayA[i],arrayA[i+1]);
            b = GCD(arrayB[i],arrayB[i+1]);
            a_set.add(a);
            b_set.add(b);
        }  
        }
        
        for(int i : a_set){
            a_list.add(i);
        }
        for(int i : b_set){
            b_list.add(i);
        }

        //System.out.println("a : " + a + ", b : " + b);
        if(a_set.size() != 1){
            a = 1;
        }
        if(b_set.size() != 1){
            b = 1;
        }
        //System.out.println("a : " + a + ", b : " + b);
        if(a == 1 &&  b == 1){
            answer = 0;
            return answer;
        }
        
        // System.out.println("a : " + a + ", b : " + b);
        for(int i = 0; i<arrayA.length-1; i++){
            if(arrayA[i]%b == 0){
               // System.out.println("b - 실패");
                b = -1;
                break;
            } 
        }
        
         for(int i = 0; i<arrayB.length-1; i++){
            if(arrayB[i]%a == 0){
                //System.out.println("a - 실패");
                a = -1; 
                break;
            } 
        }
        
        if(a == -1 &&  b == -1){
            answer = 0;
            return answer;
        }
        
        System.out.println("a : " + a + ", b : " + b);
        answer = Math.max(a, b);

        return answer;
    }
    
    public int GCD(int a, int b){
        if(a%b == 0){
            return b;
        }
        return GCD(b, a%b);
    }
}