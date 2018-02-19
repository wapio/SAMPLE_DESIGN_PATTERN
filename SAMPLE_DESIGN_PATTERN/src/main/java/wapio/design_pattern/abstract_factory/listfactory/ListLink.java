package wapio.design_pattern.abstract_factory.listfactory;

import wapio.design_pattern.abstract_factory.factory.Link;

public class ListLink extends Link {

	public ListLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHTML() {
		return " <li><a fref=\"" + url + " \">" + caption + "</a></li>\n";
	}
	
}
