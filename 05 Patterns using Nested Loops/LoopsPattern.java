public class LoopsPattern {
    public static void main(String args[]) {

        // Print Star Pattern
      /*  for (int line=1; line<=4; line++) {
            for (int star=1; star<=line; star++) {
                System.out.print("*");
            } System.out.println();
        } */

        // Print Inverted Star Pattern
      /*  for (int line=1; line<=4; line++) {
            for (int star=1; star<=4-line+1; star++) {
                System.out.print("*");
            } System.out.println();
        } */

        // Print Number Pattern (Half-Pyramid Pattern)
       /* for (int line=1; line<=4; line++) {
            for (int nmbr=1; nmbr<=line; nmbr++) {
                System.out.print(nmbr);
            } System.out.println();
        } */

        // Print Character Pattern
      /*  char abc = 'A';
        for (int line=1; line<=4; line++) {
            for (int chln=1; chln<=line; chln++) {
                System.out.print(abc);
                abc++;
            } System.out.println();
        } */
    }
}