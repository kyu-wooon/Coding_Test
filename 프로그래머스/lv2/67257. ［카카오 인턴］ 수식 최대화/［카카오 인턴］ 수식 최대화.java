import java.util.*;
class Solution {
    String[] pri = {"*+-","*-+","+-*","+*-","-*+","-+*"}; // 연산자 우선순위
    public long solution(String exp) {
        List<Long> nums = new ArrayList<>();
        List<Character> ops = new ArrayList<>();

        for(int i = 0; i < exp.length(); ){ // String exp를 long , char로
            int j = i;
            while(j < exp.length() && Character.isDigit(exp.charAt(j))) j ++; //숫자면 계속 j 더함 
            //끝이 오거나, 기호가 나타남으로써 while문 벗어남 
            if(j != exp.length()) ops.add(exp.charAt(j));  // 현 위치가 마지막이 아니라면, 연산기호 리스트에 추가  
            nums.add(Long.valueOf(exp.substring(i,j)));// 시작 인덱스부터 숫자가 나온 부분까지 숫자 리스트에 추가 
            i = j + 1; // 시작지점 j 인덱스 다음으로 변경 
        }
        
        //System.out.println(nums.toString());
       // System.out.println("연산자 모음:" + ops.toString());
        
        
        long max = 0;
        for(String p : pri){ //연산자 우선순위별로 iter
            List<Long>numsC = new ArrayList<>(nums);
            List<Character>opsC = new ArrayList<>(ops);
            //System.out.println("우선순위 : " + Arrays.toString(p.toCharArray()));
            for(char c : p.toCharArray()){
                for(int i = 0; i < opsC.size();){
                    char op = opsC.get(i);
                    if(op != c) {i++; continue;}
                    if(op == '*') {numsC.set(i, numsC.get(i) * numsC.get(i + 1));}    
                    else if(op == '-'){numsC.set(i, numsC.get(i) - numsC.get(i + 1));}
                    else if(op == '+'){numsC.set(i, numsC.get(i) + numsC.get(i + 1));}
                    numsC.remove(i + 1);//연산된 우측 숫자 삭제
                    opsC.remove(i);//사용된 연산자 삭제 
                }//System.out.println("------------");
            } 

            max = Math.max(max, Math.abs(numsC.get(0))); // 최종 값을 max
        }

        return max;
    }
}