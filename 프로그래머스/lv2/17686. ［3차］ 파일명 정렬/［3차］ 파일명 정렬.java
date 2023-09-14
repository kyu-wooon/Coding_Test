import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        
        String[][] data = new String[files.length][3];
        
        for(int i =0; i<files.length; i++){
            int startIdx = -1,endIdx = -1;
            for(int j = 0; j < files[i].length(); j++){
                if(files[i].charAt(j)>=48 && files[i].charAt(j) <=57){
                    startIdx = j;
                    break;
                }
            }
            for(int j = startIdx; j < files[i].length(); j++){
                if(!(files[i].charAt(j)>=48 && files[i].charAt(j) <=57)){
                    endIdx = j-1;
                    break;
                }
            }
            if(endIdx == -1) endIdx = files[i].length()-1;
            data[i][0] = files[i].substring(0,startIdx);
            data[i][1] = files[i].substring(startIdx,endIdx+1);
            data[i][2] = files[i].substring(endIdx+1,files[i].length());
            
            //System.out.println(Arrays.toString(data[i]));
        }
        Arrays.sort(data,(o1,o2)->{
            int com = o1[0].toUpperCase().compareTo(o2[0].toUpperCase());
            if(com == 0){
                return Integer.parseInt(o1[1])-Integer.parseInt(o2[1]);
            }
            else return com;
        });
        for(int i =0; i<files.length; i++){
            answer[i] = data[i][0]+data[i][1]+data[i][2];
        }
        return answer;
    }
}