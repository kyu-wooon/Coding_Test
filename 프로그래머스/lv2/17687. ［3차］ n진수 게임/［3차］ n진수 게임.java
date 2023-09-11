class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String all = ""; //모든 순서를 포함한 문자열
        int count = 0; // 모든 순서를 포함한 문자열을 넣을 때 담을 index
        int all_count = 0; // 튜브 순서만 포함한 문자열을 넣을 때 담을 index
        int answer_count = 0; // 튜브가 구할 숫자의 갯수 count
        
        //모든 순서를 포함한 문자열 생성 
        while(all.length() < t*m){

                all += Integer.toString(count, n).toUpperCase();
            
            count ++;
        }
        //튜브 순서만 담는 문자열 생성
        while(answer_count != t){//갯수가 t가 될 때까지 
                if(all_count%m == (p-1)){
                answer+= String.valueOf(all.charAt(all_count)).toUpperCase();//answer에 현재 index의 문자 추가
                all_count ++; //인덱스 증가
                answer_count++;//미리 구한 숫자의 갯수 증가 
            }else{
                all_count++;//인덱스만 증가
            }
        }
    
        return answer;
    }
}