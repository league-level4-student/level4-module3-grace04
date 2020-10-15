package _01_introduction;

public class CustomException extends Exception {
	void terminate() {
		System.out.println("THE TERMINATOR");
		System.exit(0);
	}
}
