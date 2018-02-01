package wapio.design_pattern.factory_method.idcard;

import wapio.design_pattern.factory_method.framework.Product;

public class IDCard extends Product {

	private String owner;
	
	private int number;
	
	IDCard(String owner, int number) {
		System.out.println("No." + number + " " + owner + "のカードを作ります。");
		this.owner = owner;
		this.number = number;
	}
	
	@Override
	public void use() {
		System.out.println("No." + number + " " + owner + "のカードを使います。");
	}
	
	public String getOwner() {
		return owner;
	}
	
	public int getNumber() {
		return number;
	}
}
