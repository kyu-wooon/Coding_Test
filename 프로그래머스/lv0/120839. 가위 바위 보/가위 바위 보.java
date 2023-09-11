class Solution {
    public String solution(String rsp) {
        String answer = "";
        StringBuilder stringBuilder1 = new StringBuilder();
       
     
        for(int i =0 ; i < rsp.length(); i++){
            if(rsp.charAt(i) == '2' ){
              stringBuilder1.append('0');}
            else if(rsp.charAt(i) == '0'){
               stringBuilder1.append('5');}
            else if(rsp.charAt(i) == '5'){
                stringBuilder1.append('2');}
        
    }
       answer = stringBuilder1.toString();
        return answer;
}
}