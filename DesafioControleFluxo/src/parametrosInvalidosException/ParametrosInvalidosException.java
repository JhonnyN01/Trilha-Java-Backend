package parametrosInvalidosException;

import java.util.Scanner;

public class ParametrosInvalidosException extends Exception{
	Scanner scanner = new Scanner(System.in);
	public ParametrosInvalidosException(String message) {
		super(message);
	}
	public Scanner getScanner() {
		return scanner;
	}
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}
	@Override
	public String toString() {
		return "ParametrosInvalidosException [scanner=" + scanner + "]";
	}

}
