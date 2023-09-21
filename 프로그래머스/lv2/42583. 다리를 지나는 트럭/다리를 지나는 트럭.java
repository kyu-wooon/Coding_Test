class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int count = 0;
        int once = 0; 
        
        while(count != truck_weights.length){
            int we = 0;
            //System.out.println("count : " + count);
            int len = 0; 
            
            while(we<=weight && count != truck_weights.length && len<= bridge_length ){
             
                we += truck_weights[count];
               // System.out.println("현재 트럭 무게" + truck_weights[count]);
                //System.out.println("남은 무게: " + we);
                if(we<=weight){
                    //answer += 1;
                    //System.out.println("트럭 무게 성공: " + truck_weights[count]);
                    count++;
                    len++;
                    /*
                    if(count == truck_weights.length){
                        answer += len * bridge_length;
                    }*/
                }else{
                   once++;
                    //System.out.println("트럭 무게 실패: " + truck_weights[count]);
                }
                
                
            }
            
            
           // System.out.println("한번에 이동하는 트럭 : " + len);
            int move = 0;
            move = bridge_length + len;
            
           // System.out.println("이동 시간 : " + move);
            answer += move;
            
        }
        //System.out.println("once : " + once);
        answer = answer - once;
        return answer;
    }
}