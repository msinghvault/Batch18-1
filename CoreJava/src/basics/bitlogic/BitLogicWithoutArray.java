package basics.bitlogic;
class BitLogicWithoutArray {
	public static void main(String args[]) {
		int a = 3; // 0 + 2 + 1 or 0011 in binary
		int b = 6; // 4 + 2 + 0 or 0110 in binary

		int c = a | b;
		int d = a & b;
		int e = a ^ b;
		int f = (~a & b) | (a & ~b);
		int g = ~a & 0x0f; // 0x0f is the hexadecimal representation for 15
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(d);
	}
}