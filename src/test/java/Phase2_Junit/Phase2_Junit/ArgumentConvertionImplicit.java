package Phase2_Junit.Phase2_Junit;

import java.time.temporal.ChronoUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
public class ArgumentConvertionImplicit {
	
	// source input = string
	// junit can implicitly change to a target type as TimeUnit
	
	@ParameterizedTest
	@ValueSource(strings = "SECONDS")
	public void testImplicitargumentConversion(ChronoUnit chronounit)
	{
		
		System.out.println(chronounit.name());
		Assertions.assertNotNull(chronounit.name());
		
	}
	
}
