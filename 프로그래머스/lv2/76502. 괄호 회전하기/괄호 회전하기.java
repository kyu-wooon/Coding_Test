class Solution {
    public int solution(String s) {
        int answer = 0;
        String rp = s;
        String sc = s;
        for(int i = 0; i<s.length(); i++){
             //System.out.println(i + " 번째");

          if(i != 0){
               String ch = String.valueOf(sc.charAt(0));
              sc = sc.substring(1);
              sc = sc  + ch;
          }

              rp = sc.replaceAll("\\[\\]|\\(\\)|\\{\\}","");
        
            while(
              
                  rp.matches(".*\\(\\).*") == true ||
                rp.matches(".*\\[\\].*") == true ||
                rp.matches(".*\\{\\}.*") == true 
             )
            {
             
                rp = rp.replaceAll("\\(\\)", "");
                rp = rp.replaceAll("\\{\\}", "");
                rp = rp.replaceAll("\\[\\]", "");       
            }

            //System.out.println("replace 후 : " + rp);
               if(rp.length() == 0 ){
              //   System.out.println("깔끔~");
                  answer = answer+1;
              }else{ //System.out.println("남았다!");
               }
              
              
              
          
            
            
        }
        return answer;
    }
}