package Phase2_Junit.Phase2_Junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;
public class ToStringArgumentCoverter extends SimpleArgumentConverter {
	@Override
	protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException {
		
		Assertions.assertEquals(String.class, targetType, "Can only convert to String");
		
		return String.valueOf(source);
	}
}
