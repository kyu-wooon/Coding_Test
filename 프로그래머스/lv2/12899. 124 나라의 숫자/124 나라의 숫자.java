class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder(); // answer를 sb로 변환 

        while (n > 0) {
            int num = n%3; //n을 우선 3으로 나눈 나머지를 구한다 
            
            if (num == 0) {//3으로 나누어 떨어질경우 
                answer.insert(0, "4"); //앞자리에 4 삽입 
                n = n/3 - 1; //124나라에는 0이 없기때문에 -1을 해주어야한다 
            }
            else {
                answer.insert(0, Integer.toString(num)); //나누어떨어지지 않을 경우 나머지 그대로 삽입 
                n = n/3;
            }

        }

        return answer.toString();
    }
}