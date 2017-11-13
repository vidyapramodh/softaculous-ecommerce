import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(features = "src/test/resources", tags = {"@search,@cart,@links,@subscribe,@logo,@dropdown"} ,plugin = {"html:output"})

    public class Runtest  {

    }

