class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String[] tmp = String.valueOf(n).split("");
        for (int i =0; i<tmp.length; i++){
            
            answer += Integer.parseInt(tmp[i]);
        }
        return answer;
    }
}