package helpers;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"system:properties",
        "system:env",
        "file:src/main/resources/tests.properties"
})
public interface TestsProperties extends Config {
    @Config.Key("base.url")
    String baseUrl();

    @Config.Key("practice.form.url")
    String practiceFormUrl();

    @Config.Key("explicit.wait")
    long explicitWait();

    @Config.Key("implicity.wait")
    long implicityWait();

    @Config.Key("hold.browser.open")
    boolean holdBrowserOpen();
}



//    @Config.Key("element.spinner.notvisibility.timeout")
//    int spinnerNotVisibilityTimeout();
//
//    @Config.Key("element.explicity.wait.timeout")
//    int explicityWaitTimeout();
//
//    @Config.Key("element.scrolling.correction")
//    int scrollingCorrection();
//
//    @Config.Key("element.implicity.wait.timeout")
//    long implicitWaitTimeout();
//
//    @Config.Key("element.sript.wait.timeout")
//    long sriptWaitTimeout();
//}
