package wapio.design_pattern.factory_method;

import wapio.design_pattern.factory_method.framework.Factory;
import wapio.design_pattern.factory_method.framework.Product;
import wapio.design_pattern.factory_method.idcard.IDCardFactory;

public class Main {
	
	public static void main(String[] args) {
		
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("aaaaa");
		Product card2 = factory.create("bbbbb");
		Product card3 = factory.create("ccccc");
		card1.use();
		card2.use();
		card3.use();
	}
}
