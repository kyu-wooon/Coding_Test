class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        char[] phone_arr = phone_number.toCharArray();
        for(int i = 0 ; i < phone_arr.length-4 ; i++){
            phone_arr[i] = '*';
        }
        answer = new String(phone_arr);
        return answer;
    }
}