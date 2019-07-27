package PremitiveDataTypes;

import java.math.BigDecimal;

public class doubleValueAdding {

	public static void main(String[] args) {
		
		
		double doubleValue = 0.2;
		 double total = doubleValue+doubleValue+doubleValue;
		 System.out.println(total);
		
		 
		 
		 String str = "0.2";
		 
		 BigDecimal BigDec1 = new BigDecimal(str);
		 BigDecimal BigDec2 = new BigDecimal(str);
		 BigDecimal BigDec3 = new BigDecimal(str);
		 
		 BigDec1 = BigDec1.add(BigDec2).add(BigDec3);
		 System.out.println(BigDec1);
		

	}

}
