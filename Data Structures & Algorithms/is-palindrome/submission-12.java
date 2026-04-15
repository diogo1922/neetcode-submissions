class Solution {
    public boolean isPalindrome(String s) {
        
        int l= 0, r = s.length() - 1;

        while(l < r){

            while( l < r && !isNumOrAlpha(s.charAt(l))){
                l++;
            } 
            while( r > l && !isNumOrAlpha(s.charAt(r))){
                r--;
            }
            

            if(s.toLowerCase().charAt(l) != s.toLowerCase().charAt(r)){
                System.out.println("False");
                return false; 
            }
            
            l++;
            r--;
        }
        System.out.println("True");
        return true;
    }

     public static boolean isNumOrAlpha(char c){
        if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9') return true;
        return false;
        
    }
}
