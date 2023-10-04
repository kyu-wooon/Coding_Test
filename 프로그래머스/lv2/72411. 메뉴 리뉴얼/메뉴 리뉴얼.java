import java.util.*;

class Solution {
    
    public String[] solution(String[] orders, int[] course) {
        
        Set<String> set = new HashSet<>();
        for(int i = 0; i<orders.length; i++){
            String[] tmp = orders[i].split("");
            //Combination c = new Combination(tmp);
            for(int j = 2; j<=tmp.length; j++ ){
                Combination.combination(tmp, new boolean[tmp.length], 0, 0, j);
            }
            
        }
        //System.out.println(Combination.map.toString());
        
        for(int i = 0; i<course.length ; i++){
            int min = Integer.MIN_VALUE;
            for(String s : Combination.map.keySet()){
                if(course[i] == s.length()){
                    if(min<=Combination.map.get(s) && 2<=Combination.map.get(s)){
                    min = Combination.map.get(s);
                    set.add(s);
                    for(String k : Combination.map.keySet()){
                        if(course[i] == k.length()){{
                            if(Combination.map.get(k)<min){
                                set.remove(k);
                            }
                        }
                            
                        }
                    }
                    }

                }
            }
            
            
        }
        
        //System.out.println(set.toString());
        String[] answer = set.toArray(new String[0]);
        Arrays.sort(answer);
        //System.out.println(Arrays.toString(answer));
        return answer;
    }
}

class Combination{
    public static Map<String, Integer> map = new HashMap<>();
    public static void combination(String[] arr, boolean[] visited, int start, int depth, int r){
        Arrays.sort(arr);
        if(depth == r){
            String s = "";
            for(int i=0; i<arr.length; i++){
                if(visited[i]) s+=arr[i];
            }
            map.put(s, map.getOrDefault(s, 0) +1);
            //System.out.println();
            return;
        }
        for(int i=start; i<arr.length; i++){
            if(!visited[i]){
                visited[i] = true;
                combination(arr, visited, i+1, depth+1, r);
                visited[i] = false;
            }
        }
    }


    
    
}


/*
class Combination{
    public static Map<String, Integer> map = new HashMap<>();
    private String[] arr;     //기준 배열
    private Stack<String> st; //조합을 저장할 스택
    public Combination(String[] arr){
        this.arr = arr;             //배열을 받아 객체에 저장한다.
        st = new Stack<String>(); //스택에 메모리를 할당한다.    
    }
    public void showStack(){
        //스택에 있는 값들을 출력한다.
        String s = "";
        for(int i=0;i<st.size();i++){
           // System.out.print(st.get(i));
            s+=st.get(i);
        }
        map.put(s, map.getOrDefault(s, 0) +1);
      //  System.out.println("--");
    }
    
    
    
    
    
    
    public void doCombination(int n, int r, int index){
        // n : 전체 개수
        // r : 뽑을 개수
        // index 배열이다보니 현재 배열의 어디를 가리키고 있는지 필요하므로.
        if(r==0){ 
            //0개를 뽑는다는건 더 이상 뽑을 것이 없다는 말과 같으므로  스택을 출력하고 함수를 종료한다.
            showStack();
            return ;
        }
        else if(n==r){
            //nCr 이라는 건 나머지를 전부 뽑겠다는 말과 같으므로 전부 스택에 넣은 후 출력하면 된다.
            for(int i=0;i<n;i++)st.add(arr[index+i]);//index부터 n개를 차례대로 스택에 넣고
            showStack(); //스택을 보여준다.
            for(int i=0;i<n;i++)st.pop(); //이후 전부 pop을 시켜 다음 과정을 진행한다.
        }
        else{
            //저 두가지 예외 사항을 빼면 점화식대로 진행하면 된다.
             
            //index를 포함하는 경우
            st.add(arr[index]);
            doCombination(n-1,r-1,index+1); //index를 스택에 넣은상태로 index를 1옮겨 그대로 진행.
             
            //index를 포함하지 않는 경우
            st.pop(); //index를 제거해주고
            doCombination(n-1, r, index+1); //index를 제외한 상태에서 n-1Cr 진행. 
             
             
        }
    }*/
