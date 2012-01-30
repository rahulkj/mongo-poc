package com.rahul.poc.domain;

import org.junit.Test;
import org.springframework.roo.addon.test.RooIntegrationTest;

@RooIntegrationTest(entity = Gender.class, transactional = false)
public class GenderIntegrationTest {

    @Test
    public void testMarkerMethod() {
    }
}
