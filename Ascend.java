// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int n = Integer.parseInt(args[0]);
		int a = (int)(Math.random()*n);
		int b = (int)(Math.random()*n);
		int c = (int)(Math.random()*n);
		System.out.println(a+" " + b +" "+ c);
		int min1 = Math.min(a,b);
		min1 =Math.min(min1, c);
		int max = Math.max(a, b);
		max= Math.max(max, c);
		 int mid = a + b + c;
		 mid  = mid- min1 - max;
		 System.out.println(min1 + " " + mid + " "+ max);





 

	}
}
