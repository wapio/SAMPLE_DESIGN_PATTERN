package wapio.design_pattern.factory_method.idcard;

import java.util.ArrayList;
import java.util.List;

import wapio.design_pattern.factory_method.framework.Factory;
import wapio.design_pattern.factory_method.framework.Product;

public class IDCardFactory extends Factory {
	
	private List<String> owners = new ArrayList<String>();
	
	private int lastNumber = 0;

	@Override
	protected synchronized Product createProduct(String owner) {
		return new IDCard(owner, ++lastNumber);
	}

	@Override
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}
	
	public List<String> getOwners() {
		return owners;
	}
}
