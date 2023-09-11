class Solution {
    public int[] solution(String myString) {
        int[] answer;
        String myX[] = myString.split("x");
        if (myString.endsWith("x")){answer = new int[myX.length+1];}
        else{answer = new int[myX.length];}
        
        
        
        for(int i = 0 ; i < myX.length; i++){
            answer[i] = myX[i].length();
        }
        
        return answer;
    }
}