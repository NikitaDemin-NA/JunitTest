import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:Report1"},
        features = "src/test/features",
        glue = "ru.test.ru",
        tags = "@Test"
)
public class RunnerTest {
}