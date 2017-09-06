package adminwork;

public class Map<K,V> {

	private int index;
	private KeyValue<K,V> entries[];
	private int size;
	
	public Map(int sizeOfArray)
	{
		this.entries=new KeyValue[sizeOfArray];
		this.size=0;
	}
	

	public void put(K key,V value)
	{
		
		for(int i=0;i<size;i++)
		{
			if(key.equals(entries[i].getKey()))
			{
				entries[i].setValue(value);
				return;
			}
			
		}
		
		entries[size]=new KeyValue(key,value);
		size++;
	}
	
	public V get(K key)
	{
		V value=null;
		for(int i=0;i<size;i++)
		{
			if(key.equals(entries[i].getKey()))
			{
				value= entries[i].getValue();
			}
		}
		
		return value;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public void viewKeyValue()
	{
		
		for(int i=0;i<size;i++)
		{
			//System.out.println("i: "+i);
			System.out.println(i+1+".\t"+entries[i].getKey()+"\t"+entries[i].getValue());
		}
	}
	
	/*public void viewKeyValueObject()
	{
		for(int i=0;i<size;i++)
		{
			//System.out.println("i: "+i);
			System.out.println("-----"+entries[i].getValue().printUserDetails());
		}
	}*/
	
	public KeyValue getEntries(int i)
	{
		return entries[i];
	}
	public boolean contains(K key)
	{
		//K checkKey=null;
		//boolean value=false;
		for(int i=0;i<size;i++)
		{
			if(key.equals(entries[i].getKey()))
			{
				return true;
			}
		}
		return false;
	}
	
	public K getKeyFromi(int i)
	{
		K key=entries[i].getKey();
		return key;
	}
}
