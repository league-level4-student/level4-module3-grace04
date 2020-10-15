package _02_gotta_catchem_all;

public class ExceptionMethods {
	double divide(double x, double y) {
		if(y==0) {
			throw new IllegalArgumentException();
		}
		double q = x/y;
		return q;
	}
	
	String reverseString(String s) {
		if(s.isEmpty()) {
			throw new IllegalStateException();
		}
		String r = "";
		for(int i=s.length()-1;i>-1;i--) {
			r += s.charAt(i);
		}
		return r;
	}
}
