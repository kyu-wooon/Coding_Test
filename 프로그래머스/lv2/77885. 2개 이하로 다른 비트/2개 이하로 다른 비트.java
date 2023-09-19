class Solution {
    public static long[] solution(long[] numbers) {

        long[] answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            //짝수인 경우 
            if (numbers[i] % 2  == 0) {
                answer[i] = numbers[i] + 1;
                continue;
            }else{
                
            //홀수인 경우 
            String bit = Long.toBinaryString(numbers[i]);
            if (!bit.contains("0")) { // 0이 없으면
                //앞에 0을 붙인 후, 앞과 뒤의 순서를 바꾼다. 
               // System.out.println("0 없는 이전 bit : " + bit);
                bit = 0 + bit;
              //  System.out.println("중간 bit : " + bit);
                bit = String.valueOf(bit.charAt(1)) + bit.charAt(0) + bit.substring(2);
               // System.out.println("이후 bit : " + bit);
            }else{//0이 있으면 
               // System.out.println("0 있는 이전 bit : " + bit);
                int x = bit.lastIndexOf("0");//마지막으로 0이 있는 인덱스 
                //System.out.println("0 있는 이전 bit x : " + x);
               // System.out.println("bit substring : " + bit.substring(0,x));
                //처음부터 0이 있는 인덱스 전까지 잘라내기 +  10 + 0이 있는 인덱스 +2부터 끝까지 
                bit = bit.substring(0, x) + "10" + bit.substring(x + 2);
                // System.out.println("이후 bit : " + bit);
            }

            answer[i] = toBinary(bit);
                
            }


        }

        return answer;
    }

    private static long toBinary(String bit) {
        bit = new StringBuilder(bit).reverse().toString();
        long ans = 0;
        long x = 1L;
        for (int i = 0; i < bit.length(); i++) {
            if (bit.charAt(i) == '1') {
                ans += x;
            }
            x *= 2;
        }

        return ans;
    }

}