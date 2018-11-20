package com.sample;

public class Inch implements InchConversion {
	
	double d;
	public double getData()
	{
		return d;
	}
	public void setData(double d)
	{
		this.d=d;
	}

	@Override
	public double meter2Inch(double d) {
		
		return d*39.3700787;
	}

	@Override
	public double feet2Inch(double d) {
		
		return d*12;
	}

	

}
