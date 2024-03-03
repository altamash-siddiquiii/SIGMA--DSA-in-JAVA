public class XpowerOptimized {    
    public static void main(String[] args) {
        
        // Print X to the power n (Optimized 0(log n))
        System.out.println(optimizedPower(2, 20));
    }
    public static int optimizedPower(int x, int n) {

        if (n == 0) { // Base CAse
            return 1;
        }
        // Case 1 : For Even Case
        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;
        // CAse 2 : For Odd Case
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
}