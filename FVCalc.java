// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		int total =Integer.parseInt(args[0]);
		double p =Double.parseDouble(args[1]);
		int y =Integer.parseInt(args[2]);
		double tp = 1+ (double)p/100 ;
		System.out.println(tp);
		double revach = Math.pow(tp, y);
		System.out.println(revach);
		double totalafter = revach*total;
		System.out.println("After "+ y + " years, a $" + total + " saved at " + p +"% will yield $" + ((int)totalafter)  );

		
	}
}