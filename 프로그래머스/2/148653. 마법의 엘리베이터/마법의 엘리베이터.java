//그리디 문제 
//1. 기준 정하기, 5보다 큰지 작은지 같은지 나누면 된다.
//2. 해당 숫자가 5라면, 앞자리가 5보다 같거나 큰지 아니면 작은지 나누면 된다.

class Solution {
    public int solution(int storey) {
        int answer = 0;
        
        while(storey > 0) {
            int num = storey % 10; //storey에서 10을 나눈 나머지 
            storey /= 10; //storey에서 10을 나눔
            
            if (num > 5) { //나머지가 5보다 크다면 
                answer += 10 - num; // 정답에 10번 - num 값을 더한다 (눌러서 10이되는 만큼)
                storey++; // 층수를 1 올린다(10층 올라간거랑 같음)
                
            } else if (num < 5) { //나머지가 5보다 작다면
                answer += num; //정답에 num값을 더한다 (빼서 0이 되는 만큼)
                
            } else if (storey % 10 >= 5) { //나머지가 5보다 같거나 크다면 
                answer += 5; //정답에 5를 더한다 
                storey++;//층수를 1 올린다(10층 올라간거랑 같음)
            } else {
                
                answer += 5;
            }
        } 
        
        return answer;
    }
}