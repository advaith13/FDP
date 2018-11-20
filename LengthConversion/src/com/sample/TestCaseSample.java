package com.sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseSample {
	Feet ft;
	Meter mt;
	Inch in;
	
	
	@BeforeEach
	void setup()
	{
		 ft=new Feet();
		 mt=new Meter();
		 in=new Inch();
		 ft.setData(2);
		 mt.setData(2);
		 in.setData(2);
		 
	}
	@Test
	void testObject()
	{
		
		assertNotNull(ft,"Check 1");
		assertNotNull(mt,"Check 2");
		assertNotNull(in,"Check 3");
		
	}
	
	@Test
	void testMeterConversion()
	{
		
		assertEquals(0.6096, mt.feet2Meter(ft.getData()));
		assertEquals(0.0508, mt.inch2Meter(in.getData()));
	}
	
	@Test
	void testFeetConversion()
	{
		
		assertEquals(6.5616798, ft.meter2Feet(mt.getData()));
		assertEquals(0.16666666, ft.inch2Feet(in.getData()));
	}
	@Test
	void testInchConversion()
	{
		
		assertEquals(24, in.feet2Inch(ft.getData()));
		assertEquals(78.7401574, in.meter2Inch(mt.getData()));
	}
	
}
