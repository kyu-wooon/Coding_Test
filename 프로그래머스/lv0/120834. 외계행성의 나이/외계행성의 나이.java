class Solution {
    public String solution(int age) {
        String answer = "";
        String answer_2 = String.valueOf(age);
        answer = answer_2.replace("0","a").replace("1","b").replace("2","c")
            .replace("3","d").replace("4","e").replace("5","f").replace("6","g").replace("7","h")
            .replace("8","i").replace("9","j");
        
        return answer;
    }
}