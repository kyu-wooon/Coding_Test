import java.util.*;
class Solution {
    public static Map<Integer, Integer> map = new HashMap <>();
    public static List<int[]> sale_list = new ArrayList<>();
    static int[] arr; // 뽑을 기준 배열
    static int n; // 기준 배열 길이
    static int dupPerCount; // 중복순열 갯수
    static int num; //뽑을 갯수
    public int[] solution(int[][] users, int[] emoticons) {
        int[] answer = new int[2];
        arr = new int[] {10,20,30,40};
        n = arr.length; 
        num = emoticons.length;
        dupPermutation(new ArrayList<Integer>(), num);
        
        for(int i =0; i<sale_list.size(); i++){
            int emote = 0;
            int final_price = 0;
            for(int j = 0; j<users.length; j++){
                int all = 0;
                int[] sale_arr = sale_list.get(i);
                for(int p = 0; p<sale_list.get(i).length; p++){
                    if(users[j][0]<= sale_arr[p]){
                        all+= emoticons[p] /100 * (100-sale_arr[p]);
                    }
                }
                if(users[j][1]<=all){
                    all = 0;
                    emote++;
                }else{
                    final_price +=all;
                    all=0;
                }
            }
            if(map.get(emote) == null){
                map.put(emote, final_price);
            }else{
                if(map.get(emote)<final_price){
                    map.put(emote, final_price);
                }
            }
            
        }
        
        /*
        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.reverse(keySet);
        
        answer[0] = keySet.get(0);
        answer[1] = map.get(keySet.get(0));
        */
        
        answer[0] = Integer.MIN_VALUE;
        answer[1] = Integer.MIN_VALUE;
        
        for(int i : map.keySet()){
          if(answer[0]<i){
              answer[0] = i;
              answer[1] = map.get(i);
          }  
          else if(answer[0] == i){
              if(answer[1]<map.get(i)){
            answer[0] = i;
              answer[1] = map.get(i);
              }
          }
        }

        return answer;
    }
    
    public static void dupPermutation(ArrayList<Integer> list, int count) {
		// 다 뽑았을 때
		if (count == 0) {
			//System.out.println(list);
            int[] sale_arr = new int[list.size()];
            for(int i = 0 ; i<list.size(); i++){
                sale_arr[i] = list.get(i);
            }
            sale_list.add(sale_arr);
			dupPerCount++;
			return;
		}
		
		for(int i = 0; i < n; i++) {
			list.add(arr[i]);
			dupPermutation(list, count - 1); // 뽑을 때 마다 count - 1
			list.remove(list.size() - 1); // 재귀 위해 마지막에 넣은 원소 제거 
		}
	}
}