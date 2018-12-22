class Solution {
    public int reverse(int x) {
        String str = String.valueOf(x);
        try{
            if(str.startsWith("-")){
                String str1 = str.substring(1);
                StringBuilder res = new StringBuilder(str1).reverse();
                return Integer.parseInt("-"+res);
            }
            else{
            StringBuilder res = new StringBuilder(str).reverse();
            return Integer.parseInt(""+res);
            }
        }catch(NumberFormatException r){
            return 0;
        }
    }
}
