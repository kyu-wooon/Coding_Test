import java.util.*;
class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        int last_answer = -1;
        int count = 0; 
        String[][] board_2 = new String[board.length][board[0].length()];
        Set<int[]> set = new HashSet<>();
            for(int i = 0 ; i<board.length; i++){
                String[] tmp = board[i].split("");
                board_2[i] = tmp;
            }
        while(last_answer != answer){
            if(last_answer == -1){
                last_answer = 0;
            }else
            {last_answer = answer;}
            for(int i = 0; i<board_2.length-1; i++){
            for(int j = 0; j<board_2[i].length-1; j++){
                if(board_2[i][j] != " " && board_2[i][j].equals(board_2[i][j+1]) && 
                   board_2[i][j].equals(board_2[i+1][j]) &&
                   board_2[i+1][j].equals(board_2[i+1][j+1])){
                    int[] setadd = {i,j};
                    set.add(setadd);
                }
            }
        }
        for(int[] i : set){
            board_2[i[0]][i[1]] = ".";
            board_2[i[0]][i[1]+1] = ".";
            board_2[i[0]+1][i[1]] = ".";
            board_2[i[0]+1][i[1]+1] = ".";
        }
        for(int i = 0; i<board_2.length; i++){
        for(int j = 0; j<board_2[i].length; j++){
            if(board_2[i][j].equals(".")){
                board_2[i][j] = " ";
                answer++;
            }
        }}
        boolean change = true;
        while(change == true){
            change = false;
        for(int i = 0; i<board_2.length-1; i++){
        for(int j = 0; j<board_2[i].length; j++){
            if(board_2[i][j].equals(" ") == false && board_2[i+1][j].equals(" ")){
                board_2[i+1][j] = board_2[i][j];
                board_2[i][j] = " ";
                change = true;
            }
        }}
        }          
        count ++;
        set.clear();                      
        }
        return answer;
    }
}