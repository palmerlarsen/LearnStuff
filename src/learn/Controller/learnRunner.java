package learn.Controller;

public class learnRunner
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Dumb lloyd = new Dumb(0);
		Dumber harry = new Dumber();
		Dumbest george = new Dumbest();
				
		System.out.println("Let's test inheritance!");  
		
		System.out.println("Lloyd is dumb and his blerg is: " + lloyd.getBlerg());
		System.out.println("Harry is dumber and his blerg is: " + harry.getBlerg());
		
		harry.setBlerg(45);
		System.out.println("Harry is dumber and his blerg is: " + harry.getBlerg());
		System.out.println("Lloyd is dumb and his blerg is: " + lloyd.getBlerg());
		System.out.println("harry's car: " + harry.getMyCar());
		System.out.println("George's car: " + george.getMyCar());
	}

}
