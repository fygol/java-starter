package io.starter.java;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleTest {

    private static final Logger log = LoggerFactory.getLogger(SimpleTest.class);

    @Test
    public void testLogging() throws Exception {
        log.debug("logging test method");
    }
}
