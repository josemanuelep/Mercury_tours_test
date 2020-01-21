package co.com.choucair.certification.mercurytours.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Mercury_tours.feature",
        tags = "@Tag3",
        glue = {"co.com.choucair.certification.mercurytours.stepsdefinitions", "co.com.choucair.certification.mercurytours.util"},
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
