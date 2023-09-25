import java.util.*;
class Solution {
    static String Numbers;
    static int[] cb, ch;
    static int add = 0;
    static Set<Integer> set = new HashSet<>();
    static int answer = 0;
    
public static int prime(int n){
    if(n == 1 || n==0){
        return 0;
    }
    for (int i = 2; i<=(int)Math.sqrt(n); i++) {
      if (n % i == 0) {
          return 0;
      }
	}
	return 1;   
    }
    
    
    public static void DFS(int L, int s, int end) {
        
        if (L == end) {
            
            String str = "";
            for (int x : cb){//System.out.print(x);
            str += String.valueOf(x);
            
            }
            set.add(Integer.parseInt(str));
            /*int check = Integer.parseInt(str);
            System.out.println(str);
            if(prime(check) == 0){
                System.out.println("소수아님");
            }else{System.out.println("소수임");}
            add += prime(check);  */
            

            //System.out.println();
            return;
        }
        for (int i = 0; i < Numbers.length(); i++) {
            if (ch[i] == 0) {
                ch[i]=1;
                cb[L]=Numbers.charAt(i)-'0';
                DFS(L+1, i+1, end);
                ch[i]=0;
            }
        }
    }

    public static int solution(String numbers) {
        int other = 0; 
        Numbers = numbers;
        ch = new int[Numbers.length()];
        for (int i = 0; i < Numbers.length(); i++) {
            cb = new int[i+1];
            DFS(0, 0, i+1);
            
        }
        
        for(int x : set){
            //System.out.println(x);
            //System.out.println("소수 여부 : " + prime(x));
            if(prime(x) == 1){
                answer++; 
               
            }
        }
        
        return answer;
    }


}