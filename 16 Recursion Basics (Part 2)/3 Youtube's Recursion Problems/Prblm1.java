public class Prblm1 {
    public static void main(String[] args) {
        // Problem 1 : Tower of Hanoi
        int n = 4;
        String from = "Source", mid = "Helper", to = "Destination";
        towerOfHanoi(n, from, mid, to);
    }
    public static void towerOfHanoi(int n, String from, String mid, String to) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from " + from + " to " + to);
            return;
        }
        towerOfHanoi(n-1, from, to, mid);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        towerOfHanoi(n-1, mid, from, to);
    }
}