public class OOPS { // Public class is compulsary to run a java code with the help of "main" function
public static void main(String args[]) { // To run, in starting compiler finds "main" function
        // Created a pen Object called p1
        Pen p1 = new Pen(); // Pen() called Constructor
        p1.setColor("Red"); // Function call
        System.out.println(p1.color); // Print statement
        p1.setTip(5);
        System.out.println(p1.tip);
        // p1.setColor("Blue"); // Chenged color (for UPDATE)
        p1.color = "Blue"; // We can also write like this (for UPDATE)
        System.out.println(p1.color);

        NewPen p2 = new NewPen(); // Same New Object with Getters & Setters
        p2.setColor("Redd"); // Value using setters
        System.out.println(p2.getColor()); // Print using getters
        p2.setTip(5);
        System.out.println(p2.getTip());
        p2.setColor("Bluee");
        System.out.println(p2.getColor());

        BankAccount myAcc = new BankAccount(); // New Object
        myAcc.username = "altamash";
        System.out.println(myAcc.username);
        // myAcc.password = "alt123456"; //It'll not visible bcz they're private
        myAcc.setPassword("alt12345"); // it is accessible using function
        // System.out.println(myAcc.password); // also not visible at print time but can access using function
    }
}
class Pen { // Create all classes under the "public" class
    // Properties 
    String color;
    int tip;
    // Functions
    void setColor(String clr) {
        color = clr;
    }
    void setTip(int thickness) {
        tip = thickness;
    }
}
class BankAccount {
    // Properties
    public String username;
    private String password;
    // Function for password
    public void setPassword(String pswrd) {
        password = pswrd;
    }
}
// Getters and Setters :-
class NewPen {
    // Properties
    private String color;
    private int tip;
    // Getters
    String getColor() {
        return this.color;
    }
    int getTip() {
        return this.tip;
    }
    // Setters
    void setColor(String clr) {
        this.color = clr;
    }
    void setTip(int tip) { // external variable tip
        this.tip = tip; // this.tip is a property and right tip is an external variable
    }
}