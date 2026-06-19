import java.util.*;

class angram1 {
    boolean anagram2(String s, String t) {
        // 1. Quick length check
        if (s.length() != t.length()) {
            return false;
        }
        
        int freq[] = new int[26];

        // 2. Count frequencies using a single loop
        for (int i = 0; i < s.length(); i++) {
            // Process string s (add to frequency)
            char a = s.charAt(i);
            int char1 = a - 97; // 'a' - 'a' is 0, 'b' - 'a' is 1, etc. (More readable than 97)
            freq[char1] += 1;

            // Process string t (subtract from frequency)
            char b = t.charAt(i);
            int char2 = b - 97;
            freq[char2] -= 1;
        } 

        // 3. If they are anagrams, every single position in freq must be 0
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false; // Found a mismatch!
            }
        }

        return true; // Everything matched perfectly
    }
}

public class anagram2 {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "dcba";

        angram1 obj = new angram1();
        System.out.println(obj.anagram2(s, t)); // Will print true
    }
}