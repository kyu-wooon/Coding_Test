class Solution {
    int gcd(int a, int b) { //최대공약수
    while(b!=0) {
      int r=a%b;
      a=b;
      b=r;
    }
    return a;
  }
    public int solution(int n) {
        int answer = 0;
        answer = n/gcd(6,n);
        return answer;
    }
}