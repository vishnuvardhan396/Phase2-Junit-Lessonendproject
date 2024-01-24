/*@CSVSource

Way of store the data in the form of rows and columns
Simple way of storing the data

Example:

Toolname	version
Selenium	4
Postman	2
Jmeter		5
*/





package Phase2_Junit.Phase2_Junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class ParameterizedCSVsource {
	
	
	@ParameterizedTest(name = "CVS source {arguments}")
	@CsvSource({
		
		"Selenium , v4",
		"Junit , v5",
		"TestNG , v7",
		"JMeter , v5",
		"Postman , v2",
		
	})
	public void getdatafromCSV(String value1, String value2)
	{
		System.out.println(value1 + " : " + value2);
		
	}
}

