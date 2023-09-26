class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {0,0};
        int min_start = 0; 
        int min_len = 1000000000;;
        int min_end = 0;
        int last_add = 0;
        int last_index = 0; 
        
        for(int i = 0; i<sequence.length; i++){
            int add = 0;
            int index = i;
            int start = 0;
            int end = 0; 
            int len = 0;
            //System.out.println("시작 값 : " + sequence[index]);
            if(0<i){add += last_add-sequence[i-1];}
            index = last_index; 
            while(add != k && add<k && index != sequence.length){
                add += sequence[index];
            //System.out.println("add : " + add );
                index++;
            }
            if(add == k){
                start = i;
                end = index-1;
                len = end - start +1 ;
                //System.out.println("start : " + start + ", end :" + end + ", len : " + len);
                if(len<min_len){
               // System.out.println("최소값 갱신 ");    
                min_start = start;
                min_end = end;
                min_len = len;
                    if(min_len == 0){
                        answer[0] = min_start;
                        answer[1] = min_end;
                        return answer;
                    }
                }

            }
            last_add = add; 
            last_index = index;
        }
        
        //System.out.println(min_start +", "+ min_end );
        answer[0] = min_start;
        answer[1] = min_end;
        return answer;
    }
}