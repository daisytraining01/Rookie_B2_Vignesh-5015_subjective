package SubjRunnerClass;
import org.junit.runner.RunWith; 
import io.cucumber.junit.CucumberOptions; 
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\SubjFeatures", glue= {"SubStepDefinitons"}, monochrome=true, plugin = {"pretty", "html:target/facebo"})
public class subjregRun {

}
