public class Qs5 {
    public static void main(String[] args) {
        // Qs 5 : Tower of Hanoi
        int n = 3;
        towerOfHanoi(n, 'A', 'B', 'C');
        TOH(2, "Source", "Helper", "Destination");
    }
    public static void towerOfHanoi(int n, char source, char helper, char destination) {
        if (n == 1) { // Base Case
            System.out.println("Transfer disk " + n + " from " + source + " to " + destination);
            return;
        }
        // Transfer top n-1 from source to helper using destination as 'helper'
        towerOfHanoi(n-1, source, destination, helper);
        // Transfer nth from source to destination
        System.out.println("Transfer disk " + n + " from " + source + " to " + destination);
        // Transfer n-1 from helper to destination using source as 'helper
        towerOfHanoi(n-1, helper, source, destination);
    }
    public static void TOH(int m, String from, String mid, String to) {
        if (m == 1) {
            System.out.println("Move disk " + m + " from " + from + " to " + to);
            return;
        }
        TOH(m-1, from, to, mid);
        System.out.println("Move disk " + m + " from " + from + " to " + to);
        TOH(m-1, mid, from, to);
    }
}