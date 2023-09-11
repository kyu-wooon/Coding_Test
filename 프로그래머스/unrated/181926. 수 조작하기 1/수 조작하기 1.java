class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String[] str = control.split("");
        
        for(int i=0;i<str.length;i++){
            if(str[i].equals("w")){
                answer = answer+1;
            }
             else if(str[i].equals("s")){
                answer = answer-1;
            }
             else if(str[i].equals("d")){
                answer = answer+10;
            }
             else if (str[i].equals("a")){
                answer = answer-10;
            }
        }
        
        return answer;
    }
}