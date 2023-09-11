class Solution {
    public String solution(int n) {
        String answer = "";
        String subak = "수박";
        if(n%2 == 0){
            answer = subak.repeat(n/2);
        }else{
            answer = subak.repeat(n/2) + "수";
        }
        return answer;
    }
}