class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int gcd = gcd(str1.length(),str2.length());
        return str2.substring(0,gcd);
    }

    private  int gcd(int n1,int n2){
        if(n2==0){
            return n1;
        }
        return gcd(n2, n1%n2);
    }
}