package wapio.design_pattern.abstract_factory.tablefactory;

import java.util.Iterator;

import wapio.design_pattern.abstract_factory.factory.Item;
import wapio.design_pattern.abstract_factory.factory.Tray;

public class TableTray extends Tray {

	public TableTray(String caption) {
		super(caption);
	}

	@Override
	public String makeHTML() {
		StringBuilder sb = new StringBuilder();
		sb.append("<td>");
		sb.append("<table width=\"100%\" boder=\"1\"<tr>");
		sb.append("<td> bgcolor\"#cccccc\" align=\"center\" colspan\" " + tray.size() + "\"><b>" + caption + "</b><_td>");
		sb.append("</tr>\n");
		sb.append("<tr>\n");
		Iterator<Item> ite = tray.iterator();
		while (ite.hasNext()) {
			Item item = (Item) ite.next();
			sb.append(item.makeHTML());
		}
		sb.append("</tr></table>");
		sb.append("</td>");
		return sb.toString();
	}

}
