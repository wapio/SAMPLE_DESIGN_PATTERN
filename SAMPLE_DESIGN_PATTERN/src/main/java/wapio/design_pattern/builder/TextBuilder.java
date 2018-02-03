package wapio.design_pattern.builder;

public class TextBuilder extends Builder {
	
	private StringBuilder sb = new StringBuilder();
	
	public void makeTitle(String title) {
		sb.append("===========================\n");
		sb.append(" 『" + title + "』\n");
		sb.append("\n");
	}
	
	public void makeString(String str) {
		sb.append('■' + str + "\n");
		sb.append("\n");
	}
	
	public void makeItems(String[] items) {
		for (int i = 0; i < items.length; i++) {
			sb.append(" ・" + items[i] + "\n");
		}
		sb.append("\n");
	}
	
	public void close() {
		sb.append("===========================\n");
	}
	
	public String getResult() {
		return sb.toString();
	}

	@Override
	public void flash() {
		// TODO Auto-generated method stub
	}
}
