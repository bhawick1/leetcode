class Solution {
    public boolean isPalindrome(String s) {

        String rev = "";
        String copy = "";

        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                copy = copy + Character.toLowerCase(c);
            }
        }

       
        for (int i = copy.length() - 1; i >= 0; i--) {
            rev = rev + copy.charAt(i);
        }

        return rev.equals(copy);
    }
}