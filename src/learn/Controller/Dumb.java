package learn.Controller;

public class Dumb
{
	private int blerg;
	private Car myCar;
	
	public Dumb(int blerg)
	{
		this.blerg = blerg;
		myCar = new Car();
	}
	
	public Car getMyCar()
	{
		return myCar;
	}
	
	public void setBlerg(int blerg)
	{
	this.blerg = blerg;			
	}

	public int getBlerg()
	{
	return blerg;
	}
}
