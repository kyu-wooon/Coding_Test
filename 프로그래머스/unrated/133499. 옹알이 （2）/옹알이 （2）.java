class Solution {
    public int solution(String[] babbling) {
        int answer = babbling.length;
        int bab[] = new int[babbling.length];


            for(int i = 0; i<babbling.length ; i++){
                int count = 0; 

                //System.out.println("변환 전 : " + babbling[i] );
                 babbling[i] = babbling[i].replaceAll("aya", "1");  
                 babbling[i] = babbling[i].replaceAll("ye", "2");   
                 babbling[i] = babbling[i].replaceAll("woo", "3");   
                 babbling[i] = babbling[i].replaceAll("ma", "4");
                //System.out.println("변환 후 : " + babbling[i] );


                for(int j = 0; j<babbling[i].length()-1; j++){
                    if(babbling[i].charAt(j) == babbling[i].charAt(j+1))
                    {
                     //System.out.println("연속성 부적합 : " + babbling[i] );
                      count--;
                    }else
                    {
                        //System.out.println("연속성 통과 : " + babbling[i] );
                    } 
                }


                     if(babbling[i].matches(".*[a-z].*"))
                    {
                      //System.out.println("순수성 부적합 : " + babbling[i]);
                      count--;
                    }
                    else
                    {
                        //System.out.println("순수성 적합 : " + babbling[i]);
                        }

               if(count<0){answer--;}



            }


        return answer;
    }
}