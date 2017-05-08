package com.sunyong.spairy.common;

import java.math.BigDecimal;

public class NumberUtils
{
	public static double add(final double value1, final double value2)
	{
		final BigDecimal b1 = new BigDecimal(value1);
		final BigDecimal b2 = new BigDecimal(value2);
		return b1.add(b2).doubleValue();
	}

	public static BigDecimal add(final BigDecimal b1, final Double value2)
	{
		final BigDecimal b2 = new BigDecimal(null == value2 ? 0d : value2.doubleValue());
		return b1.add(b2);
	}

	public static double sub(final double value1, final double value2)
	{
		final BigDecimal b1 = new BigDecimal(value1);
		final BigDecimal b2 = new BigDecimal(value2);
		return b1.subtract(b2).doubleValue();
	}

	public static BigDecimal sub(final BigDecimal b1, final Double value2)
	{
		final BigDecimal b2 = new BigDecimal(null == value2 ? 0d : value2.doubleValue());
		return b1.subtract(b2);
	}
	
	public static double mul(final double v1, final double v2){   
		BigDecimal b1 = new BigDecimal(Double.toString(v1));   
		BigDecimal b2 = new BigDecimal(Double.toString(v2));   
		return b1.multiply(b2).doubleValue();   
	} 
	
	public static BigDecimal mul(final BigDecimal b1, final double v2) {
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.multiply(b2);
	} 
	
}
