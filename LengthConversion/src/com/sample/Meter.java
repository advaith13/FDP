package com.sample;

public class Meter implements MeterConversion {

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
	public double feet2Meter(double d) {
		
		return d*0.3048;
	}
	@Override
	public double inch2Meter(double d) {
		
		return d*0.0254;
	}

	
	
	

}
