package wapio.design_pattern.adapter.succession;

public class Main {
	
	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printStrong();
		p.printWeak();
	}
}
