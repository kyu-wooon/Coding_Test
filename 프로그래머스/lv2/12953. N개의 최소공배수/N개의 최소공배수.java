class Solution {
    
    	int GCD(int a, int b) { //최대공약수 - 재귀함수 사용
		if(a%b ==0) {
			return b;
		}
		return GCD(b, a%b);
	}
    
    int lcm(int a, int b) { //최소공배수
		//L=A*B/G
		//0이 아닌 두 수의 곱 / 두 수의 최대 공약수
		return a*b / GCD(a,b);
	}
    
    
    public int solution(int[] arr) {
        int answer = 0;
        answer = lcm(arr[0], arr[1]); 
        for(int i = 2; i<arr.length; i++){
            answer = lcm(answer, arr[i]);
        }
 
        
        return answer;
    }
}