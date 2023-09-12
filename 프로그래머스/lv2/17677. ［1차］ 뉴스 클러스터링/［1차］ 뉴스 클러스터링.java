import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        List<String> arr1 = new ArrayList<>();
        List<String> arr2 = new ArrayList<>();
        int total = 0;
        
        // str1 리스트화 
        for(int i = 0; i<str1.length(); i++){
            if(i+1<str1.length()){
                String str = String.valueOf(str1.charAt(i))+String.valueOf(str1.charAt(i+1));
                if(str.matches("^[A-Z]*$")){arr1.add(str);}
            str = ""; 
            }
        }

        //str2 리스트화 
                for(int i = 0; i<str2.length(); i++){
            if(i+1<str2.length()){
                String str = String.valueOf(str2.charAt(i))+String.valueOf(str2.charAt(i+1));
            if(str.matches("^[A-Z]*$")){arr2.add(str);}
            str = ""; 
            }
        }  
        
        //정렬
        Collections.sort(arr1);
        Collections.sort(arr2);
        
        
        //교집합 크기 구하기 (리스트간 항목 비교)
        int index = 0; 
        int same = 0; 
        for(int i = 0; i<arr1.size(); i++){
            for(int j = index ; j<arr2.size(); j++){
                if(arr1.get(i).equals(arr2.get(j))){
                    same ++; 
                    index = j+1;
                    break;
                } 
            }
        }

        //System.out.println("arr1 : " + arr1.toString());
        //System.out.println("arr2 : " + arr2.toString());

        total = arr1.size() + arr2.size() - same; //합집합 구하기 

        //System.out.println("total : " + total);
        //System.out.println("same : " + same);

        double num = (double)same/(double)total* 65536;
        
        if(same == 0 && total == 0){
            answer = 65536;      
        }else{answer = (int)Math.floor(num);}

        return answer;
    }
}