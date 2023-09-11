import java.util.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {0,0};
        int danger_count = 0;
        
        //출발점 지정, 장애물 갯수 확인         
        for (int i = 0; i<park.length; i++){
            if( park[i].indexOf("S") != -1){
                answer[0] = i;
                answer[1] = park[i].indexOf("S");
            }
            for(int j=0;j<park[i].length();j++){
                if(park[i].charAt(j) == 'X'){
               danger_count++;
            }  } }
        //장애물 갯수 기반으로 이중배열 생성 
        int[][] danger = new int[danger_count][2];
         for(int k = 0; k<danger.length; k++){
        for (int i = 0; i<park.length; i++){
            for(int j=0;j<park[i].length();j++){
                    if(park[i].charAt(j) == 'X'){
                        danger[k][0] = i;
                        danger[k][1] = j;
                        k++;
            }}}}
        
        //System.out.println(Arrays.deepToString(danger));
        
        //루트에 따른 이동 시작 
        for(int i = 0; i< routes.length;i++){
            //이동하는 수 추출
            int going = Integer.parseInt(routes[i].replaceAll("[^0-9]",""));
            //이동하는 방향 추출
            char where = routes[i].charAt(0);
            //장애 발동 여부 판별 변수 
            boolean if_danger = false;
            //answer0 (세로이동) 저장 변수 
            int answer_0 = answer[0];
            //answer1 (가로이동) 저장 변수 
            int answer_1 = answer[1];
            //System.out.println("start : " + Arrays.toString(answer));
            //System.out.println("going: " + going);
           // System.out.println("where: " + where);
            
            if(where == 'E'){
                for(int j = 0; j<going ; j++){
                    for(int k = 0 ; k<danger.length; k++){
                        //오른쪽으로 한칸 더 이동하면 danger 존이거나, 공원 밖으로 나가면 
                        if((answer_1 == danger[k][1]-1 && answer[0] == danger[k][0]) || answer_1 ==park[0].length()-1){
                            //System.out.println("answer_1: " +  answer_1);
                            //System.out.println("장애 발생");
                            if_danger = true;
                            break;
                        }
                    }answer_1++;
                }
                if(if_danger == false){answer[1] = answer[1] + going;}
            }
            
            if(where == 'W'){
                for(int j = 0; j<going ; j++){
                    for(int k = 0 ; k<danger.length; k++){
                        //왼쪽으로 한칸 더 이동하면 danger 존이거나, 공원 밖으로 나가면 
                        if((answer_1 == danger[k][1]+1 && answer[0] == danger[k][0]) || answer_1 ==0){
                           // System.out.println("answer_1: " +  answer_1);
                            //System.out.println("장애 발생");
                            if_danger = true;
                            break;
                        }
                    }answer_1--;
                }
                if(if_danger == false){answer[1] = answer[1] - going;}
            }
            
        
        
                    if(where == 'N'){
                for(int j = 0; j<going ; j++){
                    for(int k = 0 ; k<danger.length; k++){
                        //위쪽으로 한칸 더 이동하면 danger 존이거나, 공원 밖으로 나가면 
                        if((answer[1] == danger[k][1] && answer_0 == danger[k][0]+1) || answer_0 ==0){
                            //System.out.println("answer_0: " +  answer_0);
                            //System.out.println("장애 발생");
                            if_danger = true;
                            break;
                        }
                    }answer_0--;
                }
                if(if_danger == false){answer[0] = answer[0] - going;}
            }

                    if(where == 'S'){
                for(int j = 0; j<going ; j++){
                    for(int k = 0 ; k<danger.length; k++){
                        //아래쪽으로 한칸 더 이동하면 danger 존이거나, 공원 밖으로 나가면 
                        if((answer[1] == danger[k][1] && answer_0 == danger[k][0]-1) || answer_0 ==park.length-1){
                            //System.out.println("answer_0: " +  answer_0);
                            //System.out.println("장애 발생");
                            if_danger = true;
                            break;
                        }
                    }answer_0++;
                }
                if(if_danger == false){answer[0] = answer[0] + going;}
            }
            
        }
        
        
        
        
        return answer;
    }
}