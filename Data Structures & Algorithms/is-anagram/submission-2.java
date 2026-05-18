class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;
        
        char[] fw = s.toCharArray();
        char[] sw = t.toCharArray();

        Arrays.sort(fw);
        Arrays.sort(sw);

        for (int i=0; i<fw.length; i++) {
            if(fw[i] != (sw[i])) {
                return false;
            }            
        }

        return true;
    }
}
