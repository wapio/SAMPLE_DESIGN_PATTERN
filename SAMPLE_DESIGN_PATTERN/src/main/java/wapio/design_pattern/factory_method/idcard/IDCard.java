package wapio.design_pattern.factory_method.idcard;

import wapio.design_pattern.factory_method.framework.Product;

public class IDCard extends Product {

	private String owner;
	
	IDCard(String owner) {
		System.out.println(owner + "のカードを作ります。");
		this.owner = owner;
	}
	
	@Override
	public void use() {
		System.out.println(owner + "のカードを使います。");
	}
	
	public String getOwner() {
		return owner;
	}

}
