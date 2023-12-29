class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] letter = new int[26];

        for (char ch : s.toCharArray())
            letter[ch - 97]++;

        for (char ch : t.toCharArray())
            letter[ch - 97]--;

        for (int i : letter)
            if (i != 0)
                return false;

        return true;
    }
}
