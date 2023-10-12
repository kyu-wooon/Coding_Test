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
        
        //오름차순 정렬 
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        
        // 각 배열에서 가장 작은 수의 최대공약수 구해서 set에 넣기 
        //둘 배열 수가 한개인 경우
        if(arrayA.length == 1){
            a = arrayA[0];
            a_list.add(a);
            b = arrayB[0];
            b_list.add(b);
        }else{//아닌 경우 
            a = arrayA[0];
            b = arrayB[0];
            
         for(int i = 1; i<a+1; i++){
             if(a%i == 0){
                 a_list.add(i);
             }
         }  
        for(int i = 1; i<b+1 ; i++){
             if(b%i == 0){
                 b_list.add(i);
             }
         }      
            
        }
        

        
        //list 값 중에서 자신의 배열과 나누어지지 않는 원소가 있다면 삭제 
        for(int i = 0; i<a_list.size(); i++){
            for(int j = 0; j<arrayA.length; j++){
                if(arrayA[j]%a_list.get(i) != 0){
                    a_list.set(i, -1);
                }
            }
        }
        
        for(int i = 0; i<b_list.size(); i++){
            for(int j = 0; j<arrayB.length; j++){
                if(arrayB[j]%b_list.get(i) != 0){
                    b_list.set(i, -1);
                }
            }
        }
        
        while(a_list.remove(Integer.valueOf(-1))){};
        while(b_list.remove(Integer.valueOf(-1))){};

        //list 내림차순으로 정렬 
        Collections.sort(a_list, Collections.reverseOrder());
        Collections.sort(b_list, Collections.reverseOrder());

        if(a == 1 &&  b == 1){
            answer = 0;
            return answer;
        }
        //System.out.println("a:" + a_list.toString());
        //System.out.println("b"+b_list.toString());
        // System.out.println("a : " + a + ", b : " + b);
        for(int j = 0 ; j<b_list.size(); j++){
            for(int i = 0; i<arrayA.length; i++){
                b = b_list.get(j);
               // System.out.println("arrayA[i] : " + arrayA[i] + ", b_list.get(j) : " + b_list.get(j)) ;
            if(arrayA[i]%b_list.get(j) == 0 && arrayA[i]>b_list.get(j)){
               // System.out.println("b - 실패");
                b = -1;
                break;
            } 
        }if(b != -1){
                break;
            }
        }

        
        for(int j = 0 ; j<a_list.size(); j++){
            for(int i = 0; i<arrayB.length; i++){
                a = a_list.get(j);
          //  System.out.println("arrayB[i] : " + arrayB[i] + ", a_list.get(j) : " + a_list.get(j))   ;
            if(arrayB[i]%a_list.get(j) == 0 && arrayB[i] > a_list.get(j)){
              System.out.println("a - 실패");
                a = -1;
                break;
            } 
        }if(a != -1){
                break;
            }
        }
      // System.out.println("a : " + a + ", b : " + b);
        if(a == -1 &&  b == -1){
            answer = 0;
            return answer;
        }
        
        
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