class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double answer2;
        answer2 = (double) num1/num2;
        answer2 =  answer2 * 1000;
        answer = (int) answer2;
        return answer;
    }
}