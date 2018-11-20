package com.sample;

public class Feet implements FeetConversion {
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
	public double meter2Feet(double d) {
		
		return d*3.2808399;
	}

	@Override
	public double inch2Feet(double d) {
		
		return d*0.08333333;
	}

}
