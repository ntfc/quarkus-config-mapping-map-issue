package org.acme;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;
import java.util.Map;

@ConfigMapping(prefix = "example")
public interface ExampleConfig {

    Map<String, Repository> repositories();

    interface Repository {
        String name();

        @WithDefault("config.yaml")
        String configFile();
    }
}
