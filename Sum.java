class AddWithClass {

	public static int add(int a1, int a2, int a3, int a4, int a5){

		return a1+a2+a3+a4+a5;
	}
}

public class Sum {

	 public static int add(int b1, int b2, int b3, int b4, int b5){

	 	return b1+b2+b3+b5+b5;

	 }

	 public static void main(String[] args) {

	 	System.out.println("Sum : " + (Integer.parseInt(args[0])+Integer.parseInt(args[1])+Integer.parseInt(args[0])+
	 		Integer.parseInt(args[3])+Integer.parseInt(args[4]))); //without using single variable.



        
        System.out.println("Sum using function : " + add(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), 
        	Integer.parseInt(args[3]), Integer.parseInt(args[4]))); //using function.




        System.out.println("Sum using class : " + AddWithClass.add(Integer.parseInt(args[0]), Integer.parseInt(args[1]),
        	Integer.parseInt(args[2]), Integer.parseInt(args[3]), Integer.parseInt(args[4]))); //using class and method.
	 }
}