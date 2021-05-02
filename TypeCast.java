public class TypeCast{
	
	public static void main(String[] args){

	 float z = 2.3f;

	 int x = 78;

	 double y = 221.2d;

	 System.out.println("int " + x + " =          " + "byte " + (byte) x);
	 System.out.println("double " + y + " =       " + "int " + (int) y);
	 System.out.println("double " + y + " =       " + "byte " + (byte) y);
	 System.out.println("int " + x + " =          " + "char " + (char) x);
	 System.out.println("float " + z + " =        " + "short " + (short) z);
	}
}