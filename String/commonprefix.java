import java.util.*;

class commonprefix1 {
    String commonprefix2(String[] arr) {
        if (arr == null || arr.length == 0) return ""; // Good practice guard clause
        
        StringBuilder ans = new StringBuilder();
        Arrays.sort(arr);
        
        char[] first = arr[0].toCharArray();
        char[] last = arr[arr.length - 1].toCharArray();

        // FIX 3: Safe loop boundary. Ensure 'i' never exceeds the shorter string's length
        int minLength = Math.min(first.length, last.length);

        for (int i = 0; i < minLength; i++) {
            // FIX 1: Break when they DO NOT match (!=)
            if (first[i] != last[i]) {
                break; 
            }
            // FIX 2: Append only when they DO match
            ans.append(first[i]);
        }
        return ans.toString();
    }
}

public class commonprefix {
    public static void main(String[] args) {
        // Note: For {"apple", "banana", "watermelon"}, sorting makes:
        // first = "apple", last = "watermelon". 
        // 'a' != 'w', so it will correctly return an empty string "".
        String[] s = {"apple", "banana", "watermelon"};
        commonprefix1 obj = new commonprefix1();
        System.out.println("Result: " + obj.commonprefix2(s)); 
    }
}