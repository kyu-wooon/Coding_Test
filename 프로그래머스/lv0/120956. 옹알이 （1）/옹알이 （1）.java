


class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        int i;
        for (i=0;i<babbling.length;i++){
            if(babbling[i].matches("^(aya|ye|woo|ma)+$")
              ){
                answer=answer+1;
            }
        }
        return answer;
    }
}