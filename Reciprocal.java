import java.util.*;

public class Reciprocal {
       
       public static void main (String[] args) {

            System.out.println("Enter the number upto which reciprocals should be added : "); 
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();

            double sum = 0;

            for (int i = 1; i <= n; ++i) {
                sum += 1d / i;
                if (i != n) {

                    System.out.print("1/" + i + " + ");
                
                } else {

                    System.out.print("1/" + i + " = " + sum);
                }
            }
        }
}
