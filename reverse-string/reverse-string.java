class Solution {
    public void reverseString(char[] s) {
       String sString = String.valueOf(s);
        StringBuilder rev = new StringBuilder(sString);
        rev.reverse();
        for(int i=0;i<rev.length();i++){
            s[i] = rev.charAt(i);
        }
    }
}