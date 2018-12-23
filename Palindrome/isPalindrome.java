class Solution {
    public boolean isPalindrome(int x) {
        //int to string
        //check odd or even
        //if it is even, then do substring and reverse to compare
        //if it is odd, then do substring until (stringlength/2)+1
        String s = String.valueOf(x);
        if(s.length() == 0 && s.length() == 1){
            return true;
        }
        else if (s.startsWith("-")){
            return false;
        }
        else if (s.length() == 2){
            char a = s.charAt(0);
            char b = s.charAt(1);
            if(a == b)
                return true;
            else
                return false;
        }
        else if (s.length() % 2 == 0){ //even number
            String a = s.substring(0,s.length()/2);
            //System.out.print(a);
            a = new StringBuffer(a).reverse().toString();
            String b = s.substring(s.length()/2,s.length());
            System.out.print(b);
            if(b.equals(a))
                return true;
            else
                return false;
        }
        else { //odd number
            String a = s.substring(0,s.length()/2+1);
            a = new StringBuffer(a).reverse().toString();
            String b = s.substring(s.length()/2,s.length());
            if(b.equals(a))
                return true;
            else
                return false;
        }
    }
}
