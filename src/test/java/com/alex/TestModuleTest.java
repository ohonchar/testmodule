package com.alex;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Slf4j
public class TestModuleTest {
    @Test
    public void testModuleMethod() {
        new TestModule().getPrinty();
        assertThat(true).isTrue().as("Should be ok");
    }
}
