import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 1; i<s.length()+1; i++){
            int count = i;
            int stop = 0; 
            String tmp = "";
            List<String> list = new ArrayList<>();

            for(int j = 0; j<s.length(); j = j+i){
                tmp = "";
                for(int n = j; n<j+count; n++){
                    if(s.length()<=n){stop = 1;break;}           
                    tmp += s.charAt(n);
                }
                list.add(tmp);
            }
            
            tmp = "";
            //System.out.println(list.toString());
            int imsi_count = 1;
                for(int k =0; k<list.size(); k++){
             
                    if(list.size() == 1){
                        tmp = list.get(0);
                    }
                    if(0<k){
                        if(list.get(k).equals(list.get(k-1))){
                            imsi_count++;
                            if(k == list.size() -1){
                            if(1<imsi_count){
                                tmp += (String.valueOf(imsi_count)+list.get(k-1));
                                imsi_count = 1;
                            }else{
                                tmp += list.get(k-1);
                                imsi_count = 1;
                            }
                            }
                        }else{
                            if(1<imsi_count){
                                tmp += (String.valueOf(imsi_count)+list.get(k-1));
                                imsi_count = 1;
                                if(k == list.size()-1){
                                    tmp += list.get(k);
                                    imsi_count = 1;
                                }
                            }else{
                                tmp += list.get(k-1);
                                imsi_count = 1;
                                
                                if(k == list.size()-1){
                                    tmp += list.get(k);
                                    imsi_count = 1;
                                }
                            }
                        }}}
            
            
            //System.out.println(tmp);
                min = Math.min(min, tmp.length());
        }
        answer = min;
        return answer;
    }
}