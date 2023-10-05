class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        m = m.replace("C#","c").replace("D#","d").replace("F#","f").replace("G#","g").replace("A#","a");
        for(int i = 0 ; i<musicinfos.length ; i++){
            String[] music = musicinfos[i].split(",");   
            String[] first = music[1].split(":");
            String[] second = music[0].split(":");
            int time = (Integer.parseInt(first[0]) * 60 + Integer.parseInt(first[1])) -
                (Integer.parseInt(second[0]) * 60 + Integer.parseInt(second[1]));
            //System.out.println("time : " + time);
            String m_list = "";
            int sync = 0;
            music[3] = music[3].replace("C#","c").replace("D#","d").replace("F#","f").replace("G#","g").replace("A#","a");
            
            while(m_list.length() != time){
                if(sync!= 0 && sync%music[3].length() == 0){
                    sync = 0;
                }
                m_list += music[3].charAt(sync);
                sync++; 
            }
            //System.out.println(m_list);
            if(m_list.contains(m)){             
                    if(max<time){
                        max = time ;
                      answer =  music[2];  
                    }else{continue;}
            }      
        }
            if(answer.length() == 0){
                answer = "(None)";
            }
            return answer;
    }
}