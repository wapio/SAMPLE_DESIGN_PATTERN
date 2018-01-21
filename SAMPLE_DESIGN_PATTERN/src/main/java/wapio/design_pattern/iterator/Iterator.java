package wapio.design_pattern.iterator;

public interface Iterator {
	
	/**
	 * イテレータにおいて、
	 * 次の要素が存在することを確認してします。
	 * @return
	 */
	public abstract boolean hasNext();
	
	/**
	 * イテレータにおいて、次の要素を取得します。
	 * @return
	 */
	public abstract Object next();
}
