package javacoffee.order;

//Ezrela Amoako EBA190002
/*
 * Drink class holds the components for each drink
 */
public class Drink {
	protected String type;
	protected String flavor;
	protected String [] addOns;
	
	public Drink() {}
	
	public Drink(String t, String f, String [] a)
	{
		type = t;
		flavor = f;
		addOns = new String [a.length];
		
		for(int i = 0; i < a.length; i++)
		{
			addOns[i] = a[i];
		}
		
	}
	
	public String getType()
	{
		return type;
	}
	
	public String getFlavor()
	{
		return flavor;
	}
	
	public String [] getaAddOns()
	{
		return addOns;
	}
	
	public void setType(String t)
	{
		type = t;
	}
	
	public void setFlavor(String f)
	{
		flavor = f;
	}
	
	public void setAddOns(String [] a)
	{
		addOns = a;
	}
	
	
	

}
