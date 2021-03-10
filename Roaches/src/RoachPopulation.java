
public class RoachPopulation {
	
	private double roachPop;
	private double sprayPct;
	
	public RoachPopulation (double initialPop) 
	{
		roachPop = initialPop;
	}
	
	public void breed() {
		roachPop = roachPop * 2;
	}
		
	public void spray(int sP)
	{
		sprayPct = sP * .01;
		roachPop = (roachPop - (roachPop * sprayPct));
	}
	public double getRoachPopulation() {
		return roachPop; 
			
}	
			
	
}
	
	


		
	








