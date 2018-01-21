package wapio.design_pattern.iterator;

public interface Aggregate {
	
	/**
	 * 集合体に対応するイテレータオブジェクトを生成し、
	 * イテレータオブジェクトを返却します。
	 * @return イテレータオブジェクト
	 */
	public abstract Iterator iterator();
}
