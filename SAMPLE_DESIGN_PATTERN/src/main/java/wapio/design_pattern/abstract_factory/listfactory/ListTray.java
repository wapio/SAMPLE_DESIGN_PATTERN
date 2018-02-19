package wapio.design_pattern.abstract_factory.listfactory;

import java.util.Iterator;

import wapio.design_pattern.abstract_factory.factory.Item;
import wapio.design_pattern.abstract_factory.factory.Tray;

public class ListTray extends Tray {

	public ListTray(String caption) {
		super(caption);
	}

	@Override
	public String makeHTML() {
		StringBuilder sb = new StringBuilder();
		sb.append("<li>\n");
		sb.append(caption + "\n");
		sb.append("<ul>\n");
		Iterator<Item> ite = tray.iterator();
		while (ite.hasNext()) {
			Item item = (Item) ite.next();
			sb.append(item.makeHTML());
		}
		sb.append("</ul>\n");
		sb.append("</li>\n");
		return sb.toString();
	}
}
