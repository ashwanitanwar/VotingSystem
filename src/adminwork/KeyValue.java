package adminwork;

public class KeyValue<K,V> {

	private final K key;
	private V value;
	
	public KeyValue(K key,V value)
	{
		this.key=key;
		this.value=value;
	}
	
	public V getValue()
	{
		return value;
	}
	
	public K getKey()
	{
		return key;
	}
	
	public void setValue(V value)
	{
		this.value=value;
	}
}
