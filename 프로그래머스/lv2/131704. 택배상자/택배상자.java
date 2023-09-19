import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> list = new Stack<>();
        for(int i = order.length-1 ; -1 < i ; i--){
            list.add(order[i]);
        }
        //System.out.println(list.toString());
        
        int count = 0; 
        
        while(count <order.length){
            //boolean 
            //boolean if_container = true; 
            
            if(count+1 == list.peek()){
                answer++;
                list.pop();
                boolean ct = false;
                    while(ct == false && !stack.isEmpty()){
                            int po = stack.pop();
                             if(po == list.peek()){
                                 answer++;
                                 list.pop();
                             }else{
                                 stack.push(po);
                                 ct = true;
                                 break;
                             }
                        }                
            }else{
                if(!stack.isEmpty()){
                  int p = stack.pop();
                     if(p == list.peek()){
                         answer ++;
                         list.pop();
                         boolean cnt = false;
                        while(cnt == false && !stack.isEmpty()){
                            int po = stack.pop();
                             if(po == list.peek()){
                                 answer++;
                                 list.pop();
                             }else{
                                 stack.push(po);
                                 cnt =true;
                                 break;
                             }
                        }
                     }else{//리스트첫번째에도없고, 스택에도 없고 
                         stack.push(p);
                         stack.push(count+1);
                         
                     }
                }else{stack.push(count+1);}
            }
            //System.out.println("count : " + count);
            //System.out.println("order list : " + list.toString());
            //System.out.println("stack :" + stack.toString());
            
            

            count++;

        }
        return answer;
    }
}