import javax.sql.rowset.spi.SyncResolver;

public class Operations {
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;

        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;

        return n | bitMask;
    }
    public static int clearthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n, int i, int newBit) {
        // First Method with the help of set and clear ith bit functions
       /* if (newBit == 0) {
            return clearthBit(n, i);
        } else {
            return setIthBit(n, i);
        } */
         n = clearthBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }
    public static int clearLastIthBit(int n, int i) {
        int bitMask  = n << i; // We can also use (~0)<<i and -1<<i
        return n & bitMask;
    }
    public static int clearRangeIthBit(int n, int i, int j) {
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static boolean checkPowerOfTwo(int n) {   
        // return (n & (n-1)) == 0; // This single linee will only show true and false

        if ((n & (n-1)) == 0) {
            System.out.println(n + " is a Result of Power of 2");
            return true;
        } else {
            System.out.println(n + " is not a Result of Power of 2");
            return false;
        }
    }
    public static int countSetBits(int n) {
        int count = 0; // initialize in starting
        while (n > 0) { // till the end
            if ((n & 1) != 0) { // check our LSB
                count++; // if not  equal to 0 then count
            }
            n = n>>1; // atfer all operations decrease number by right shift
        }
        return count; // print count
    }
    public static int fastExpo(int n, int p) {
        int ans = 1; // initialize in starting, why 1 bcz they multiply with n
        while (p > 0) { // till the power end
            if ((p & 1) != 0) { // checking our LSB in power
                ans = ans * n; // multiply with number
            }
            n = n * n; // for next time, square number
            p = p >> 1; // decreasing the value while poweer not ending
        }
        return ans; // print total answer
    }
    public static void main(String[] args) {
        // Operations

        // Get Ith Bit(Finding the ith position's value, This mean Getting value)
        System.out.println("Get Ith Bit(ith index's no.) : " + getIthBit(10, 1));

        // Set Ith Bit (Put ONE on the ith position, This mean Set the value)
        System.out.println("Set Ith Bit(no. in decimal) : " + setIthBit(10, 0));

        // Clear Ith Bit (Put ZERO on the ith position, This mean Clear and Set)
        System.out.println("Clear Ith Bit(no. in decimal) : " + clearthBit(10, 3));

        // Update Ith Bit (Put the nrwBit on the ith position, This mean Update the ith position with the newBit)
        System.out.println("Update Ith Bit(no. in decimal) : " + updateIthBit(10, 1, 0));

        // Clear Last Ith Bit(Putting the ZERO on the last ith olaces, This mean Removing the last ith)
        // Clearing without index mean Removing from 1 index which i am seen
        System.out.println("Clear Last Ith Bit(no. in decimal) : " + clearLastIthBit(11, 2));

        // Clear Bits in Range(Putting the ZERO between the range, This mean Clearing the bits of in range)
        System.out.println("Clear Bits in Range(no. in decimal) : " + clearRangeIthBit(15, 1, 2));

        // Check if a number is Power of 2 or Not
        // System.out.println(checkPowerOfTwo(128)); // for only single line (true/false)
        checkPowerOfTwo(128);

        // Count Set Bits in a Number
        System.out.println("Count Set Bits(no. in counting) : " + countSetBits(11));

        // Fast Exponantiation
        System.out.println("Fast Exponantiatiion(no. in counting) : " + fastExpo(2, 10));
    }
}