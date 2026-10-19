import java.util.HashMap;
class Solution {
    public int romanToInt(String s) {
      
        HashMap<Character,Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);

        int k = s.length() -1;
        int l=0 ;
        int sum = 0 ;
         
         if(s.length()==1){
          int current =roman.get(s.charAt(l));
          return current;  
         }
        while(l<k){
            int current =roman.get(s.charAt(l));
            int next = roman.get(s.charAt(l+1)) ; 
            if(current >= next){
                sum = sum + current ; 
                l= l+1;
            }

            else {
                sum = sum + next- current ;
                l= l+2;
            }

            if(l==k){
              sum=sum+  roman.get(s.charAt(l));
            }
        }
              return sum ;
    }
}