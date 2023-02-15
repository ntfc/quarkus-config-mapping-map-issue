package org.acme;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import io.quarkus.test.junit.QuarkusTest;
import javax.inject.Inject;
import org.junit.jupiter.api.Test;

@QuarkusTest
class ExampleConfigTest {

    @Inject
    ExampleConfig config;

    @Test
    void testWithDefaultProfile() {
        assertEquals(1, config.repositories().size());
        assertNotNull(config.repositories().get("default"));
        assertNull(config.repositories().get("local"));
    }

    @Test
    void testWithLocalProfile() {
        assertEquals(1, config.repositories().size());
        assertNull(config.repositories().get("default"));
        assertNotNull(config.repositories().get("local"));
    }
}
