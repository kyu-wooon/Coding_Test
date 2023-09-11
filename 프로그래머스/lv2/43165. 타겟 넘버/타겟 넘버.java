	class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(0, 0, numbers, target);
        
        return answer;
    }
    
    private void dfs(int sum, int idx, int[] numbers, int target) {
        if (idx == numbers.length && sum == target) {
            answer++;
            return;
        }
        
        else if (idx == numbers.length && sum > target) {
            return;
        }
        
        else if (idx == numbers.length && sum < target) {
            return;
        }
        
        dfs(sum + numbers[idx], idx + 1, numbers, target);
        dfs(sum - numbers[idx], idx + 1, numbers, target);
    }
}