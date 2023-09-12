import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        for (; i < j; --j) {//가장 무거운 순서부터 하나씩 내림
            if (people[i] + people[j] <= limit)//2사람 합이 limit보다 적으면 
                i++;//가장 가벼운 순서에서 하나씩 올림 
        }
        return people.length - i;
    }
}
