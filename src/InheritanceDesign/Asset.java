public abstract class Asset()
{
	// members
	private String name;
	
	// methods
	public abstract String getAssetValue();
		// constructor
	public Asset(String name)
	{
		setName(name);
	}
		// mutator
	public void setName(String name)
	{
		this.name = name;
	}
		// accessor
	public String getName()
	{
		return this.name;
	}
}
