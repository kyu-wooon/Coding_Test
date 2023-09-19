class Solution {
    public static long[] solution(long[] numbers) {

        long[] answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 4 != 3) {
                answer[i] = numbers[i] + 1;
                continue;
            }

            String bit = Long.toBinaryString(numbers[i]);
            if (!bit.contains("0")) { // 0이 없으면
                bit = 0 + bit;
                bit = String.valueOf(bit.charAt(1)) + bit.charAt(0) + bit.substring(2);
            }else{
                int x = bit.lastIndexOf("0");
                bit = bit.substring(0, x) + "10" + bit.substring(x + 2);
            }

            answer[i] = toBinary(bit);

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