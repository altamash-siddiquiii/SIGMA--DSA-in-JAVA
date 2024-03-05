public class Prblm12_RmvDuplicate {
    public static void main(String[] args) {
        
        // Problem 12 : Remove all Duplicates in a String
        String str = "altatamamash";
        rmvDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
    public static void rmvDuplicates(String str, int index, StringBuilder newStr, boolean map[]) {
        // Base Case
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }
        // Store current character
        char currChar = str.charAt(index);
        // Checking that currChar exists in the map array or not
        if (map[currChar-'a'] == true) {
            // Duplicate found
            rmvDuplicates(str, index+1, newStr, map);
        }
        else {
            // No duplicate found
            map[currChar-'a'] = true;
            rmvDuplicates(str, index+1, newStr.append(currChar), map);
        }
    }
}