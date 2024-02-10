import java.util.*;
public class CreationOfStrings {
    public static void main(String[] args) {
        
        // Creation Of Strings-
        String str = "abcd"; // 1st Method
        String str2 = new String("ABCD"); // 2nd Method

        // Input
        Scanner sc = new Scanner(System.in);
        String name;
       // name = sc.next(); // for a single word
       name = sc.nextLine(); // for multiple words
        // Output (print)
        System.out.print(name);
    }
}