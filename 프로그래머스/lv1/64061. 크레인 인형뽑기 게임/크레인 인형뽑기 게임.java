import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
      
        
        
        for(int i = 0 ; i<moves.length; i++){
            
            for(int j = 0; j<board.length ; j++){
                
           
                    if(board[j][moves[i]-1] != 0){
                    stack.push(board[j][moves[i]-1]);
                       
                        board[j][moves[i]-1] = 0;
                       
                        int pop = stack.pop();
                        
                        if(stack.size() != 0 && stack.peek() == pop){
                            stack.pop();
                            answer = answer+2;
                        }else{stack.push(pop);}
                    
                    break;  
                }
                
                
            }
            
            
        }
        
        for(int str: stack)
			System.out.print(str + " ");
		
        
        
        return answer;
    }
}