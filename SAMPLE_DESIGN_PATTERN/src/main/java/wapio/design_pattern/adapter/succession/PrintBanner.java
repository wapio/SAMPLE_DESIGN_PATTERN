package wapio.design_pattern.adapter.succession;

public class PrintBanner extends Banner implements Print{
	
	public PrintBanner(String string) {
		super(string);
	}

	public void printWeak() {
		showWithParen();
		
	}

	public void printStrong() {
		showWithAster();
	}
}
