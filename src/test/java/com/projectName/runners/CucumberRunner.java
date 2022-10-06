package com.projectName.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue="com/projectName/step_definitions",
        dryRun =false ,
        tags = "@add_car",
        publish = true

)
public class CucumberRunner {

}
