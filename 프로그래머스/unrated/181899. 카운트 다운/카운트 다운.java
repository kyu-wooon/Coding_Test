class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start - end_num +1];
        int index = 0;
        for(int i = start; end_num-1<i; i--){
            answer[index] = i;
            index++;
            
        }
        return answer;
    }
}