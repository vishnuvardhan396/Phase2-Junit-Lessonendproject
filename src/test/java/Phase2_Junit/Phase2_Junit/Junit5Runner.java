package Phase2_Junit.Phase2_Junit;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


// Running multiple junit classes
//@RunWith(Suite.class)
@SuiteClasses({Phase2_Junit.Phase2_Junit.IncludeExcludeTags.class})
@IncludeTags({"feature1"})

public class Junit5Runner {

}
