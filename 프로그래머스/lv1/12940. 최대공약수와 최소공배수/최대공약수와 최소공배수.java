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
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        


        answer[0] = GCD(n,m);
        answer[1] = lcm(n,m);
        
        return answer;
    }
}