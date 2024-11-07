// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
		int h= 0;
		int t = 0;
		int o =0;
		h = n/100;
		t = n/10;
		t= t%10;
		o= n%10;
		System.out.println(h + " hundreds, "+ t + " tens, and "+ o + " ones.");

	}
}
