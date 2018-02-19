package wapio.design_pattern.abstract_factory.listfactory;

import java.util.Iterator;

import wapio.design_pattern.abstract_factory.factory.Item;
import wapio.design_pattern.abstract_factory.factory.Page;

public class ListPage extends Page {

	public ListPage(String title, String author) {
		super(title, author);
	}

	@Override
	public String makeHTML() {
		StringBuilder sb = new StringBuilder();
		sb.append("<html><head><title>" + title + "</title></head>\n");
		sb.append("<body>\n");
		sb.append("<h1>" + title + "</h1");
		sb.append("<ul>\n");
		Iterator<Item> ite = content.iterator();
		while (ite.hasNext()) {
			Item item = (Item) ite.next();
			sb.append(item.makeHTML());
		}
		sb.append("</ul>\n");
		sb.append("<hr><address>" + author + "</address>");
		sb.append("</body></html>\n");
		return sb.toString();
	}
	

}
