import java.util.*;
class Solution {
    public int[] solution(String msg) {
 
        List<Integer> answer_list = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder(msg);
        int num = 65;
        int k = 27;

        for(int i = 1; i<27 ; i++){

            map.put(i, String.valueOf((char)num));
            num++;

        }

        while(sb.length() != 0){
            boolean count = false; //사전에 있는지 없는지 카운팅
            int index = 0; //인덱스
            StringBuilder s_o = new StringBuilder(); //사전에 포함되어있는 문자열
            s_o.append(String.valueOf(sb.charAt(index)));
            String s_x = ""; //사전에 포함되어있지않는 문자열
            int findKey  = 0; // 사전 키값


            while(count != true || index != sb.length() ){ //카운트가 true가 되거나, index가 끝까지 가면 멈춤

                /*
                if(sb.length() == 1){
                    break;
                }*/






                if(map.containsValue(s_o.toString())){ //map value중에 s_o가 있을 경우
                    //System.out.println("s_o: " +s_o.toString() );

                    if(s_o.toString().equals(sb.toString())){
                        //System.out.println("break index: " + index );
                        //System.out.println("break s_o len: " + s_o );
                       // System.out.println("break s_o : " + s_o.toString() );
                       // System.out.println("break sb : " + sb.toString() );
                       // System.out.println("break");
                        break;
                    }

                    index++;//인덱스 증가
                    s_o.append(String.valueOf(sb.charAt(index)));//s_o에 문자 추가


                   // System.out.println("index: " + index );


                    /*
                    if(index ==sb.length()-1 && index-1<s_o.length()){
                        break;
                    }*/



                }else{//포함하고 있지 않을 경우

                    count = true; //count  true

                    s_x += s_o.toString(); // s_x에 s_o문자열 추가
                    //System.out.println("s_x: " + s_x );
                    if(1<s_o.length()){
                        s_o.deleteCharAt(index);// 이전에 s_o에서 추가한 문자 삭제
                    }

                    break;

                }



            }

            //System.out.println(map.toString());
            //System.out.println("s_o: " +s_o.toString() );
            //System.out.println("s_x: " + s_x );


            for(Integer key : map.keySet()) {
                //System.out.println("key : "+ key);
                //System.out.println("value : "+ map.get(key));

                // 키와 매핑된 값이랑 equals() 메서드에 전달된 값이랑 일치하면 반복문을 종료합니다.
                if(map.get(key).equals(s_o.toString())) { // 키가 null이면 NullPointerException 예외 발생
                    findKey = key;
                   // System.out.println("일치!");
                    //System.out.println("key : "+ key);
                   // System.out.println("value : " + s_o.toString());
                    answer_list.add(findKey);
                    break;
                }
            }
            //System.out.println(answer_list.toString());


            map.put(k, s_x);
            k++;
            //System.out.println("s_o 길이 : " + s_o.length() );
            if(s_o.length() == 1){
                sb.deleteCharAt(0);
            }else{
                sb.delete(0, s_o.length());
            }
            s_o.setLength(0);
            s_x = "";
            //System.out.println("sb: " + sb.toString() );
            //System.out.println("----------------");

            //


            if(sb.length() == 0){
                break;
            }


        }
        //System.out.println(map.toString());

        int[] answer = new int[answer_list.size()];
        for(int i = 0; i<answer_list.size(); i++){
            answer[i] = answer_list.get(i);
        }
        
        return answer;
        
}}