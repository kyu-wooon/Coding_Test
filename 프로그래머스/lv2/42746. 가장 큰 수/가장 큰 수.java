import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        boolean except = true;
        String[] num = new String[numbers.length];
        
        
        //String배열로 변환 
        for(int i = 0; i < num.length; i++){
            num[i] = String.valueOf(numbers[i]);        
            if(numbers[i] != 0) except = false;
        }
        /*
        Arrays.sort(num, new Comparator<String>(){
           @Override
            public int compare(String n1, String n2) {
                return (n2+n1).compareTo(n1+n2);
            }
        });*/
        
        Arrays.sort(num, (o1, o2) ->{
            String s1 = o2+o1;
            String s2 = o1+o2;
            int com = s1.compareTo(s2); {
                return com;
            }
        });
        
        
        for(int i = 0; i < num.length; i++)
            answer += num[i];
        if(except) answer = "0";
        return answer;
    }
}