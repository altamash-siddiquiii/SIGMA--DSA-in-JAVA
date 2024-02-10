public class LengthConcatination {
    public static void printLetters(String str) {
        // Loop for all letters print
        for (int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {
        
        // Length in Strings
        String Name = "Altamash Siddiqui";

        System.out.println(Name); // for print value
        System.out.println("Length is : " + Name.length()); // for length

        // String Concatinate (Concatination in Strings)
        String firstName = "Altamash";
        String lastName = "Siddiqui";
        String fullName = firstName + " " + lastName; // Concatinate

        System.out.println("Name : " + fullName);

        // String charAt Method
        String name = "Shaikh Altamash";

        System.out.println(name.charAt(7)); // char At index
        printLetters(name); // function call to print all letters
    }
}