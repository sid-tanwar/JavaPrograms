import java.util.*;

public class Employee {

     public static void main(String args[]) {

         int bPay;
         int wHours;

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter The Base Pay : ");
         bPay = sc.nextInt();
         System.out.println("Enter The Working Hours : ");
         wHours = sc.nextInt();


        Pay p = new Pay();

        if (p.totalPay(bPay, wHours) != -1) {
            System.out.println("Your Total salaray: " + p.totalPay(bPay, wHours));

        } else {
            System.out.println("Error!Time Duration Exceeded");
        }
    }
}

class Pay {

	public double totalPay(int a, int b) {

		if(b<=40){

			return b*a;
        
        }else if(b>=40 && b<=60){

        	return (40*a) + ((b-40)*a*1.6);

        }else {

        	return -1;
        }

	
	}
}
