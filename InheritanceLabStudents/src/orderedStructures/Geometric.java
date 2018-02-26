package orderedStructures;

import java.security.InvalidParameterException;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() throws IllegalStateException {
		if(super.getFlag()==false) 
			throw new IllegalStateException("First Value has not been executed.") ;
		current = current * commonFactor; 
		return current;
	}
public String toString(){
		
		return "Geom("+(int)this.firstValue()+","+(int)this.commonFactor+")";
	}
public double getTerm(int n) throws IndexOutOfBoundsException { 
	if (n <= 0) 
		throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 
	return current*n*(commonFactor); 
	
	}
}
