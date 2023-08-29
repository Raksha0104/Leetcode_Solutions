class Solution {
    private int low, maxLen;
    public String longestPalindrome(String s) {
        if(s.length()<2){
            return s;
        }
        for(int i=0;i<s.length()-1;i++){
            forPalindrome(s,i,i); 
            forPalindrome(s,i,i+1); 
        }
        return s.substring(low,low+maxLen);
    }

    private void forPalindrome(String s, int j, int k){
        while(j>=0 && k<s.length()&& s.charAt(j)==s.charAt(k)){
            j--;
            k++;
        }
        if(maxLen < k-j-1){
            low = j+1;
            maxLen = k-j-1;
        }
    }
}