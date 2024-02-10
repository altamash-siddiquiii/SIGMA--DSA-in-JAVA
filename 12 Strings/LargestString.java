public class LargestString {
    public static void main(String[] args) {
        // Question 3 of lectures
        // Find Largest String (LexicoGraphicOrder)
        String fruits[] = {"Apple", "Airoplane", "Banana", "Boy", "Mango", "Monkey"};

        String largest = fruits[0]; // Assuming that first is largest string
        String smallest = fruits[0]; // Assuming that first is smallest string

        for (int i=1; i<fruits.length; i++) {

            if (largest.compareToIgnoreCase(fruits[i]) < 0) { // It ignored upper/lower Case
                largest = fruits[i];
            }
            else if (smallest.compareTo(fruits[i]) > 0) { // It understood different to all Cases
                smallest = fruits[i];
            }
        }
        System.out.println("Largest is " + largest);
        System.out.println("Smallest is " + smallest);
    }
}