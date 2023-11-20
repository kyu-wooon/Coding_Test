import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Deque<String> cache = new ArrayDeque<>();
        for(int i = 0; i<cities.length; i++){
            if(cacheSize == 0){
                answer +=5;continue;
            }
            int size = cache.size();
            String city = cities[i].toUpperCase();
            cache.removeLastOccurrence(city);
            if(cache.size() != size){
                answer +=1;
                cache.addLast(city);
            }else{
                if(cache.size() == cacheSize){
                    cache.removeFirst();
                }
                answer +=5;
                cache.add(city);
            }
            }
        return answer;
    }
}