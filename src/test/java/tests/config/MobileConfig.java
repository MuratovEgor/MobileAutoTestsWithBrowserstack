package tests.config;

import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.LoadType.MERGE;

@Config.LoadPolicy(MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/remote.properties"
})

public interface MobileConfig extends Config {

    @Key("user")
    String getBrowserStackUser();

    @Key("key")
    String getBrowserStackKey();

}