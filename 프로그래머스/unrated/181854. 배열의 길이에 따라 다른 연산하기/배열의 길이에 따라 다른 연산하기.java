class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
       
         if(arr.length%2!=0){
             for(int j = 0; j<arr.length; j=j+2){
                 arr[j] = arr[j]+n;
             }}
            else{ for(int j = 1; j<arr.length; j=j+2){
                 arr[j] = arr[j]+n;}}
            
        
        answer = arr;
        return answer;
    }
}