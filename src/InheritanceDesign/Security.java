public abstract class Security() extends Asset
{
	private double price;
	private int quantity;
	private String ticker;
	
	public Security(String name, String ticker, double price, int quantity)
	{
		super(name);
		
		this.ticker = ticker;
		this.price = price;
		this.quantity = quantity;
	}
}
