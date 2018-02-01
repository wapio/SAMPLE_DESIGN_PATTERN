package wapio.design_pattern.protype.framework;

public interface Product extends Cloneable {

	public abstract void use(String s);
	
	public abstract Product createClone();
}
