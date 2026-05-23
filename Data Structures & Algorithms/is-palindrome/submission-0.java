class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        char[] coll = s.toCharArray();

        for (int i=0; i<coll.length; i++) {
            if (coll[i] == coll[(coll.length - 1) - i]) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }
}