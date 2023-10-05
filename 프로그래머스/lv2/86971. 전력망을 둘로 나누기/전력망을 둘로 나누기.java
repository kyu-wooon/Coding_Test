import java.util.*;
class Solution {
    public int solution(int n, int[][] wires) {
        int answer = -1;
        Set<Integer> set_1 = new HashSet<>();
        Set<Integer> set_2 = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        boolean[] visit = new boolean[wires.length];
        
        for(int i = 0 ; i<wires.length; i++){
            if(visit[i] == false){
                visit[i] = true;
                //System.out.println("i의 값 : " + i);
            }
            //System.out.println("끊어진 값 : " + wires[i][0] + ", " + wires[i][1]);
            set_1.add(wires[i][0]);
            set_2.add(wires[i][1]);
            int j = 0;

                    while(set_1.size() + set_2.size() != n){
                        if(j ==wires.length){
                            j = 0;
                        }
                        if(visit[j] == false){
                    if(set_1.contains(wires[j][0]) || set_1.contains(wires[j][1])){
                     set_1.add(wires[j][0]);
                     set_1.add(wires[j][1]);
                }else if(set_2.contains(wires[j][0]) || set_2.contains(wires[j][1])) {
                     set_2.add(wires[j][0]);
                     set_2.add(wires[j][1]);
                }
                    }
                        j++;

                }
                //set_2.remove(wires[j][0]);
            
            
            //System.out.println(i + " 번째 set_1 : "+ set_1.toString());
           //System.out.println(i + " 번째 set_2 : "+ set_2.toString());
            map.put(i, Math.abs(set_1.size() - set_2.size()));
            //System.out.println(set_1.toString());
            //System.out.println(set_2.toString());
            set_1.clear();
            set_2.clear();
            visit[i] = false;

        }
        
        //System.out.println(map.toString());
        int min = Integer.MAX_VALUE;
        for(int i : map.keySet()){
            if(map.get(i)<min){
                min = map.get(i);
            }
        }
        answer = min;
        return answer;
    }
    
    
    //public static void wireless()
}