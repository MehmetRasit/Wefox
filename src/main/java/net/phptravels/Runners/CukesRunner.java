package net.phptravels.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(

            features = "src/main/resources/Features",
            glue = "net/phptravels/stepDefinitions",
            dryRun =true,
            tags = "@a"
    )
    public class CukesRunner {
    }



