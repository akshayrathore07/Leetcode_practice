class Solution {
    public boolean compare(String haystack, String needle, int idx) {
        int n1 = haystack.length();
        int n2 = needle.length();
        if (idx + n2 > n1)  
            return false;
        for (int i = 0; i < n2; i++) {
            if (haystack.charAt(idx++) != needle.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty())
            return 0;

        int n1 = haystack.length();
        for (int i = 0; i < n1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (compare(haystack, needle, i)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
