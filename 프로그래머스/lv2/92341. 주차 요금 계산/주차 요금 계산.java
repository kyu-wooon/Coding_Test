import java.util.*; 
class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> map = new HashMap<>();
        Set<String> carnum_set = new HashSet<>();
        
        for(int i = 0; i< records.length; i++){
            carnum_set.add(records[i].substring(6,10));
        }
        List<String> carnum_list = new ArrayList<>(carnum_set);
        Collections.sort(carnum_list);
        
        int[] time_arr = new int[carnum_list.size()];
        int[] answer = new int[carnum_list.size()];
        Integer fee = 0;
        Integer time = 0;
        
        
        for(int i = 0 ; i < records.length; i++){
            
            if(records[i].charAt(11) == 'I'){
                
                time = 0;
                String min = records[i].substring(0,2);
                time = Integer.parseInt(min) * 60;
                min = records[i].substring(3,5);
                time += Integer.parseInt(min);
                
                String car_num = records[i].substring(6,10);
                


                
                map.put(car_num, time);
                
                
                
            }else if(records[i].charAt(11) == 'O'){
                fee = 0;
                time = 0;
                String min = records[i].substring(0,2);
                time = Integer.parseInt(min) * 60;
                min = records[i].substring(3,5);
                time += Integer.parseInt(min);
                String car_num = records[i].substring(6,10);
                time = time - map.get(car_num);
                map.remove(car_num);
                
                

                
                for(int j = 0; j<carnum_list.size(); j++){
                    
                    if(carnum_list.get(j).equals(car_num)){
                        time_arr[j] += time;
                        break;
                        
                    }
                }
                
                if(car_num.equals("0000")){

                    
                }


            }
            
        }
        

        
        
        
        for(int i = 0; i<carnum_list.size(); i++){
            
            if(map.containsKey(carnum_list.get(i)) == true){
                
                time = 1439 - map.get(carnum_list.get(i));
                time_arr[i] += time;
            }
            
        }
        
        for(int i = 0; i<time_arr.length; i++){
            fee = 0;
            time = time_arr[i];
              if(time<=fees[0]){
                    fee = fees[1];
                }else{
                    time = time-fees[0];
                    fee += fees[1];
                    fee +=time/fees[2] * fees[3];
                    if(0<time%fees[2]){
                        fee+= fees[3];
                    }
                }
            
            answer[i] += fee;
            
        }
        
        
      
        
        //System.out.println(map.toString());
        //System.out.println(carnum_list.toString());
        
        return answer;
    }
}