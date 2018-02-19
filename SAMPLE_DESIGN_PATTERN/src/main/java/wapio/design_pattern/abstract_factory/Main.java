package wapio.design_pattern.abstract_factory;

import wapio.design_pattern.abstract_factory.factory.Factory;
import wapio.design_pattern.abstract_factory.factory.Link;
import wapio.design_pattern.abstract_factory.factory.Page;
import wapio.design_pattern.abstract_factory.factory.Tray;

public class Main {
	
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage: java Main class.name.of.ConcreateFactory");
			System.out.println("Example 1: java Main listfactory.ListFactory");
			System.out.println("Example 2: java Main tablefactory.TableFactory");
			System.exit(0);
		}
		
		Factory factory = Factory.getFactory(args[0]);
		
		Link asahi = factory.createLink("朝日新聞", "http://www.asahi.com/");
		Link yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp/");
		Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
		
		Link jp_yahoo = factory.createLink("Yahoo!Japan", "htpp://www.yahoo.co.jp/");
		Link excite = factory.createLink("Excite", "http://www.excite.com/");
		Link google = factory.createLink("Google", "http://www.google.com/");
		
		Tray traynews = factory.createTray("新聞");
		traynews.add(asahi);
		traynews.add(yomiuri);
		
		Tray trayyahoo = factory.createTray("Yahoo!");
		trayyahoo.add(us_yahoo);
		trayyahoo.add(jp_yahoo);
		
		Tray traysearch = factory.createTray("サーチエンジン");
		traysearch.add(trayyahoo);
		traysearch.add(excite);
		traysearch.add(google);
		
		Page page = factory.createPage("LinkPage", "結城　浩");
		page.add(traynews);
		page.add(traysearch);
		page.output();
	}
}
