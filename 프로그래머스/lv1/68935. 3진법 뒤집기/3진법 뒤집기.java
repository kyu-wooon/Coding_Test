class Solution {
    public int solution(int n) {
        int answer = 0;
        String three = Integer.toString(n,3);
        StringBuilder sb = new StringBuilder(three);
        sb.reverse();
        three = sb.toString();
        answer = Integer.parseInt(three,3);
        return answer;
    }
}